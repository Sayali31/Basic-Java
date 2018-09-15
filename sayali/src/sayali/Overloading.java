package sayali;

public class Overloading {

	public void m1() {
		System.out.println("no arguments");
	}
	public void m1(int x) {
		System.out.println("int argument");
	}
	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.m1();
		o.m1(10);
	}
}
