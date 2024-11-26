package OOPs;
import java.util.ArrayList;
public class Student_Client {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer>l1=new ArrayList<>();
//		l1.add(10);
//		ArrayList<Integer>ll1=new ArrayList<>();
//		ll1.add(20);
		Students s=new Students();
		s.Name="Ayush";
		s.age=20;
		s.Intro_yourself();
		Students s1=new Students();
		s1.Name="Pranjal";
		s1.age=21;
		s1.Intro_yourself();
		s1.sayHey("raja");
		s.sayHey("raja");
		Students.Fun();
		s1.Fun();
		s.Fun();
		
	}

}
