package Recurssion;

public class print_all_partions_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="NitiN";
		partion(str," ");
	}

	public static void partion(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		// TODO Auto-generated method stub
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			partion(ques.substring(i),ans+s+"|");
		}
	}

}
