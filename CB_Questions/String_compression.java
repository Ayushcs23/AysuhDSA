package CB_Questions;

import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int count=0;
		char c=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			int j=i-1;
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
			else {
				System.out.print(c);
				if(count>1) {
				System.out.print(count);
				}
				count=1;
				c=s.charAt(i);
			}	
		}
			System.out.print(c);
			if(count>1) {
			System.out.print(count);
			}
	}

}
