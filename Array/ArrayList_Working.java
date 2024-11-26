package Array;
import java.util.*;

public class ArrayList_Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,3,4,5};
		int arr2[]= {6,3,8,4,3,6};
		AddtwoNUM(arr1,arr2);
	}
	public static void AddtwoNUM(int arr1[],int arr2[]) {
		ArrayList<Integer> l1=new ArrayList<>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int sum=0;
		int carry=0;
		while(i>=0 && j>=0) {
		   sum=arr1[i]+arr2[j]+carry;
		   l1.add(sum%10);
		   carry=sum/10;
		   i--;
		   j--;
		}
		while(i>=0) {
			sum=arr1[i]+carry;
			l1.add(sum%10);
			carry=sum/10;
			i--;
		}
		while(j>=0) {
			sum=arr2[j]+carry;
			l1.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry>0) {
			l1.add(carry);
		}
		for(int k=l1.size()-1;k>=0;k--) {
			System.out.print(l1.get(k)+" ");
		}
	}
}
