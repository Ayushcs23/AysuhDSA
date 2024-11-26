package CB_Questions;

import java.util.Scanner;

public class Strings_stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				count++;
			}
			else {
				count=1;
			}
			System.out.print(count);
		}
	}

}
