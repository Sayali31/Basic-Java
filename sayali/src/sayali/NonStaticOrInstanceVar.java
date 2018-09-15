package sayali;

public class NonStaticOrInstanceVar {
	int x=10;
	int y;
	String s;
	boolean c;
	public static void main(String[] args) {
		//System.out.println(x);
		//here you just can't make a static ref to the non-static var x
		//you need to create obj ref 1st
		NonStaticOrInstanceVar ns = new NonStaticOrInstanceVar();
		System.out.println(ns.x);
		//i.e we cannot access non static variable in static method
		NonStaticOrInstanceVar a = new NonStaticOrInstanceVar();
		NonStaticOrInstanceVar b = new NonStaticOrInstanceVar();
		a.x=100;
		b.x=200;
		System.out.println(a.x);
		System.out.println(b.x);
		//For every obj ref,seperate copy of non static / instance variable is created as given above 
		NonStaticOrInstanceVar d = new NonStaticOrInstanceVar();
		NonStaticOrInstanceVar e = new NonStaticOrInstanceVar();
		NonStaticOrInstanceVar f = new NonStaticOrInstanceVar();
		System.out.println(d.y);//default value of int=0
		System.out.println(e.s);//default value of string=null
		System.out.println(f.c);//default value of boolean = false

	}
	public void m1()
	{
		System.out.println(x);
		//here value of x is directly accessible as there is no static type of method
	}

}
