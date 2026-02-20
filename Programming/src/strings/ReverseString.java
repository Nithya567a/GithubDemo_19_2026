package strings;

public class ReverseString {
	public static void main(String[] args) {
		String s1="Nithya";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--) {
			char ch = s1.charAt(i);
			s2=s2+ch;
			
		}
		/*
		 * When one operand is String, Java converts the other operand into String and performs 
		 * concatenation. So " " + ' ' becomes a String containing two spaces.
		 */
		System.out.println(s2);
	}

}
