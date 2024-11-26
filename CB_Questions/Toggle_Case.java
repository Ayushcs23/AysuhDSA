package CB_Questions;
import java.util.*;
public class Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			int a=s.charAt(i);
			if(a>=65 && a<=90) {
				System.out.print((char)(a+32));
			}
			if(a>=97 && a<=122) {
				System.out.print((char)(a-32));
			}
		}
	}

}
