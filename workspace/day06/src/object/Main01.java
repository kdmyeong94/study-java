package object;

class Student{
//	멤버변수
	String name = "자바학생";
	int age = 19;
}
public class Main01 {

	public static void main(String[] args) {
		
		//객체의 선언과 할당의 분리
		Student std; 
		std = new Student();
		
		// 일괄지정으로 객체 생성
		Student std2 = new Student();
		
		System.out.println(std.age);
		System.out.println(std.name);
		System.out.println("-----------");
		System.out.println(std2.age);
		System.out.println(std2.name);
		System.out.println("-----------");
		
		std2.age = 20;
		std2.name = "오라클학생";
		System.out.println(std.age);
		System.out.println(std.name);
		System.out.println("-----------");
		System.out.println(std2.age);
		System.out.println(std2.name);
		System.out.println("-----------");
		
	}
}
