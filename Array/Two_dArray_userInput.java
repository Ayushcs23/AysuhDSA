package Array;

import java.util.Scanner;

public class Two_dArray_userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int arr[][]=new int[m][n];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		arr[i][j]=sc.nextInt();
	}
}
Display(arr);
	}
public static void Display(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
