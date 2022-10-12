package extendsobject;

public class QNAarticle extends Article {

	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String toString() {
		return "QNAArticle[ 글번호 = " + getNum()
		 + ", 글제목 = "+ getTitle()
		 + ", 답변 = " + answer+  " ] ";
	}
	
}
