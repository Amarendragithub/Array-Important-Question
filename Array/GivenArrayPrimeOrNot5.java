package Array;

import java.util.Scanner;

public class GivenArrayPrimeOrNot5 {

	public static void main(String[] args) {
		boolean flag=false;
		int[]a= {4,2,5,7,8};
		for(int i=0;i<a.length;i++) {
			int count=0;
			//int num=a[i];
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]);
				flag=true;
			}
				
			}
		if(flag==false) {
			System.out.println("prime no is not preasent");
		}

	}

}
