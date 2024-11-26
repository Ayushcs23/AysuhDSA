package Leetcode_Questions;

public class Valid_Pallindrome125 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		//outut-true
		String s1=s.toLowerCase();
		String str="";
		for(int i=0;i<s1.length();i++) {
			int a=s1.charAt(i);
			if((a>=97 && a<=122)||(a>=48 && a<=57)) {
				str=str+s1.charAt(i);
			}
         }
		System.out.print(Ispallindrome(str));
	}
	public static boolean Ispallindrome(String str) {
		int n=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
}
