package Recurssion;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Boardpath(n,0,"");
	}
	public static void Boardpath(int n,int curr,String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n)//agr jada ho jaiye to wapas aane ke leye hai ye 
		{
			return;
		}
//		Boardpath(n,curr+1,ans+1);
//		Boardpath(n,curr+2,ans+2);
//		Boardpath(n,curr+3,ans+3);
		for(int dice=1;dice<=3;dice++) //humne yaha dice=3 iss wjaah se leya kyuki hume given tha 
			//uss dice me kewal 1,2,3 yahi itne faces hai mtlbb humre pass kewal 3 choice 1 2 3 
			//that's why we use 3 recursive call.
		{
			Boardpath(n,curr+dice,ans+dice);
		}
	}

}
