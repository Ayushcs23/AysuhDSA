package CB_Questions;
import java.util.*;

public class PlayingWith_GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ans=0;
		int count=0;
		for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(Isvowels(ch)==true) {
				 count++;
			 }
			 else {
				 ans=Math.max(ans, count);
				 count=0;
			 }
		}	
		 ans=Math.max(ans, count);
		 System.out.print(ans);
	}
	public static boolean Isvowels(char c) {
		if(c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u') {
			return true;
		}
		else {
			return false;
		}
	}

}
