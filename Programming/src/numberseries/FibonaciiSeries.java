package numberseries;
/*
 Fibonacci series is a number sequence in which
 each number is the sum of the previous two numbers.
We write a = 0 and b = 1 because 0 and 1 are the first two numbers of the Fibonacci series.
Fibonacci series always starts with these two fixed values, and all next numbers are calculated using them.
*/
public class FibonaciiSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=3; i<10; i++) {
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			/*
			 * I initialize first two Fibonacci numbers as 0 and 1. In each iteration,I calculate the sum
			 *  of previous two numbers, print it, and update the values to generate the next number.”
			 */
			
		}
	}

}
