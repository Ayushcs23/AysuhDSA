package Array;

public class Rotate_Array189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {1,2,3,4,5};
int x=3;
Reverse(arr,0,arr.length-1);
Reverse(arr,0,x-1);
Reverse(arr,x,arr.length-1);
for(int k=0;k<arr.length;k++) {
	
System.out.print(arr[k]+"  ");}
}
	public static void Reverse(int arr[],int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
