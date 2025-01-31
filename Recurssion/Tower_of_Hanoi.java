package Recurssion;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toH(n,"A","B","C");
		int ans=Integer.MIN_VALUE;
	}
	public static void toH(int n,String src,String hel,String des) {
		if(n==0) {
			return;
		}
		toH(n-1,src,des,hel);
		System.out.println("move "+n+"th from"+src+"to"+des);
		toH(n-1,hel,src,des);
	}

}
