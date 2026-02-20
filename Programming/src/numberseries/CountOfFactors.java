package numberseries;

import java.util.Scanner;

public class CountOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("Count of factors is "+count);
		
	}

}
