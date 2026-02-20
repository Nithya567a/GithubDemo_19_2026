package strings;

public class UpperCaseToLowerCase {
	public static void main(String[] args) {
		String s1="NITHYA";
		String s2="";
		
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			s2=s2+(char)(ch+32);
		}
		/*
		 * Uppercase and lowercase letters have 32 difference in ASCII.
            So I added 32 to convert uppercase to lowercase.
            ch + 32 → gives int
             Java needs explicit casting to convert int → char
             So we write:
             (char)(ch + 32)
		 */
		System.out.println(s2);
	}

}
/*using bulit in function
 * 
 * String s1="NITHYA";
 *String s1=s1.toLowerCase();
 * System.out.println(s1);
 * 
 */ 
