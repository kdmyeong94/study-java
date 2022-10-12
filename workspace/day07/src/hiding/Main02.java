package hiding;

class Student{
	//은닉된 멤버변수 - > 현재 블록 안에서만 접근 가능함.
	private String name;
	private int age;
	
//	name getter
	public String getName() {
		return this.name;
	}
//	name setter
	public void setName(String name) {
		this.name = name;
	}
//	age getter
	public int getAge() {
		return this.age;
	}
//	age setter
	public void setage(int age) {
		this.age = age;
	}
}





public class Main02 {
	
 public static void main(String[] args) {

	 Student a = new Student();
	
	 a.setName("자바학생");
	 a.setage(20);
	 
	 String name = a.getName();
	 System.out.println("이름 : "+  name);
	 
	 System.out.println("나이 : " + a.getAge());
 	}
 
}
