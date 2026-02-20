package numberseries;

import java.util.Scanner;

//sum of  all the digits excluding the first and last digit

public class PrintSum {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int n=sc.nextInt();
		 
		 int last=n%10;
		 int sum=0;
		 n=n/10;
		 
		 while(n>9) {
			 int rem=n%10;
			 sum=sum+rem;
			 n=n/10;
		 }
		 System.out.println("sum of digits excluding first and Last Digit is "+sum);
	}

}
