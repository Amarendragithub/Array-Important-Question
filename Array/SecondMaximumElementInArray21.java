package Array;

public class SecondMaximumElementInArray21 {

	public static void main(String[] args) {
		int[]a= {4,2,5,1,8};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];

			}
		}
		int max=min,secondmax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondmax=max;
				max=a[i];
			}
				else if(a[i]>secondmax&&a[i]!=max) {
					secondmax=a[i];
				}
			
		}
		System.out.println("Maximum element array is: "+max);
		System.out.println("Second maximum element array is: "+secondmax);
		

	}

}
