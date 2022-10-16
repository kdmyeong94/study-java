package day04;

public class DivideOperator {

	public static void main(String[] args) {
		
		
//		-----------------int---------------
		System.out.println(11 / 2 ); 	// int / int  	=> int
		System.out.println(11 / 2.0); 	// int / double => double
		System.out.println(100 / 'a');   // int / char  	=> int
		// 문자열은 나눗셈은 불가
//		System.out.println(11 / "abc"); // int / String => error
		
		System.out.println();
//		-----------------double---------------
		System.out.println(10.0 / 2.0);		// double / double 	=> double
		System.out.println(10.0 / 'a');		// double / char	=> double
		
		System.out.println();
//		-----------------char---------------
		System.out.println('b' / 'a'); // char / char > int
		
		System.out.println();
//		System.out.println(10 / 0 ); // 0으로는 나눌수 없다 
		
//		나눗셈은 기본적으로 몫만 결과값으로 나타내고 나머지는 %를 이용해서 확인
		System.out.println(10 / 3); // / > 몫
		System.out.println(10 % 3); // % > 나머지
		
		
	}
	
}
