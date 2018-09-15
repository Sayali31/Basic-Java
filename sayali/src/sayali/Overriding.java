package sayali;

public class Overriding {
public void property() {
	System.out.println("land,money,gold");
}
public void marry() {
	System.out.println("Natasha");
}
}
class child extends Overriding{
	public void marry() {
		System.out.println("Anushka");
	}
}
class MethodOverriding
{
	public static void main(String[] args)
	{
		Overriding o=new Overriding();
		o.property();
		o.marry();
		child c = new child();
		c.property();
		c.marry();
		
	}
}

//here method marry is overrided in child class  