package Array;

public class Global_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hey");
int x=60;
System.out.println(val);
fun(x);
System.out.println(val);
	}
	static int val=100;
	public static void fun(int x) {
		int a=90;
		System.out.println(x);
	int val=19;//agr ye likh dene hum to iss function ka ye local
		//variabl ho jayega is wajah val global ko change nhi kar payega wo is wale local ko hii change krega
		val=120;
		System.out.println(val);
	}

}
