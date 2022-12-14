package inheritance;

public class Car {

	private String name;
	private String color;
	private int price;
	
	public Car() {
//		System.out.println("Car 객체가 만들어집니다.");
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public Car(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 
	
	public void go() {
		System.out.println("전진");
	}
	 
	public void engineOn() {
		System.out.println("시동 켜기");
	}
	
	public void show() {
		System.out.println("--차량정보--");
		System.out.println("모델 : " + name);
		System.out.println("컬러 : " + color);
		System.out.println("가격 : " + price);
	}
	
}
