package Arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {10,30,55,60,45,17};
		
		int key=10;
		int count=0;
		int low=0;
		int high=a.length-1;
		
		Arrays.sort(a);
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(key==a[mid]) {
				count++;
				break;
			}else if(key>a[mid]) {
				low=mid+1;
			}else if(key<a[mid]) {
				low=mid-1;
			}
		}
		if(count==1) {
			System.out.println("Element Present");
		}else {
			System.out.println("Elemnt Not present");
		}
	}

}
