package CB_Questions;

import java.util.Scanner;

public class Diff_inAscii_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int diff=s.charAt(1)-s.charAt(0);
		char c=s.charAt(0);
		System.out.print(c);
		for(int i=1;i<s.length();i++)
		{
			diff=s.charAt(i)-s.charAt(i-1);
			System.out.print(diff);
			System.out.print(s.charAt(i));
			
		}
	}

}
