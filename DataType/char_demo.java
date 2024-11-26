package DataType;
import java.util.*;

public class char_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch='a';
        char ch1='0';
        		System.out.println(ch);
        		System.out.println(ch1);
	System.out.println((int)(ch));
	System.out.println((int)(ch1));
	System.out.println(ch1+ch);//agar syso ke andarr  do chr ka sum ho rha hai to wo default unicode ka sum hoga
	int x=19;
	x++;//x=(char)(x+1)//agr increment ya decrement  use krte hai to char me by default ho  jata hai
	ch++;//ch=(char)(ch+1)//implict type casting
	System.out.println(ch);
	System.out.println(x);
	ch=(char)(ch+1);//Explict type casting
	System.out.println(ch);
	//user nळinput of char
	Scanner sc=new Scanner(System.in);
	char ch2=sc.next().charAt(0);
	System.out.print(ch2);
	}
}
