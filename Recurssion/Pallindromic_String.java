package Recurssion;

public class Pallindromic_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nitin";
		System.out.print(countPallindromic_substring(s));
	}

	public static int countPallindromic_substring(String s) {
		// TODO Auto-generated method stub
		int count=0;
		// for odd
		for(int axis=0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}//for even
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {
					break;
				}
				count++;
			}
		}
		return count;
	}

}
