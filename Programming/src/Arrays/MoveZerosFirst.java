package Arrays;

public class MoveZerosFirst {
	public static void main(String[] args) {
		int[] a = {10,0,20,0,30,0,40,0};
		
		int count=a.length-1;
		
		for(int i=a.length-1; i>=0; i--) {
			if(a[i]!=0) {
				a[count]=a[i];
				count--;
			}
		}
		while(count>=0) {
			a[count]=0;
			count--;
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
