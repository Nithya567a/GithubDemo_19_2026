package strings;

public class RepeatedCharacters {
public static void main(String[] args) {
	String s="java";
	char[] ch = s.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++) {
		count++;
	}
	System.out.println(count);
}

}
