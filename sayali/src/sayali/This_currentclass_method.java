package sayali;

public class This_currentclass_method {
	public void m1()
	{
		this.m2();
		System.out.println("method m1");

	}
	public static void m2() {
		System.out.println("method m2");
	}
	public void m3()
	{
		System.out.println("method m3");
		m1();
		this.m1();
	}
	public static void main(String[] args)
	{
		This_currentclass_method s=new This_currentclass_method();
		s.m3();	//it calls method m3,1st prints 'method 3' then below that there is call for method m1
		//so it goes 
		//to method m1,where m1 is calling m2,so it goes to m2 and prints method m2,then again come back to m1 
		
		
		//and execute next SOP i.e 'method m1'
		//then it come backs to 3rd statement in method m3 which calls m1 method by using this parameter
		//so again it prints 'method m1 followed by method m2'
	}
}
