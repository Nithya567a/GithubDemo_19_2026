package strings;

public class Repeated {
public static void main(String[] args) {
	
	String s="automation testing";
	//String[] str = s.split(" ");
	char ch[]=s.toCharArray();
	boolean b[]=new boolean[ch.length];
	int largest=1;
	char ch1=' ';
	for(int i=0;i<ch.length;i++) {
		int count=1;
		if(b[i]==false) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					b[j]=true;
				}
				
			}
			
			if(count>largest) {
				largest=count;
				ch1=ch[i];
				
			}
		}
	}
		System.out.print("Most Repeated character is "+ ch1);
	
	
	
}
}
