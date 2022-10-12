package multiex;

public class Main04 {

	public static void main(String[] args) {
//		1~100 까지 홀수들의 합
		
		int sum = 0;
		int i = 0;
		
		while (true) {
			i++;
			
			if(i % 2 == 0) { //짝수
				continue;
			}
			
			if(i>100) {
				break;
			}
			
			sum += i; 	 // 홀수 인 경우
			
		}
		System.out.println(sum);
		
		
			
			
	} //2

} //1
