package Array;

import java.util.Scanner;

public class InsertAnElementIndexValue11 {

	public static void main(String[] args) {
		int[]a= {1,2,2};
		int []b=new int[a.length+1];
		int count=0;
		int ele=4;
		int ind=1;
		
		for(int i=0;i<b.length;i++) {
			if(i==ind) {
				b[i]=ele;
			}else {
				b[i]=a[count];
				count++;
			}
		}
		System.out.println("After inserting element:");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
				
			}


	}

}
