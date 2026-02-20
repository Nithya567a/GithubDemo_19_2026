package strings;

public class CountDigits {
	public static void main(String[] args) {
		String s="Nithya123";

		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='0' && ch<='9')) {
				count++;
			}
		}
		System.out.println("Count of digits in String is "+count);
	}

}
