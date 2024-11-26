package DataType;
import java.util.Scanner;

public class Bintodeci {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
     System.out.print("Enter the Binary no.");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum=0;
     int mul=1;
     while(n>0) {
    	int rem=n%10;//destination base
    	 sum=sum+rem*mul;
    	 mul=2*mul;//source base
    	 n=n/10;
     }
     System.out.print(sum);
	}

}
