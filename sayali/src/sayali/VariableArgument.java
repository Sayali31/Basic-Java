package sayali;

public class VariableArgument {
	int result=0;
	void add(int... x)
	{
		for(int i : x)
		{
			result=result+i;
		}
		System.out.println("addition is " + result);
	}
	void simplMmsg(String s,int...x)	//always pass VarArg as a last parameter
	{
		System.out.println("This is Simple msg" );
		
	}
	public static void main(String[] args) {
		VariableArgument va=new VariableArgument();
		va.add(10,20);
		va.add(10,20,30);
		va.add(10,20,40,50);
		va.add(10,20,60,70,100);
		va.simplMmsg("Sau", 1,2,3,4);
		
	}
}
