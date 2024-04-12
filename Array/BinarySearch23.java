package Array;

import java.util.Arrays;

public class BinarySearch23 {

	public static void main(String[] args) {
		int[]a= {4,2,5,1,8};
		Arrays.sort(a);
		int key=1;
		int l=0,h=a.length-1,mid=0;
		boolean flag=false;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				flag=true;
				System.out.println("element is found");
				break;
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else if(key>a[mid]) {
				l=mid+1;
			}
		}
		if(flag==false) {
			System.out.println("element is not found");
		}


	}

}
