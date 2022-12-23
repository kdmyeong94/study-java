package jcf;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("홍길동");
		names.add("홍길동");
		names.add("이순신");
		names.add("홍길동");
		names.add("홍길동");
		
//		int size = names.size();
//		
//		for(int i = 0; i< size ; i++) {
//			System.out.println(names.remove(0));
//			System.out.println(names.size());
//		}
		
//		while(!names.isEmpty()) {
//			System.out.println(names.remove(0));
//		}
		
		for( String name : names) {
			System.out.println(names.remove(name));
		}
		
		System.out.println("List size : " + names.size());
		
	}
}
