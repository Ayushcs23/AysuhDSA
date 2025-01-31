package Recurssion;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,5};
		int target=4;
		Combination(arr,4,"",0);

	}
	public static void Combination(int arr[],int target,String ans,int idex) {
		if(target==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=idex;i<arr.length;i++) {
			if(target>=arr[i]) {
	    Combination(arr,target-arr[i],ans+arr[i],i);
			}
	    }
	}
}
