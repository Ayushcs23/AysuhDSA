package Array;

import java.util.*;

public class MaxFreqArray {

	public static void main(String[] args) {
	
    int arr[]= {1,3,3,2,2,3,3,4};
    Arrays.sort(arr);
     MaxfreqArr(arr);
	}
   public static void MaxfreqArr( int arr[]) {
	   int max=0;
	   int count=1;
       int a=arr[0];
       for(int i=1;i<arr.length;i++) {
    	   if(arr[i]==arr[i-1]) {
    		   count++;
    	   }
    	   else {
    		   count=1;
    	   }
    	   if(count>max) {
    		   max=arr[i];
    	   }
       }
	   System.out.print(max);
   }
}
