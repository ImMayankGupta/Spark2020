import java.util.Scanner;
public class VariableExample {

	public static void main(String[] args) {
		int age = 150;
		
		String Islamfavoritefood= "Chicken biryani";
		
		//System.out.println("Age=a12324ge");
		
		//System.out.println("A Java variable is a piece of memory that can contain a data value");
		
		//System.out.println("MYdinner     " + Islamfavoritefood);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name==");

		String name= input.nextLine();
		
		System.out.println("Hello, "+name);		
	}
}

