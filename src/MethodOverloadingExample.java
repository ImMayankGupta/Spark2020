
public class MethodOverloadingExample {

	public static void main(String[] args) {
		add(); 			// this will call line 13 method
		add(20,40); 	// this will call line 20 method
		add(30,40,50);	// this will call line 26 method

	}
	
	
	//Method Overloading with no parameter
	public static void add() {
		int a=10;
		int b=20;
		int result= a+b;
		System.out.println("Addition="+result);
	}
	
	//Method Overloading with parameter
	public static void add(int x, int y) {
		int result = x+y;
		System.out.println("Addition="+result);
	}

	public static void add(int x, int y, int z) {
		int result= x+y+z;
		System.out.println("Addition="+result);
	}
}
