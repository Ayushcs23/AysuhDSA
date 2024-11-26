package String;

import java.util.Scanner;

	public class Check_Pallindrome {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.print(Pallindrome(str));
		}
	public static boolean Pallindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}return true;
		
	}
}
