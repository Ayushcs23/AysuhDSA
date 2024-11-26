 package Array;

public class Max_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
int n=arr.length;
int sum=0;
int max=Integer.MIN_VALUE;
for (int i=0;i<n;i++) {
	sum=sum+arr[i];
	if(sum>max) {
		max=sum;
	}
	if(sum<0) {
		sum=0;
	}
}

	System.out.print(max);
	}

}
