package Array;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,5,-4,3,9,6};
sort(arr);
for(int i=0;i<arr.length;i++)
  {
	System.out.print(arr[i]);
  }

	}
public static void sort(int[] arr)
 {//single element always sorted hoga due to this reason loop 1 se start hoga
	for(int i=1;i<arr.length;i++)
	{
		int picked=arr[i];//hand picked
		int j=i-1;
		while(j>=0 && arr[j]>picked)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=picked;
	}
 }
}
