package Array;

public class Binary_Search {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {2,3,5,7,8,9,11,12,13,18};
	int target=11;
	System.out.print(BinSearch(arr,target));
	}
	public static boolean BinSearch(int arr[],int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return true;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return false;
	}
}	
	