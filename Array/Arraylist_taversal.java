package Array;
import java.util.*;
public class Arraylist_taversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
		int arr[]= {1,2,3,4,5,6};
		System.out.println();
		for(int v:l1) {
			System.out.print(v+" ");
		}
		System.out.println();
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
