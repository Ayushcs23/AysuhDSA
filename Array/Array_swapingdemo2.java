package Array;

public class Array_swapingdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr= {1,2,3,4,5};
      System.out.println(arr[0]+" "+arr[1]);
      Swap(arr,0,1);
      System.out.print(arr[0]+" "+arr[1]);//heap memory me keya gya changes other func me reflect nhi hota hai
      
	}
	public static void Swap(int []arr,int i,int j) {
		int tem=arr[i];
		arr[i]=arr[j];
		arr[j]=tem;
	}

}
