package day10;

public class School {

	public static void main(String[] args) {
		
		Student kim = new Student("김철수", 100, 80, 100);
		Student park = new Student();
		
//		kim.name = "김철수";
//		kim.kor = 100;
//		kim.eng = 80;
//		kim.math = 100;
		
		kim.show();
		
		park.name = "박영희";
		park.kor = 85;
		park.eng = 80;
		park.math = 100;
		
		park.show();
	}
}
