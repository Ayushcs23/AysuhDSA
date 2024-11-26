package String;

public class Compare_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lexographically//matlab konsa word phl aya hai jo phle aaya hai wo chota mana jaa hai
		String str1="yashasvi";
		String str2="yashiii";
		System.out.print(CompareTo(str1,str2));
	}
public static int CompareTo(String str1,String str2) {
	if(str1==str2) {
		return 0;
	}
	for(int i=0;i<Math.min(str1.length(), str2.length());i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			return str1.charAt(i)-str2.charAt(i);
		}
	}
	return str1.length()-str2.length();
}
}
