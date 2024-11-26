package OOPs;

public class Students {
	String Name;//student Class ka memeber/varibale
	int age;
	public void Intro_yourself() {//class ka method ya function
		System.out.println("My Name is "+Name+"And Age is"+age);
	}
	public void sayHey(String Name) {
		System.out.println(Name+" Say hey "+this.Name);//this kewal class ke andar ke member leye defined hai
	}
	public static void Fun() {
		System.out.println("I am in fun");
	}
	static {
		System.out.println("hey Everyone I am Ayush");
	}
}
