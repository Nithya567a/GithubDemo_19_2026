package Arrays;

public class NthSmallest {
	public static void main(String[] args) {
		int[] a = {10,20,5,40};
		int n=2;
		
		for(int i=0; i<a.length; i++) {
			int count=1;
			
			for(int j=0; j<a.length; j++) {
				if(a[j]<a[i]) {
					count++;
				}
			}
			if(count==n) {
				System.out.println(a[i]);
			}
		}
	}

}
