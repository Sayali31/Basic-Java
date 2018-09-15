package sayali;

public class StaticVar {
	static int x=10;
	int y=20;
	public static void main(String[] args) {
		StaticVar sv1=new StaticVar();
		sv1.x=100;
		sv1.y=200;
		
		StaticVar sv2= new StaticVar();
		System.out.println(sv1.x + " " +sv1.y );
		System.out.println(sv2.x + " " +sv2.y );
	} 
	
//while executing 2nd statement x took value of non static,while y took value of local 
}
