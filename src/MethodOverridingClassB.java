
public class MethodOverridingClassB extends MethodOverridingClassA{ //child class

	public static void main(String[] args) {
		add();
		
	}
	
	public static void add() {
		for(int i=1;i<=10;i++) {
			System.out.println("Add method in Class B");
		}
	}
	
	
	
	
	//Method overloading
		// same class
		// same method name
		// different parameter
	
	//Method overriding
		// different class
		// same method name
		// same parameter

}
