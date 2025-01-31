package Recurssion;

public class Fibbonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.print(fibbo_no(n));
	}
	public static int fibbo_no(int n){
		if(n==0 ||n==1) {
			return n;
		}
		int fn1= fibbo_no(n-1);
		int fn2= fibbo_no(n-2);
		return fn1+fn2;
	}
    
}
