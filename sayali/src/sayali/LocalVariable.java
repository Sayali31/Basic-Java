package sayali;

public class LocalVariable {
	public static void main(String[] args) {
	//int x;
	int x=10;//here by default it takes int as a final.It can't take any of public,protected,static types
	//datatype cant be self initialised by JVM.Explicitely need to initiate to some value
	//else it gives complite time error as "The local variable x may not have been initialized"
	System.out.println(x);
	}
}
