package strings;

public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		String s="nithya";
		String s1="";
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			s1=s1+(char)(ch-32);
			
		}
		/*
		 * Lowercase and uppercase letters have 32 difference in ASCII.
             So I subtract 32 to convert lowercase to uppercase.
           Since arithmetic converts char to int, I use (char) to convert it back to character.
		 */
		System.out.println(s1);
	}

}
/*using bulit in function
 * 
 * String s="nithya";
 * String s1=s.toUpperCase();
 * System.out.println(s1);
 * 
 */ 
