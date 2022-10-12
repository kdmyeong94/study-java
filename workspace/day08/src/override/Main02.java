package override;

class Hello2 {
	Hello2(String msg){
		System.out.println(msg);
	}

}

class Korean2 extends Hello2 {
//	 부모와 동일한 파라미터를 받도록 생성자를 정의하고,
//	전달 받은 파라미터를 부모에게 재전달 해야 한다.
	Korean2(String msg) {
		super(msg);
	}

}

public class Main02 {

	public static void main(String[] args) {

	}
}
