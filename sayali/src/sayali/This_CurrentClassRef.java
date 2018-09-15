package sayali;

public class This_CurrentClassRef {
	int x=10;
	int y=20;
	This_CurrentClassRef(int x,int y)
	{
		System.out.println(x+" "+y);
		System.out.println(this.x+" "+this.y);
	}
	public static void main(String[] args) {
		This_CurrentClassRef t=new This_CurrentClassRef(30,40);
	}

}
//as per the o/p,it took value of paramaterised contructor 1st.Then it moved to the local variable values 