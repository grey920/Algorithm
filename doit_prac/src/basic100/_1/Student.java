package basic100._1;

public class Student {
	//멤버변수는 웬만하면 private으로 주는게 좋다
	private String name;
	private String no;
	
	// name과 no를 받아서 초기화 하기
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
}
