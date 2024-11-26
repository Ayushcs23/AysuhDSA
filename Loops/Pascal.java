package Loops;
import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=1;
		
		while(row<n) {
			int i=1;
			int r=0;
			while(i<=star) {
				System.out.print(fact(row)/((fact(row-r))*fact(r))+"\t" );
				i++;
				r++;
			}
			star++;
			row++;
			System.out.println();
		}
//		System.out.print(factorial(5));
	}
	public static int fact(int n) {
		int i=1;
		int ans=1;
		while(i<=n) {
			ans=ans*i;
			i++;
		}
		return ans;
	}

}
