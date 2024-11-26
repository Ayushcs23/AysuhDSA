package String;

public class Print_substring_len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="54336";
			PrintSubstring( str) ;
	}
    public static void PrintSubstring(String str) {
    	for(int len=1;len<str.length();len++) {  
    		for(int j=len;j<=str.length();j++) {
    			int i=j-len;
    			System.out.println(str.substring(i,j));
    		}
    	}
    }
}
