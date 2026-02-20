package strings;

public class CharArrayToString {
	public static void main(String[] args) {
		char ch[]={'N','i','t','h','y','a'};
		String s= new String(ch); //new String(ch) takes all characters from the array and combines them into one String object.
		System.out.println(s);
	}

}
