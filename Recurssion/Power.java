package Recurssion;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		int n=5;
		System.out.print(power(x,n));
	}
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int ans=power(x,n-1);
		return ans*x;
	}

}
