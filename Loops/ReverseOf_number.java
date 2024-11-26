 package Loops;
import java.util.Scanner;
public class ReverseOf_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int mul=1;
        while(n>0) {
        	int rem=n%10;
        	reverse=reverse*10+rem;
        	n/=10;
        }
        System.out.print(reverse);
        
	}

}
