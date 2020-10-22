
public class MethodExample {
	

	//Method definition 
	public static void addition(int num1, int num2) { //Method with arguments
		int result = num1 + num2;
		System.out.println("Addition of a and b ="+ result);
	}
	
	//Method definition
	public static void subtract() { // Method without arguments
		int x= 20;
		int y= 10;
		int result= x-y;
		System.out.println("Subtraction of x and y ="+ result);
	}
	
	
	public static void main(String[] args) {
		//Method calling
		addition(10,20);
		subtract();
	}

}
