package Recurssion;

public class Coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,5};
		int target=4;
		permutation(arr,4,"");
	}
	public static void permutation(int arr[],int target,String ans) {
		if(target==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(target>=arr[i]) {
		permutation(arr,target-arr[i],ans+arr[i]);
			}
	    }
	}
}    

