
public class ClassC extends ClassA{   //hierarchical inheritance
	
	//public class ClassC extends ClassB{ Multilevel inheritance
	
	
	public void method7() {
		System.out.println("Method 7 of Class C");
	}
	
	public void method8() {
		System.out.println("Method 8 of Class C");
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		
		c.method1();
		c.method2();
		c.method3();
		method6();
		c.method7();
		c.method8();
	}
}
