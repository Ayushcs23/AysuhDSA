package DataType;
import java.util.Scanner;
import java.lang.Math;
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//32145 no. hai to 5 na 1st place pe hai to hume 1 k 5th place pe krna hai or
		//4 hmra 2nd place hai to hme 2 to 4th place pe krna hai
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for (int i =1;n>0;i++) {
			int rem=n%10;
			int p=(int)(i*Math.pow(10,rem-1));
			sum=sum+p;
			n=n/10;
		}
		System.out.print(sum);
	}

}
