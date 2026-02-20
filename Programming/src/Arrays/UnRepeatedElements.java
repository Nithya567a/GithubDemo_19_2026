package Arrays;

public class UnRepeatedElements {
	public static void main(String[] args) {
		int[] a= {10,20,30,10,20,40};
		boolean[] b=new boolean[a.length];

		for(int i=0; i<a.length; i++) {
			int count=0;
			if(b[i]==false) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count==0) {
					System.out.println(a[i]+ " is a Non Duplicate");
				}
			}
		}
	}

}
