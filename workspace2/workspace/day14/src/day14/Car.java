package day14;

public class Car {

	String name;
	int carNum;
	public Car(String name, int carNum) {
		super();
		this.name = name;
		this.carNum = carNum;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", carNum=" + carNum + "]";
	}
	
	// 기본적으론 주소를 비교하지만 차번호를 비교하게 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return ((Car)obj).carNum ==this.carNum;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return carNum;
	}
	
}
