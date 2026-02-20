package strings;

public class PalindromeString {
	public static void main(String[] args) {
//		String s1="MALAYALAM";
		String s1="NITHYA";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--) {
			char ch=s1.charAt(i);
			
			s2=s2+ch;
		}
		if(s1.equals(s2)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome ");
		}
	}

}
