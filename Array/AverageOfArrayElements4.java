package Array;

import java.util.Scanner;

public class AverageOfArrayElements4 {

	public static void main(String[] args) {
		int sum=0;
		int[]a= {4,2,5,7,8};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
				
			}
		int avg=sum/a.length;
		System.out.println(avg);

	}

}
