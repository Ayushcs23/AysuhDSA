package Array;

import java.util.Scanner;

public class Reverse_OfArray {

	public static void main(String[] args) {
int arr[]= {1,2,5,6,7,8};
Reverse(arr);
for(int i=0;i<arr.length;i++) {
	
System.out.print(arr[i]+"  ");}
}
	public static void Reverse(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	}
