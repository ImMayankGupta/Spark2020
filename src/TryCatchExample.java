
public class TryCatchExample {

	public static void main(String[] args) {
		int age = 18;
		int result=0;
		
		try {
			result = age/3;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception a) {
			System.out.println(a);
		}
		
		finally {
			System.out.println("In finally");
		}
		
		
		System.out.println(result);
		
		

	}

}
