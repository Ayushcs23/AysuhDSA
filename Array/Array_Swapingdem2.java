
package Array;

public class Array_Swapingdem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[]arr= {2,3,4,5,6};
   int[]other= {5,6,7,8,9};
   System.out.println(arr[0]+" "+other[0]);
   Swap(arr,other);
   System.out.println(arr[0]+" "+other[0]);
	}
	public static void Swap(int []arr,int[]other) {
		int[] temp=arr;
		arr=other;
		other=temp;
	}

}
