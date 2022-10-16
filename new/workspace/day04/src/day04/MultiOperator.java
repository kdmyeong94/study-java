package day04;

public class MultiOperator {
	
	public static void main(String[] args) {
	
//		-----------------int-----------------------
		System.out.println(10 * 10); 	// int * int	=> int
		System.out.println(10 * 0.0);   // int * double	=> double
		System.out.println(10 * 'a');	// int * char	=> int
//		System.out.println(10 * "abcd");// int * String => error
		
		System.out.println();
		
//		-----------------double-----------------------
		System.out.println(0.0 * 3.1); 		//double * double => double
		System.out.println(0.0 * 'a');		//double * char   => double
//		System.out.println(0.0 * "abcd");	//double * String => error
		
		System.out.println();
//		-----------------char-----------------------
		System.out.println('a' * 'b');	//char * char => int
		
	}
	
}
