package strings;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String s1="Nithya";

		s1=s1.toLowerCase();
		
		int count1=0;
		int count2=0;
		
		for(int i=0; i<s1.length();i++) {
			char ch=s1.charAt(i);
			
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("Vowel count is "+count1);
		System.out.println("Consonant count is "+count2);
	}

}
