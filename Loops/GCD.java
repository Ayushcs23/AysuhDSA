package Loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int divident=sc.nextInt();
		int divisor=sc.nextInt();
		while(divident%divisor!=0) {
		int rem = divident % divisor;
		  divident=divisor;
		  divisor=rem;
		}
		System.out.print(divisor);
	}

}
