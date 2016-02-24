package Study.Study;

/* На вход должна подаваться строка вида "2d6+1". 

Первого числа может не быть, оно строго положительно. 
Второе число идет сразу за буквой d и может принимать значения 4, 6, 8, 10, 12, 20, 100. 
Последнее число может быть любым, его может не быть. 
Знак +/-. 
Результат броска не может быть меньше 1. */


import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner diceIn = new Scanner(System.in);
		int dice, sides, sum = 0;
		
        System.out.print("Number of dice: ");
 		if (diceIn.hasNextInt() ) {
			dice = diceIn.nextInt();
			if (dice <= 0) {
				System.out.print("Error of entering!");
				return;			
			}
		} else {
			System.out.print("Error of entering!");
			return;
		}

        System.out.print("Number of sides: ");
 		if (diceIn.hasNextInt() ) {
			sides = diceIn.nextInt();
			if (sides <= 0) {
				System.out.print("Error of entering!");
				return;			
			}
			
		} else {
			System.out.print("Error of entering!");
			return;
		}
		
        System.out.print("Rolling " + dice + "d" + sides + ": ( ");
		
		Random diceRoll = new Random();
		int d;
		for (int i = 0; i < dice; i++) {
			d = diceRoll.nextInt(sides) + 1;
			if (sum == 0) { System.out.print(d); }
			else { System.out.print(" + " + d); }
			sum += d; 
		}
		
        System.out.print(" ) = " + sum);
	}
}