package study.practice.Practice33;

public class Student {
	private String major;
	private int studentNum;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.setMajor("컴퓨터공학과");
		s.setStudentNum(20172252);
		System.out.printf("학번은 %d 이고 학과는 %s 입니다.\n",s.getStudentNum(),s.getMajor());
	}

}
