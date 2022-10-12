package hiding;

public class Main04 {

	public static void main(String[] args) {
		
//		객체생성
		Article art = new Article(1,"글제목","글내용",
				"작성자",1,"작성일지");
		
		
//		출력
		System.out.println(art.getSeq());
		System.out.println(art.getSubject());
		System.out.println(art.getContent());
		System.out.println(art.getWriter());
		System.out.println(art.getHit());
		System.out.println(art.getRegDate());
	}
	
}
