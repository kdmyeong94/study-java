package object;

class HelloWorld{
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	void setEng() {
		message = "Hello Java";
	}
	void setKor() {
		message = "안녕하세요 자바";
	}
}


public class Main03 {

	public static void main(String[] args) {
		/*
		 * HelloWorld 클래스로 객체 생성,
		 * [결과값]
		 * Hello Java
		 * 안녕하세요 자바
		 */
		HelloWorld a = new HelloWorld();
//		Hello Java
		a.setEng();
		a.sayHello();
//		안녕하세요 자바
		a.setKor();
		a.sayHello();
	}
}
