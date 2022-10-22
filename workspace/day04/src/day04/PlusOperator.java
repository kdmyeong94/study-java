package day04;

public class PlusOperator {

	public static void main(String[] args) {
		
//		---------------------int-----------------
		System.out.println(10 + 10); 		//int + int => int
		System.out.println(10 + 3.1); 		// int + double => double
		System.out.println(10 + 'A'); 		// int + char(미리 매칭되어있는 정수를 가지고있다.;아스키코드) => int
		System.out.println(10 + "ABC"); 	// int + String => 10ABC
	
		System.out.println();
//		---------------------double-----------------
		System.out.println(3.0 + 5 ); 		//double + int => double
		System.out.println(3.0 + 3.0 ); 	//double + double => double
		System.out.println(3.0 + 'a');  	//double + char => double
		System.out.println(3.0 + "안녕"); 	// double + String => String
			
		System.out.println();
//		---------------------char-----------------
		System.out.println('a' + 10); 		// char + int => int
		System.out.println('a' + 10.1); 	// char + double => double
		System.out.println('a' + 'a'); 		// char + char => int
		System.out.println('a' + "안녕");		// char + String => String
		
		System.out.println();
//		---------------------String-----------------
		System.out.println("안녕" + 10); 		// String + int => String
		System.out.println("안녕" + 10.1);   // String + double => String 
		System.out.println("안녕" + 'a');		// String + char => String
		System.out.println("안녕" + "반가워요");// String + String => String
			
		System.out.println();
		// 'a' = 97 , 'A' = 65 , '1' = 49
		System.out.println(10 + '1' + "A" + 50 + 10.1); // 59A5010.1 
		System.out.println("" + 10 + 50 + 'a');			// 1050a
		char ch = 'a';
		System.out.println(ch + 5 + "" + 20.1);			// 10220.1
			
			
			
			
	}

}
