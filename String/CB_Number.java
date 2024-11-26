package String;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="81615";
		Printsubstring( s);
	}
	public static int Printsubstring(String s) {
		int count =0;
		for(int len=1;len<s.length();len++) {
			for(int j=len;j<s.length();j++) {
				int i=j-len;
				String s1=s.substring(i,j);
				//string ko int me krne ke lye method use kareneg
				//Integer.parseInt(s1);ye method use hota hai numeric string konumber me convert krne ke leye
		       if(ISCBNUMBER(Long.parseLong(s1))==true) {
		    	   count++;
		       }
			}
			
		}
		return count;
	}
	public static boolean ISCBNUMBER(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int arr[]= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
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
