import java.util.*;
public class ArrayExample {

	public static void main(String[] args) {
		//datatype[] <arrayname> = {values};
		
		// datatype[] <arrayname> = new int[n]
		
		int[] numbers = {10,10,10,10,10};
		 
		int[] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
			
						 
		System.out.println("array length="+numbers.length);
		System.out.println("-----------------");	
		
		for(int i=0;i<num.length;i++) {
			System.out.println("array values="+num[i]);
		}
		
		System.out.println("-----------------");
		
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println("array values="+numbers[i]);
		}
		
		System.out.println("-----------------");
		
		String[] name = {"John", "Mayank", "Kazi", "Baby", "Rizwan","Hobaib"};
		
		System.out.println("array length of name="+name.length);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("name="+name[i]);
		}
		System.out.println("-----------------");
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.println("name="+name[i]);
		}
		
		System.out.println("-----------------");
		
	}

}
