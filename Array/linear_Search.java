package Array;

public class linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr= {1,2,3,4,5};
     int item=4;
     System.out.print(Search(arr, item));
	}
	public static int Search(int[] arr, int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
			
		} 
		return -1;
	}

}
