package Array;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,3,-7,4,8,2};
sort(arr);
for(int k=0;k<arr.length;k++) 
{
	System.out.print(arr[k]);
}
	}
	public static void sort(int[] arr)
{
	for(int i=0;i<arr.length;i++) 
	{
		int min=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[min]>arr[j])
			{
				min=j;
			}
			
	    }
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
}
}
