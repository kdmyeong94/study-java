package boxing;

public class Main01 {

//		부모 클래스에 대한 객체 배열을 생성하고 배열의 요소에 자식클래스 객체를 할당하면,
//		자동으로 암묵적 형 변환이 이루어 진다.
	public static void main(String[] args) {
		
//		부대 지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군 1호");
		units[1] = new AirForce("공군 2호");
		units[2] = new Navy("해군 1호");
		units[3] = new Army("육군 2호");
		units[4] = new Army("육군 2호");
		
//		부대 일괄 공격
		
		for (int i = 0 ; i < units.length; i++) {
			units[i].attack();
			
//			instanceof
			if ( units[i] instanceof Army ) {
				Army a = (Army)units[i];
				a.tank();
			}
			if ( units[i] instanceof Navy) {
				Navy b = (Navy)units[i];
				b.nucleus();
			}
			if ( units[i] instanceof AirForce) {
				AirForce c = (AirForce)units[i];
				c.bombing();
			}
			
//			if ( units[i] instanceof Army ) {
//				Army a = (Army)units[i];
//				a.tank();
//			} else if ( units[i] instanceof Navy) {
//				Navy b = (Navy)units[i];
//				b.nucleus();
//			} else {
//				AirForce c = (AirForce)units[i];
//				c.bombing();
//			}
			
			
		}
		
		
		
	} //2
} //1
