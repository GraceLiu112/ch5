import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int guess = in.nextInt();
		
		System.out.println("Your guess is: " + guess);	
		int difference = Math.abs(guess - number);
		if(guess > number){
			System.out.println("You were off by: " + difference);
			System.out.println("Your guess is too high");
		}
		else if(guess < number){
			System.out.println("You were off by: " + difference);
			System.out.println("Your guess is too low");
		}
		else{
			System.out.println("Your guess is correct");
		}
		if(guess != number){
		System.out.print("Type a number: ");
		guess = in.nextInt();
		System.out.println("Your guess is: " + guess);	
		difference = Math.abs(guess - number);
		guess(guess, difference, number);
		}
		if(guess != number){
		System.out.print("Type a number: ");
		guess = in.nextInt();
		System.out.println("Your guess is: " + guess);	
		difference = Math.abs(guess - number);
		guess(guess, difference, number);
		}

		
		
	}
	public static void guess(int n , int d, int num){
		if(n > num){
			System.out.println("You were off by: " + d);
			System.out.println("Your guess is too high");
		}
		else if(n < num){
			System.out.println("You were off by: " + d);
			System.out.println("Your guess is too low");
		}
		else{
			System.out.println("Your guess is correct");
		}


	}
}
