package String;

import java.util.Scanner;

public class Print_all_Substring {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
