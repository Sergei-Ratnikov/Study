package Study.Study;

/* На вход должна подаваться строка вида "2d6+1". 

Первого числа может не быть, оно строго положительно. 
Второе число идет сразу за буквой d и может принимать значения 4, 6, 8, 10, 12, 20, 100. 
Последнее число может быть любым, его может не быть. 
Знак +/-. 
Результат броска не может быть меньше 1. 
"Input Error"
*/

// http://www.quizful.net/post/Java-RegExp

import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;

class DiceRoller {
	
	public static boolean diceChecker(String diceInput){
		Pattern p = Pattern.compile("^([1-9](\\d+)?)?d(4|6|8|10|12|20|100)(['\\+'|'\\-'](([1-9](\\d+)?)?))?$");
							//     ([1-9](\\d+)?)?   d   (4|6|8|10|12|20|100)   (  ['\\+'|'\\-'] ( ([1-9](\\d+)?)?  )  )?
        Matcher m = p.matcher(diceInput);
        return m.matches(); 
	 }
	
	String diceInput;
	int dice, sides, modificator, sum;
	
	public int roller(String diceInput) {
		this.diceInput = diceInput;
		diceInput = diceInput.trim();
		if ( diceChecker(diceInput) ){
	
			int d = diceInput.indexOf('d'); // position of 'd' at the input string
			// parser
			if (d  > 0) {
				dice = Integer.parseInt( diceInput.substring(0, d) );
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
				sides = Integer.parseInt(diceInput.substring( (d + 1), diceInput.length() ) );
			}
			else {
				sides = Integer.parseInt(diceInput.substring( (d + 1), sign ).trim() );
				modificator = Integer.parseInt(diceInput.substring( (sign + 1), diceInput.length()) );
			}

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
		
		else {
			System.out.print("Input error!");
			return -1;
		}
	}
}

public class DiceRoller2 {
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