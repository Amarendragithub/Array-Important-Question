package Array;

import java.util.Scanner;

public class PalindromeArray10 {

	public static void main(String[] args) {
		int[]a= {1,2,2};
		int []b=new int[a.length];
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			b[count]=a[i];
			count++;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("palindrome array");
		}else {
			System.out.println("not palindrome array");
		}


	}

}
