package day04;

public class MinusOperator {
	
	public static void main(String[] args) {
	
//	--------------int---------------------
		System.out.println(10 - 5); 	// int - int 	=> int
		System.out.println(10 - 3.5); 	// int - double => double
		System.out.println(10 - 'a'); 	// int - char 	=> int
//		System.out.println(10 - "안녕"); // int - String => error
		
		System.out.println();
//	--------------double---------------------
		System.out.println(3.1 - 1.1); 		//double - double => double
		System.out.println(100.1 - 'a');	//double - char   => double
//		String 은 +만 가능하다.
//		System.out.println(100.1 - "안녕");  //double - String => error
		
		System.out.println();
//	--------------char---------------------
		System.out.println('a' - 'b');	// char - char => int
		
		
		
		
		
		
	}
	
}
