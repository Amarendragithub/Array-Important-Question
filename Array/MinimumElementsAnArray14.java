package Array;

public class MinimumElementsAnArray14 {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];

			}
		}
		System.out.println("Minimum element in array is: "+min);


	}

}
