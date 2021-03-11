package demo;

public class caculator {
public static void main(String[] args) {
	Calci c=new Calci();
	int a=c.add(4,2);
	int s=c.sub(4,1);	
	int m=c.mul(7,5);	
	int d=c.div(18,9);
	System.out.println(a);
	System.out.println(s);
	System.out.println(m);
	System.out.println(d);

}
}
class Calci{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}