package Array;

public class RemoveDuplicateValue20 {

	public static void main(String[] args) {
		int[]a= {4,2,5,4,8};
		System.out.println("After remove duplicate element:");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=-1;
				}
			}
			if(count>=0&&a[i]!=-1) {
				System.out.println(a[i]);
			}
				
			}

	}

}
