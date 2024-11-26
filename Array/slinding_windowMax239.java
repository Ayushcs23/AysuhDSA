package Array;

public class slinding_windowMax239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,-1,-3,5,3,6,7};
int n=arr.length;
int k=3;
int subarr[]=new int[k];
for(int i=0;i<n-k+1;i++) {
	for(int j=i;j<k+i;j++) {
		subarr[j]=arr[j];
	}
	for(int l =0;l<n;l++) {
		System.out.print(subarr[l]+" ");
	}
}
	}

}
