package method;

public class Main01 {

	public static void main(String[] args) {
		
		//메서드의 리턴값을 변수에 저장
		int a = plus(10,5);
		System.out.println(a);
		
		System.out.println(f1(30));
		
	}
	
	public static int plus(int x ,int y) {
			return x + y;
	}
	
	public static int f1(int x) {
		int y = x + 1; 
		return y;
	}
	
}
