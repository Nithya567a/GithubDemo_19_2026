package strings;

public class ReverseWordinSentence {
	public static void main(String[] args) {
		String s="All the best";
		String s1="";
		
		String[] str=s.split(" ");
		for(int i=0; i<str.length; i++) {
			String s2=str[i];
			String rev="";
			
			for(int j=s2.length()-1; j>=0; j--) {
				char ch=s2.charAt(j);
				rev=rev+ch;
			}
			s1=s1+rev+" ";
		}
		System.out.println(s1);
		
	}

}
