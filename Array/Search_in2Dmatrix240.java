package Array;
//yaha par stair case ka algorithum lagega//
public class Search_in2Dmatrix240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,4,7,11,15}
			,{2,5,8,12,19}
			,{3,6,9,16,22}
			,{10,13,14,17,24}
			,{18,21,23,26,3}};
int target=5;
System.out.print(Search_element2D(arr,target));
	}//yaha par stair case ka algorithum lagega//
	public static boolean Search_element2D(int arr[][],int target)
 {
	int r=0;
	int c=arr[0].length-1;
	while(r<arr.length && c>=0) 
	{
		if(arr[r][c]==target)
		{
			return true;
		}
		else if(arr[r][c]>target)
		{
			c--;
		}
		else 
		{
			r++;
		}
	}
	return false;
	}
}