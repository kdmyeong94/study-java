package operator;

public class Main03 {

	public static void main(String[] args) {
		
		int plus_num = 1;
//		plus_num 변수에 1씩 증가시키는 4가지 표현 사용해서 증가 후 결과 출력
		
		plus_num = plus_num + 1;
		plus_num += 1;
		plus_num++;
		++plus_num;
		
		System.out.println(plus_num);
		
		int minus_num = 5;
//		minus_num 변수에 1씩 감소시키는 4가지 표현 사용해서 감소 후 결과 출력
		
		minus_num = minus_num - 1;
		minus_num -= 1;
		minus_num--;
		--minus_num;
		
		System.out.println(minus_num);
		
	}
}
