package day10;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	

	//생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name; // this - 자기 자신의 객체를 의미한다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {
		
	}
	
	public void show() {
		System.out.println("---학생정보---");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
	}
	
}
