package Recurssion;

public class Print_all_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		printsubsequence(s, "");
	}
	public static void printsubsequence(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=s.charAt(0);
		printsubsequence(s.substring(1),ans);
		printsubsequence(s.substring(1),ans+ch);
	}
}
