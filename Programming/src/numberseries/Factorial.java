package numberseries;

//Factorial of a number is the product of all positive integers from 1 to that number

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=n; i++){
		//for(int i=n; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
