package Array;

import java.util.Scanner;

public class Transpose_sqrMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int arr[][]=new int[m][m];//Given that Square matrix
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		arr[i][j]=sc.nextInt();
	}
}
Transpose(arr);
	}
 public static void Transpose(int arr[][])
 {
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++) 
		{
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
	      System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
	
 }
}
