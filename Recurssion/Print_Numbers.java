package Recurssion;

public class Print_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print_NO(n);
	}
	public static void print_NO(int n) {
		if(n==0) {
			return;
		}
		print_NO(n-1);//agr function calling syso ke upr hoti to increasing order me print hoga
		System.out.println(n);//or function calling syso ke baaad krte hai to  decreasing order me print hoga
	}

}
