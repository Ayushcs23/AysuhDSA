
package Array;
import java.util.*;
public class rain_water_TrappingLEETCODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,1,8,2,4,5}; 
System.out.println(Rain_water_trapping(arr));
	}
	public static int Rain_water_trapping(int arr[]) { 
		int n=arr.length;
		int left []=new int [n];
		for(int i=1;i<n;i++) {
			left[0]=arr[0];
			left[i]=Math.max(left[i-1],arr[i]);
		}
		int right[]=new int[n];
		for(int j=n-2;j>=0;j--) {
			right[n-1]=arr[n-1];
			right[j]=Math.max(right[j+1], arr[j]);
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}

}
