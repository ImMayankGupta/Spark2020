
public class Employee {

	public static void main(String[] args) {
		Employee add = new Employee();
		
		add.newEmployee("John", 11);
		add.newEmployee("Kazi", 12);
		add.newEmployee("Rizwan", 13);
		add.newEmployee("Mayank", 15);
		
		
		
	}
	
	public void newEmployee(String Name, int EmpID) {
		System.out.println("Emp name="+Name);
		System.out.println("Emp ID="+EmpID);
	}

}
