package Array;

import java.util.Scanner;

public class EvenElementsAnArray2 {

	public static void main(String[] args) {
		boolean flag=false;
		int[]a= {4,2,5,7,8};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Element is not preasent");
		}


	}

}
