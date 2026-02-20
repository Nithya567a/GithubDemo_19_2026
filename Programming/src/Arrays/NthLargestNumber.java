package Arrays;

public class NthLargestNumber {
	public static void main(String[] args) {
		int[] a = {40,30,20,10,50};
		int n=2;

		for(int i=0; i<a.length; i++) {
			int count=1;

			for(int j=0; j<a.length; j++) {
				if(a[j]>a[i]) {
					count++;
				}
			}
			if(count==n) {
				System.out.println(a[i]);
			}

		}
	}

}
