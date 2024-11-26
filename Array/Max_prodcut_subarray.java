package Array;

public class Max_prodcut_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,-2,4};
int n=arr.length;
int prod=1;
int max=Integer.MIN_VALUE;
for(int i=0;i<n;i++) {
	prod=prod*arr[i];
}
	}

}
