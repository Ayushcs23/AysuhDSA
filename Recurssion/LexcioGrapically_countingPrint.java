package Recurssion;

public class LexcioGrapically_countingPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13; 
		Print_counting(0,n);
	}

	public static void Print_counting(int curr,int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Print_counting(curr*10+i,n);
		}
	}

}
	