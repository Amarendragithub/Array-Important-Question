package Array;

import java.util.Arrays;

public class DescendingElementInBubbleSort17 {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.println(Arrays.toString(a));
				
			}
		}
		System.out.println("After sorting array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}


	}

}
