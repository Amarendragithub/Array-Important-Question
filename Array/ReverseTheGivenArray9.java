package Array;

public class ReverseTheGivenArray9 {

	public static void main(String[] args) {
		int[]a= {1,2,3};
		int[]b=new int[a.length];
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			b[count]=a[i];
			count++;
		}
		System.out.println("Reverse array element:");
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}

	}

}
