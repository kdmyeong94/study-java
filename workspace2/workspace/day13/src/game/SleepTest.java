package game;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException{
		
		//매개변수로 밀리초를 써준다. ( 1000밀리초 == 1초) 
		System.out.println("시작");
		Thread.sleep(2000); //사용하기위해 throws InterruptedException 를 메서드에 써준다.
		System.out.println("끝!");
		
		
	}
}
