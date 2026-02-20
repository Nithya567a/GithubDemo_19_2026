package patterns;

public class P12 {
	public static void main(String[] args) {
		int n=4;
		//int a=1; 
		char ch='A';

		for(int i=1; i<=n; i++) {

			for(int j=1; j<=n; j++) {
				if(j%2==0) {
					System.out.print(ch+" ");

				}else {
					System.out.print(i+" ");

				}
			}
			System.out.println();
			ch++;
		}
	}
}


