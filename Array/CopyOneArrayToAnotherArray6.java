package Array;

import java.util.Scanner;

public class CopyOneArrayToAnotherArray6 {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8};
		int[]b= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
				
			}
		System.out.println("After copy array element");
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
				
			}
		

	}

}
