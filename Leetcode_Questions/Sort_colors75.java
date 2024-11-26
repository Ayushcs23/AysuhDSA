package Leetcode_Questions;

public class Sort_colors75 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]={0,1,1,1,0,0,1,1,0};
//		sort(arr);
//		
//	}
//	public static void sort(int arr[]) {
//		int i =0;
//		int j=arr.length-1;
//		while(i<j) {
//			if(arr[i]==0) {
//				i++;
//			}
//			else if(arr[j]==1) {
//				j--;
//			}
//			else {
//				arr[i]=0;
//				arr[j]=1;
//				i++;
//				j--;
//			}
//		}
//		for(int val:arr) {
//			
//			System.out.print(val+" ");
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,2,1,2,0,1,2,1};
		int i=-1;
		int j=0;
		int k=arr.length-1;
		sort(arr);
	}
	public static void sort(int arr[]) {
		int j=0;
		int k=arr.length-1;
		while(j<k) {
			if(arr[k]==2) {
				k--;
			}
			else if(arr[j]==1) {
				j++;
			}
			else if(arr[i+1]) {
				
			}
		}
	}
}
