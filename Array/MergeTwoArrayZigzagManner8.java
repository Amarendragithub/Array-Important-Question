package Array;

public class MergeTwoArrayZigzagManner8 {

	public static void main(String[] args) {
		int count=0,count1=0;
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int[]c=new int[a.length+b.length];
		for(int i=0;i<c.length;) {
			if(count<a.length) {
				c[i]=a[count];
				count++;
				i++;
			}
			if(count1<b.length) {
				c[i]=b[count1];
				count1++;
				i++;
			}
				
			}
		
		System.out.println("zigzag array is:");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
				
			}

	}

}
