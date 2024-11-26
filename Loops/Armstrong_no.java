package Loops;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int count=0;
    int ans=n;
    int ans1=n;
      while(n>0) {
    	  int rem=n%10;
    	  if(rem>0) {
    		  count++;
    	  }
    	  n=n/10;
      }
      int sum=0;
      while(ans>0) {
    	  int rem=ans%10;
    	  int x=(int)Math.pow(rem,count);
    	  sum=sum+x;
    	 ans=ans/10;
      }
      System.out.println(sum);
      if(ans1==sum) {
    	  System.out.print("It is amstrong no.");
      }
      else {
    	  System.out.print("It is not armstrong no.");
      }
	}

}

