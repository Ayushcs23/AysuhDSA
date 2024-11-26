package CB_Questions;

import java.util.Scanner;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		System.out.print(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				s1=s1+s.charAt(i);
			}
		
		}
		System.out.print(s1);
	}

}
