package strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String s1 = "Race";
		String s2 = "Care";
		//		String s1="Listen";
		//		String s2="Silent";

		if(s1.length()==s2.length()) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			String s11= new String(ch1);	
			String s12= new String(ch2);
			
			if(s11.equals(s12)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}
	}


}
/*
1* String cannot be sorted directly
2️ So convert to char array
 
String s1 = "listen";
After:
ch1 = ['l','i','s','t','e','n']

String s2 = "silent";
ch2 = ['s','i','l','e','n','t']

3️ Sort array
So after sorting:

ch1 = ['e','i','l','n','s','t']
ch2 = ['e','i','l','n','s','t']

4️ Convert back to String

String s11 = new String(ch1);
String s12 = new String(ch2);

This creates new String using sorted character array.

Now:

s11 = "eilnst"
s12 = "eilnst"

 Compare both
 Then if you compare:

if(s11.equals(s12))
It returns TRUE -->So they are anagrams.
*/
