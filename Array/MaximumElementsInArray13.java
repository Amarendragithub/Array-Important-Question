package Array;

import java.util.Scanner;

public class MaximumElementsInArray13 {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];

			}
		}
		System.out.println("Maximum element array is: "+max);

	}

}
