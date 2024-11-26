package DataType;

import java.util.Scanner;
public class DeciTObin {
              public static void main(String[] args) {
            	  System.out.print("Enter a decimal number");
                  Scanner sc=new Scanner(System.in);
                  int n=sc.nextInt();
                  int sum=0;
                  int mult=1;
                  while(n>0) {
                	  int rem=n%2;//destination se divide
                	  sum=sum+rem*mult;
                	  n=n/2;
                	  mult=mult*10;//source se multiply
                  }
                  System.out.print(sum);
              }
}
