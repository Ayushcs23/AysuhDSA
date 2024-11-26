package Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]
		ArrayList<Integer> l1=new ArrayList<>();
		System.out.println(l1);
		System.out.println(l1.size());
		//Add
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		System.out.println(l1.size());
		l1.add(2,-6);//intert elemnt phle wo index likheenge jaha add krna then wo element
		System.out.println(l1);
//		Collections.sort(l1);//ye arraylist ko sort  krne ka tarika hai
//		System.out.println(l1);
	//	Collections.reverse(l1);//revere ke leye ye hai
		Collections.sort(l1);//sort krne ke leye
		System.out.println(l1.size());
		//get//range 0-(size-1)
		System.out.println(l1.get(3));
		
		
	}

}
