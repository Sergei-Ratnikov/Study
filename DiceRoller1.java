package Study.Study;

/* На вход должна подаваться строка вида "2d6+1". 

Первого числа может не быть, оно строго положительно. 
Второе число идет сразу за буквой d и может принимать значения 4, 6, 8, 10, 12, 20, 100. 
Последнее число может быть любым, его может не быть. 
Знак +/-. 
Результат броска не может быть меньше 1. 
"Input Error"
*/

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class DiceRoller {
	
	String diceInput;
	int dice, sides, modificator, sum;
	int[] diceTypes = {4, 6, 8, 10, 12, 20, 100};
	
	public int roller(String diceInput) {
		this.diceInput = diceInput;
	
		int d; // position of 'd' at the input string
		if (diceInput.indexOf('d') >= 0) {
			d = diceInput.indexOf('d');
		}
		else {
			System.out.print("Input error!");
			return -1;
		}

		// parser
		if (d  > 0) {
			try {
				dice = Integer.parseInt( diceInput.substring(0, d).trim() );
				if (dice <= 0) {
					System.out.print("Input error!");
					return -1;					
				}
			}
			catch (Exception e) {
				System.out.print("Input error!");
				return -1;
			}
			if ( dice <= 0) {
				System.out.print("Input error!");
				return -1;			
			}
		}
		else if (d  == 0) {
			dice = 1;
		}

		
		int sign = 0; // position of sign +/- at the input string
		if (diceInput.indexOf('+') > 1) {
			sign = diceInput.indexOf('+');
		}
		else if (diceInput.indexOf('-') > 1) {
			sign = diceInput.indexOf('-');
		}	
		
		// parser		
		if (sign == 0) {
			try {
				sides = Integer.parseInt(diceInput.substring( (d + 1), diceInput.length() ).trim() );
			}
			catch (Exception e) {
				System.out.print("Input error!");
				return -1;
			}
		}
		else {
			try {
				sides = Integer.parseInt(diceInput.substring( (d + 1), sign ).trim() );
				modificator = Integer.parseInt(diceInput.substring( (sign + 1), diceInput.length()).trim() );
			}
			catch (Exception e) {
				System.out.print("Input error!");
				return -1;
			}			
		}
	
		// checking sides - must be 4, 6, 8, 10, 12, 20 or 100
		boolean check = true;
		for (int i : diceTypes) {
			if (i == sides) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.print("Input error! Number of sides must be 4, 6, 8, 10, 12, 20 or 100.");
			return -1; }

		System.out.print("Result: (" );
		Random diceRoll = new Random();
		int die;
		for (int i = 0; i < dice; i++) {
			die = diceRoll.nextInt(sides) + 1;
			
			if (sum == 0) {
				System.out.print(die);
			}
			else { 
			System.out.print(" + " + die);
			}
			
			sum += die;
		}
			
		System.out.print(" )");

		if (sign != 0) {
			if (diceInput.charAt(sign) == '+') {
				System.out.print(" + " + modificator);
				sum += modificator;
			}
			else if ( (diceInput.charAt(sign) == '-') && sum > modificator ) {
				sum -= modificator;
				System.out.print(" - " + modificator);
			}
			else {
				System.out.print(" - " + (sum - 1) + " (minimum modificator) " );
				sum = 1; 
			}
		}
		return sum;
	}
}

public class DiceRoller1 {
    public static void main(String[] args) {
        
		DiceRoller roll = new DiceRoller();
		Scanner sc = new Scanner(System.in);

		System.out.print("Roll the dice! (example: 2d6+1) ");
		int sum = roll.roller( sc.nextLine() );
		if (sum > 0) {
			System.out.print(" = " + sum);
		}
		sc.close();
	}
}