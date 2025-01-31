package Recurssion;

public class First_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,6,5,4,2};
		int iteam=6;
		int i=0;
		System.out.print(firstindex(arr,iteam,i));
		
	}
	public static int firstindex(int arr[],int iteam,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==iteam) {
			return i;
		}
		return firstindex(arr,iteam,i+1);
	}
}
