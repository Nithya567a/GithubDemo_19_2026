package Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
