import java.util.Scanner;
public class Quadratic{
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		System.out.print("Input number a:");
		int a = in.nextInt();
		System.out.print("Input number b:");
		int b = in.nextInt();
		System.out.print("Input number c:");
		int c = in.nextInt();
		if(Math.pow(b, n) - 4 * a * c < 0){
			System.out.println("No solution");
		}
		else{
			System.out.println((-b + Math.log(Math.pow(b, 2) - 4 * a * c)) / (2*a));
			System.out.println((-b - Math.log(Math.pow(b, 2) - 4 * a * c)) / (2*a));
		}
		
		
	}
	
}
