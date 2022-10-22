package day03;

import java.util.Scanner;

public class BufferTest {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.printf("age : %d, name : %s.", age, name);
		
		
		
	}
}
