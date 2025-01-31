package Recurssion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.print(Fact(n));
		
	}
	public static int Fact(int n) {
		if(n==0) {
			return 1;
		}
		 int ans=Fact(n-1);
		 return n*ans;
	}

}
