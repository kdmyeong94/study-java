package hiding;

class User{
	public String name = "자바학생";
	// private가 적용된 항목은 객체를 통하여 접근 할 수 없다.(은닉성)
	private int age = 20;
}



public class Main01 {

	public static void main(String[] args) {

		User user = new User();
		
		// public 이므로 접근 가능
		System.out.println(user.name);
//		private 이므로 접근 불가능
//		System.out.println(user.age);
	
	
	}

}
