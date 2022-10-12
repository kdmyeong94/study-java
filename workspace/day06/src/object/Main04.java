package object;

class Calc{
	
	int sum( int x , int y) {
		return x + y;
	}
	
}

public class Main04 {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		int a = c.sum(10, 20);
		System.out.println(a);

//		- 파라미터에 의해 결과를 리턴하는 경우, 서로 다른 값을 위하여 객체를 여러개 생성할 필요가 없다.
//		- 자체적으로 데이터를 갖는 형태가 아니라 외부적인 요인인 파라미터에 의해서 결과가 생성되므로, 하나의 객체를 재사용 하는 것이 바람직하다.
		
		int b = c.sum(30, 40);
		System.out.println(b);
	}
}
