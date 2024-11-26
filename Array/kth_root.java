package Array;
import java.util.Scanner;
public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
System.out.print(KTHroot(n,k));
	}
public static int KTHroot(int n,int k) {
	int lo=1;//low
	int hi=n;//high
	int ans=0;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(Math.pow(mid, k)<=n) {
			 ans=mid;
			lo=mid+1;
		}
		else{
			hi=mid-1;
		}
	}
   return ans;
}
}