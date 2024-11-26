package OOPs;

public class Person {

	String Name="Ayush";//student Class ka memeber/varibale
	int age=20;
	public void Intro_yourself() {//class ka method ya function
		System.out.println("My Name is "+Name+"And Age is"+age);
	}
	public Person() {
		
	}
	public Person(int age,String Name) {
		this.age=age;
		this.Name=Name;
	}

}
