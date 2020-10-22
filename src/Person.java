
public class Person {

	public static void main(String[] args) {
		
		Person object1 = new Person();
		Person object2 = new Person();
	// ClassName objectNAME = new ClassName();

		String name = "Kazi"; // Method property
		int age =30;
		object1.eat();
		object1.play();
		object2.study();
		object2.sleep();
		System.out.println("Name="+object1.name); // calling class property
		System.out.println("Name="+age);		// calling method property
	}
	
	public String name = "John"; //Class property
	public int age=25;
	
	public void sleep() { // Method without parameter/arguments
		System.out.println("I am sleeping");
	}
	
	public void eat() {
		System.out.println("I am eating");
	}
	
	public void play() {
		System.out.println("I am playing");
	}
	
	public void study() {
		System.out.println("I am studying");
	}

}
