package Arrays;

public class LargestElemnet {
	public static void main(String[] args) {
		int[] a = {19,64,33,92,45};
		
		int largest=a[0];
		
		for(int i=1; i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("largest element in an array is:"+largest);
	}

}
/*
 * largest = a[i]; → array → variable

a[i] = largest; → variable → array

Easy memory trick 💡

➡ Left side gets the value
➡ Right side gives the value
 */

