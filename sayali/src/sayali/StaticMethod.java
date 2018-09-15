package sayali;

public class StaticMethod {
	static int count=10;
	static int showCount() {
		return count;
	}
	public static void main(String[] args) {
		int numOfEmployees=StaticMethod.showCount();
		System.out.println(numOfEmployees);
	}

}
//static method access static members only