package numberseries;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();

		int original=n;
		int sum=0;
		int count=0;
		
		int temp=n;

		while(temp>0) {
			count++;
			temp=temp/10;
		}
		temp=n;
		
		while(temp>0) {
			int last=temp%10;
			sum+=Math.pow(last, count);
			temp=temp/10;
		}
		if(sum==original) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
		
	}

}
