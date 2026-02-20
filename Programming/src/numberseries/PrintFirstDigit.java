package numberseries;

import java.util.Scanner;

public class PrintFirstDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		while(n>9) {
			n=n/10;
		}
		System.out.println("First Digit is "+n);
	}

}
