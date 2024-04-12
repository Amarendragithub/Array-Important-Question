package Array;

public class SecondMinimumElement22 {

	public static void main(String[] args) {
		int[]a= {4,2,5,1,8};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];

			}
		}
		int min=max,secondmin=0;
		for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			secondmin=min;
			min=a[i];
		}
			else if(a[i]<secondmin&& min!=a[i]) {
				secondmin=a[i];
			}
		
	}
	System.out.println("Second minimum element array is: "+secondmin);


	}

}
