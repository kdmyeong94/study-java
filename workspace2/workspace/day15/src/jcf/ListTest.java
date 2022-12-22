package jcf;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		
//		String[] names = new String[3];
//		int[] iarr = new int[3];
		
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> inames = new ArrayList<>();
		
		System.out.println(names);
		
		// add(요소) : 요소를 맨 뒤에 추가
		System.out.println(names.add("Hello!"));
		
		// isEmpty(); : 비어있다면 true, 아니면 false가 return 되는 메소드
		System.out.println(names.isEmpty());
		
		// size() : 리스트 요소 갯수를 return
		System.out.println(names.size());
		
		names.add("홍길동");
		names.add("홍길동");
		names.add("이순신");
		names.add("홍길동");
		names.add("홍길동");
		
		System.out.println(names);
		// add(인덱스, 요소) : 해당 인덱스 위치에 요소 삽입
		names.add(3, "강감찬");
		
		System.out.println(names);
		
		// remove(인덱스) : 해당 인덱스 요소 삭제.
		System.out.println(names.remove(3));
		
		System.out.println(names);
		
		// remove(요소) : 해당 요소 삭제, 성공시 true, 실패시 false return
		System.out.println(names.remove("Hello!"));
		System.out.println(names);
		
		// get(인덱스) : 값 가져오기
		System.out.println(names.get(2));
		
		for(int i = 0; i< names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("======================");
		
		for(String str : names) {
			System.out.println(str);
		}
		
		System.out.println("======================");
		LinkedList<String> li = new LinkedList<>();
		
		System.out.println(li);
		
		li.add("홍길동");
		li.add("홍길동");
		li.add("홍길동");
		li.add("홍길동");
		li.add("홍길동");

		System.out.println(li);
		
		LinkedList<Integer> li2 = new LinkedList<>();
		li2.add(1);
		System.out.println(li2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
