package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0) {
	int nos=sc.nextInt();
	int noc=sc.nextInt();
	int stall[]=new int[nos];
     for(int i=0;i<stall.length;i++) {
          stall[i]=sc.nextInt();
     }
    Arrays.sort(stall);
     System.out.println( Mindistance( stall, noc));
     t--;
}
	}
public static int Mindistance(int stall[],int noc) {
	int lo=stall[0];
	int hi=stall[stall.length-1];
	int ans=0;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(isitpossiable(stall,noc,mid)==true) {
			ans=mid;
			lo=mid+1;
		}
		else {
			hi=mid-1;
		}
   }
	return ans;
}

public static boolean isitpossiable(int stall[],int noc,int mid) {
	int pos=stall[0];
	int cowScount=1;
	for(int i=1;i<stall.length;i++) {
		if(stall[i]-pos>=mid) {
			cowScount++;
			pos=stall[i];
		}
		if(cowScount==noc){
			return true;
		}
	}
	return false;
}
}
