package jcf;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		// List
		/* - 데이터가 중복으로 저장 가능.
		 * - 순서가 있다.
		 */
		
		// Set
		/*
		 * - 데이터 중복 불가능
		 * - 순서가 없다.
		 */
		
		
		// Map
		/*
		 * - 키/값 쌍으로 데이터를 저장
		 */
		
		

		HashMap<String, Integer> menus = new HashMap<>();
		
		System.out.println(menus);
		
		System.out.println(menus.size());
		
		// value 는 중복 가능, key값은 중복 불가능 , 중복된 key값을 입력하게되면 기존 데이터가 덮어씌워진다.
		menus.put("영어", 70);
		menus.put("수학", 100);
		menus.put("과학", 80);
		menus.put("국어", 10);
		
		System.out.println(menus);
		
		System.out.println(menus.size());
		
		System.out.println("-------------");
		
		System.out.println("국어 : " + menus.get("국어"));
		System.out.println("과학 : " + menus.get("과학"));
		System.out.println("수학 : " + menus.get("수학"));
		System.out.println("영어 : " + menus.get("영어"));
		System.out.println("사회 : " + menus.get("사회"));
		
		System.out.println("-------------");
		
		System.out.println(menus);
		menus.remove("국어");
		System.out.println(menus);
		
		// Map은 인덱스가 없기 때문에, 기본적인 for문으로는 안의 값을 가져 올 수 없다
//		for(int i=0; i<menus.size(); i++) {
//			menus.get();
//		}
		
		// keySet() : key값들이 들어있는 컬렉션 ( Set) 객체가 return
		Set<String> keys = menus.keySet();
		System.out.println("----keySet----");
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + menus.get(key));
		}
		
		
		// values() : value 들이 들어있는 컬렉션 객체가 return
		System.out.println(menus.values());
		
		Collection<Integer> values = menus.values();
		System.out.println("컬렉션 사이즈: " + values.size());
		System.out.println(values);
		System.out.println(values.remove(100));
		System.out.println(values);
//		values.add(1); values()는 고정된 배열이 return 되기 때문에, 값을 추가 할 수 없다.
		
//		System.out.println(menus.entrySet());
		
//		Set<Entry<String, Integer>> es = menus.entrySet();
//		for(Entry<String, Integer> e : es ) {
//			System.out.println(e);
//			System.out.println("key : " + e.getKey());
//			System.out.println("value : " + e.getValue());
//			System.out.println();
//		}
		
	}
		
}

