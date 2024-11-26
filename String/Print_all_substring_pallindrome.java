package String;

import java.util.Scanner;

public class Print_all_substring_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String str1=str.substring(i,j);
				if(substring_pallindome(str1)==true) {
					System.out.println(str1);
				}
			}
		}
	}
   public static boolean substring_pallindome(String str1) {
	   int i=0;
	   int j=str1.length()-1;
	   while(i<j)
	   {
		   if(str1.charAt(i)!=str1.charAt(j)) {
			   return false;
		   }
		   i++;
		   j--;
	   }
	   return true;
	   
   }
}
