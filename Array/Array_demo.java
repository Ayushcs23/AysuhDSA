package Array;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr=new int[5];
    System.out.println(arr);
    //update
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    System.out.print(arr[0]);
    System.out.print(arr[1]);
    System.out.print(arr[2]);
    System.out.print(arr[3]);
    System.out.println(arr[4]);
    int []other=arr;
    other[2]=-9;
    System.out.print(arr[2]);
	}

}
