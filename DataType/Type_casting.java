package DataType;

public class Type_casting {
	public static void main(String[] args) {
		int x=1;
		int x1=5;
		int i=300;
		byte b=10;
		b=(byte)(i);//Explicit typecasting
		//dekho int jo badda data type hai or ume  chote data type me store krne ke 
		//32(int) ko 8(byte)me krne ke leye hum 32 bit ke last ke 8 bit ko hii lenge or agr uss 8 bit me
		//msb 1 hai to mtlb no. negative hme hle uska 2's cmplement niklenge then uska original no. aayega 
		System.out.println(b);
		long p=70;//hme typcasting tb krni hogi jb bade data type se chote data type me jna ho
		p=i;//inplicit typecasting
		System.out.print(p);
		}
	

} 