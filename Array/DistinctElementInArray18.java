package Array;

public class DistinctElementInArray18 {

	public static void main(String[] args) {
		int[]a= {4,2,5,4,8};
		System.out.println("Distinct value");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=-1;
				}
			}
			if(count>=1&&a[i]!=-1) {
				System.out.println(a[i]);
			}
				
			}

	}

}
