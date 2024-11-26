package Array;

public class Global_varialedemo2 {

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
				Global_varialedemo2.val=120;//isko karne se hum function ke andar local variale rhte huye 
				//bhi gloabal ko change kr skte hai
				System.out.println(Global_varialedemo2.val);
			}


}
