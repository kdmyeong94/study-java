package hiding;

/*
 * 		하나의 소스파일에는 하나의 public 클래스만
 * 		존재할 수 있기 때문에, Member 클래스를 다른 파일로 나누어 놓았다. 
 */
public class Main03 {

	public static void main(String[] args) {
		
		Member a = new Member("자바학생",20);
		
		a.setAge(21);
		
		System.out.println("이름 : " +a.getName());
		System.out.println("나이 : " + a.getAge());
	}
}
