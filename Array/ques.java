
package Array;

import java.util.Scanner;

public class ques {
	public static void main(String[] args) {
		// TODO Auto-generated method
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int a_max=sc.nextInt();
				int b_max=sc.nextInt();
				int i=1;
				while(a_max>0 && b_max>0) {
					if(i%2==0) {
						b_max=b_max-i;
					}
					else {
						a_max-=i;
					}
					if(a_max<=0) {
						System.out.println("a_max");
						
					}
					else if(b_max<=0) {
						System.out.println("b_max");
					} 
					i++;
				}
			}


	}







