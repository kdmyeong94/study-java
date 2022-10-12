package extendsobject;

public class FileArticle extends Article{

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String toString() {
		return "FileArticle[글 번호 = " + getNum()
		+ ", 글제목 = "+ getTitle()
		+ " , 답변 = " + fileName+  " ] ";
	}
}
