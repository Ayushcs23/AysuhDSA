package CB_Questions;

import java.util.Scanner;

public class Finding_CB_Number {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str="81615";
			System.out.print(substring(str));
		}
		public static int substring(String str) {
			int count=0;
			boolean[] visited=new boolean[str.length()];
			for(int line=1;line<=str.length();line++) {
				for(int j=line;j<=str.length();j++) {
					int i=j-line;
					String s1=str.substring(i,j);
					//srting to int me
					//Integer.parseInt(s1);num wli string ko int me krne ke liye
					Long n=Long.parseLong(s1);
					if(is_Cbnumber(n)==true && isvalid(visited,i,j)==true) {
						count++;
						// i to j-1 marked ye cb ban chuke ahu
						for(int k=i;k<j;k++) {
							visited[k]=true;
						}
					}
				}
			}
			return count;
		}
		public static boolean isvalid(boolean[] visited,int i,int j) {
			for(;i<j;i++) {
				if(visited[i]==true) {
					return false;
				}
			}
			return true;
		}
		public static boolean is_Cbnumber(long num) {
			if(num==0 || num==1) {
				return false;
			}
			int[] arr= {2,3,5,7,11,13,17,19,23,29};
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==num) {
					return true;
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(num%arr[i]==0) {
					return false;
				}
			}
			return true;
		}
	
}
