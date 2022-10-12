package condition;

public class Main07 {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		/* 
		 * grade가 A 또는 B 또는 C 일경우 : Pass
		 * 그 외 : Not - pass
		 */
		
		switch(grade) {
		case 'A':
			System.out.println("Pass");
			break;
		case 'B':
			System.out.println("Pass");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		default:
			System.out.println("Not - pass");
			break;
		}
		
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
			default:
				System.out.println("Not - pass");
				break;
		}
		
		
		
	}
}
