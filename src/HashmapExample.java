import java.util.HashMap;
public class HashmapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<>();
		
		//inserting values in hash map
		name.put(1, "Hobaib");
		name.put(2, "Kazi");
		
		System.out.println(name);
		
		//fetching value from hashmap
		System.out.println(name.replace(1, "Hobaib", "Rizwan"));
		
		System.out.println(name);
		
		//remove value from hashmap
		//System.out.println(name.remove(2));
 	}

}
