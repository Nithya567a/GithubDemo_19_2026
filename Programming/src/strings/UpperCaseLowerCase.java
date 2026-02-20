package strings;

public class UpperCaseLowerCase {
	public static void main(String[] args) {
		String s ="NiThyA";
		String s1="";
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				s1=s1+(char)(ch+32);
			}else {
				s1=s1+(char)(ch-32);
			}
			
		}
		System.out.println(s1 + " ");
	}
	}