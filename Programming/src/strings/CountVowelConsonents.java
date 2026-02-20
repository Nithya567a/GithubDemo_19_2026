package strings;

public class CountVowelConsonents {
	public static void main(String[] args) {
		String s="Ashish";
		s=s.toLowerCase();

		int count1=0;
		int count2=0;

		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u') {
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("vowel count is" +count1);
		System.out.println("consonant count is"+count2);
	}

}
