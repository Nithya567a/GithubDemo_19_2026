package strings;

public class SumDigits {
	public static void main(String[] args) {
		String s="Nithya123";
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum=sum+ch-48;
				
			}
		}
		/*
		 * Digits are stored as ASCII values.
           Since '0' has ASCII value 48, subtracting 48 converts character digit to actual integer value.
		 */
		System.out.println("Sum of digits is "+sum);
				
	}

}
