package Array;

import java.util.Scanner;

public class Reverse_rangeOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr []=new int [n];
for(int k=0;k<arr.length;k++) {
	arr[k]=sc.nextInt();}
	int i=sc.nextInt();
	int j=sc.nextInt();

Reverse(arr,i,j);
for(int x=0;x<arr.length;x++) {
	System.out.print(arr[x]+" ");
}
	}
	public static void Reverse(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;
	    i++;
	}

}
