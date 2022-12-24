package jcf;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		//Set
		//중복된 값 저장 x
		//순서가 없음
		
		HashSet<String> fruits = new HashSet<>();
		HashSet<Integer> iSet	= new HashSet<>();
		
		iSet.add(1);
		iSet.add(2);
		iSet.add(5);
		iSet.add(4);
		iSet.add(3);
		iSet.add(0);
		iSet.add(8);
		iSet.add(9);
		iSet.add(7);
		iSet.add(6);
		
		System.out.println(iSet);
		// size()
		System.out.println(fruits.size());
		
		// add()
		fruits.add("사과");
		System.out.println(fruits);
		
		fruits.add("바나나");
		fruits.add("포도");
		fruits.add("배");
		fruits.add("복숭아");
		fruits.add("딸기");
		fruits.add("딸기");
		fruits.add("딸기");
		fruits.add("딸기");
		fruits.add("딸기");

		System.out.println(fruits.add("딸기")); // 중복된 값은 false 리턴
		System.out.println(fruits);
		
		// remove()
		fruits.remove("포도");
		System.out.println(fruits);
		
		// 요소 출력
		for (String s : fruits) {
			System.out.println(s);
		}
		
		
		System.out.println("-------------------------------------");
		
		// iterator() : Set에 순서를 부여하는 메서드
		// return 타입은 Iterator<요소> 타입이다.
		Iterator<String> it = fruits.iterator();
		
		// it.next() : set 속 요소를 하나씩 return 하는 메소드
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		
		// hasNext() : 다음 요소가 있다면 true, 없다면 false가 return
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
