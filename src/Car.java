
public class Car {

	public static void main(String[] args) {
		Car object1 = new Car();
		Car object2 = new Car();
		
		object1.model("BMW",2020);
		object2.model("Audi", 2015);

	}
	
	public void model(String name, int year) { //Method with parameter/arguments
		System.out.println("Name="+name);
		System.out.println("Model year="+year);
	}

}
