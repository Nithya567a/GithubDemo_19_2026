package strings;

public class TwoSuMOfTarget {
	public static void main(String[] args) {
		int[] a = {2,3,5,7,9};
		int target=9;

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==target) {
					System.out.println(i+","+j);
				}
			}
		}
}


}
