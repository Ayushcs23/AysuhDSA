package Array;

public class ques135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,0,2};
Max(arr);
	}
	public static void Max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print(max);
	}

}
