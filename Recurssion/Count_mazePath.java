
package Recurssion;

public class Count_mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{2,4,6,8}};
		System.out.print("\n"+Print_path(arr,0,0," "));
	}
	public static int Print_path(int arr[][],int row,int col,String ans) {
		if(row==arr.length-1 && col==arr[0].length-1) {
			System.out.print(ans+" ");
			return 1;
		}
		if(row>arr[0].length-1 || col>arr.length-1) {
			return 0;
		}
		int r1=Print_path(arr,row+1,col,ans+"V");
		int r2=Print_path(arr,row,col+1,ans+"H");
		return r1+r2;
	}

}
