package Arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int[] a= {79,64,33,92,45};
		
		int smallest=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("Smallest element in an array is:"+smallest);
	}

}
