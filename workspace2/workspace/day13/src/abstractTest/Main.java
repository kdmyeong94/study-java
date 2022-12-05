package abstractTest;

public class Main {
	public static void main(String[] args) {
		
//		Cat cat = new Cat();
//		cat.cry();
//		cat.eat();
		
//		Dog dog = new Dog();
//		dog.cry();
//		dog.eat();
//		
//		Eagle eagle = new Eagle();
//		eagle.cry();
//		eagle.eat();
//		
//		// 추상클래스는 일반적으로 객체화를 할 수 없다
//		// 추상클래스는 메모리상에 미구현된 공간이 존재하기에 객체화 할 수 없다.
////		Animal a= new Animal();
//
//		
		Animal animal = new Cat();
		animal.cry();
		
		((Cat)animal).cry();
		
	}
}
