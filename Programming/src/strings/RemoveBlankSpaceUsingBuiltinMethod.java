package strings;

public class RemoveBlankSpaceUsingBuiltinMethod {
	public static void main(String[] args) {
		String s1="I am a Tester";
		String s2="";
		
		String str[]=s1.split(" ");
		for(String st:str) {
			s2=s2+st;
		}
		System.out.println(s2);
		
	}

}
