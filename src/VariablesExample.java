
public class VariablesExample {
	
	//Global variable
	public static int num = 80;

	
	public static void main(String[] args) {
		//Local/instance/method variable
		 int age =70;
		
		System.out.println("Age="+age);
		method1();
	}
	
	public static void method1() {
		System.out.println("Num="+num);
	}
}
