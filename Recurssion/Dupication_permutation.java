package Recurssion;

public class Dupication_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abca";
		Printanswer(ques,"");

	}
	public static void Printanswer(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			Boolean flag=false;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				String s1=ques.substring(0, i);
				String s2=ques.substring(i+1);
				Printanswer(s1+s2,ans+ch);
		    }
		}
	}
}
