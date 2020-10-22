
public class ConstructorExample {
	
	public int a = 10;
	public int b= 20;
	
	public static int result;
	
	ConstructorExample(){ // without argument constructor
		System.out.println("****Welcome my program start running****");
		result = a+b;
		System.out.println(result);
	}
	
	ConstructorExample(String text){ // with argument constructor
		System.out.println(text);
	}
	

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample(); 
		
		 
		ConstructorExample ce1 = new ConstructorExample("This is ending of program"); 

		System.out.println("This is program running");
		
		System.out.println("This program in middle execution");
		
		
	}

}
