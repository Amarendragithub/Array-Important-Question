package Array;

public class MergeTwoArray7 {

	public static void main(String[] args) {
		int count=0,count1=0;
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int[]c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(count<a.length) {
				c[i]=a[count++];
			}
			else {
				c[i]=b[count1++];
			}
				
			}
		System.out.println("merge array is:");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
				
			}
		

	}

}
