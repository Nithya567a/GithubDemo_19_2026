package strings;

public class ReverseTheSentence {
	public static void main(String[] args) {
		 String s="Learn Java Selenium";
		 String s1="";
		 
		String[] str=s.split(" ");
		//The split() method converts a sentence into words and stores them in a String array
		for(int i=str.length-1; i>=0; i--) {
			s1=s1+str[i]+ " ";
		}
		System.out.println(s1);
		
	}

}
