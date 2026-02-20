package numberseries;

import java.util.Scanner;

public class XylumPhylum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int n=sc.nextInt();

		int sum=0;
		int last =n%10;
		n=n/10;

		while(n>9) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}

		int sum1=last+n;

		if(sum==sum1) {
			System.out.println("Xylum");
		}else {
			System.out.println("Phylum");
		}
	}
}
