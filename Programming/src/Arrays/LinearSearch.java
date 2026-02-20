package Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		
		int key=50;
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(key==a[i]) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Element present");
		}else {
			System.out.println("Element Not present");
		}
	}
	

}
