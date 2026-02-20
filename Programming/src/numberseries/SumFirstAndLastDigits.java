package numberseries;

import java.util.Scanner;

public class SumFirstAndLastDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int last=n%10;
		
		while(n>9) {
			n=n/10;
		}
		int sum=last+n;
		
		System.out.println("Sum of First and Last Digit is "+sum);
		
		
	}

}
