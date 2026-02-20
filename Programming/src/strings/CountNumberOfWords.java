package strings;

public class CountNumberOfWords {
	public static void main(String[] args) {
		String s = "I am a Tester";
		String[] str = s.split(" ");
		
		int count=0;
		for(String st:str) {
			count++;
		}
		System.out.println(count);
		
	}

}
