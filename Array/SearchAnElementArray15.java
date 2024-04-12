package Array;

public class SearchAnElementArray15 {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8};
		System.out.println("Enter the array which you want");
		int target=2;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(target==a[i]) {
				flag=true;
				System.out.println("The given element is present in the array: "+i);
				break;
			}
		}
		if(flag==false) {
			System.out.println("The given element is not present in the array");
		}


	}

}
