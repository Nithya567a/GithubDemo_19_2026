package Arrays;

public class MoveZerosEnd {
	public static void main(String[] args) {
		
		int[] a = {10,0,20,0,30,0,40,0};
		 
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		while(count<a.length) {
			a[count]=0;
			count++;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
