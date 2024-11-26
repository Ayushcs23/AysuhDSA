package String;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		 String str="hello";
	     String str1=new String("hello");
	     String str2="hello";
	     String str3=new String("hello");
//	     int a=0;
//	     int b=8;
//	     System.out.println(a=b);//yaha pr value compare hoti hai 
	     System.out.println(str==str1);//but yaha string me uska address compare hota hai
	     System.out.println(str1==str2);
	     System.out.println(str2==str3);
	     System.out.println(str==str2);
	     System.out.println(str.equals(str2));//ye method hai string me value compare krne ke lye
	     String s="hwbeiewheur";
	     System.out.println(s.substring(1,3));//iske throght string me index
	     //1 se 2 tk ki substring print kra ske hai
	     }

}
