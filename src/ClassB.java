
public class ClassB extends ClassA{ // Child class ; Class B extending Class A property
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		b.method1();
		b.method2();
		b.method3();
		b.method4();
		b.method5();
		method6();
	}
	
	public void method5() {
		System.out.println("Method 5 of Class B");
	}

	public void method4() {
		System.out.println("Method 4 of Class B");
	}
}
