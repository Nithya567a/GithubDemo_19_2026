package strings;

public class RemoveBlankSpaces {
	public static void main(String[] args) {
		String s = "I am a programmer";
		String s1="";

		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);

			if(ch!=' ') {
				s1=s1+ch;
			}
		}


		/*
		 * If character is NOT equal to space
           → add it
           If character is space
→          skip it
		 */

		System.out.println(s1);
	} 


}
