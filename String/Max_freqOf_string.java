package String;

import java.util.Arrays;

public class Max_freqOf_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="abbbac";
       char arr[]=new char[str.length()];
       for(int i=0;i<str.length();i++) {
    	   arr[i]=str.charAt(i);
       }
       Arrays.sort(arr);
       System.out.print(MaxfreqArr(arr));
      
	}
	 public static char MaxfreqArr( char arr[]) {
		   int count=1;
		   char max=arr[0];
		   int ans=0;
	       for(int i=1;i<arr.length;i++) {
	    	   if(arr[i]==arr[i-1]) {
	    		   count++;
	    	   }
	    	   else {
	    		   count=1;
	    	   }
	    	   if(count>ans) {
	    		   ans=count;
	    		   max=arr[i];
	    	   }
	       }
		   return max;
	   }

}
