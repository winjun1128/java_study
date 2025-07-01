package study.practice.practice52;

public class StudentMyScoreANDHakjumDTO {
	int studno;
	String name;
	String id;
	int grade;
	String jumin;
	
	//LocalDateTime birthday;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1;			//기본값 0
	//int deptno2;
	Integer deptno2;		//기본값 널
	int profno;

	//score
	int sstudno;
	int total;
	
	//hakjum
	String hgrade;
	int min_point;
	int max_point;
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public Integer getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(Integer deptno2) {
		this.deptno2 = deptno2;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public int getSstudno() {
		return sstudno;
	}
	public void setSstudno(int sstudno) {
		this.sstudno = sstudno;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getHgrade() {
		return hgrade;
	}
	public void setHgrade(String hgrade) {
		this.hgrade = hgrade;
	}
	public int getMin_point() {
		return min_point;
	}
	public void setMin_point(int min_point) {
		this.min_point = min_point;
	}
	public int getMax_point() {
		return max_point;
	}
	public void setMax_point(int max_point) {
		this.max_point = max_point;
	}
	public StudentMyScoreANDHakjumDTO() {}
	public StudentMyScoreANDHakjumDTO(int studno, String name, String id, int grade, String jumin, String birthday,
			String tel, int height, int weight, int deptno1, Integer deptno2, int profno, int sstudno, int total,
			String hgrade, int min_point, int max_point) {
		super();
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.jumin = jumin;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
		this.sstudno = sstudno;
		this.total = total;
		this.hgrade = hgrade;
		this.min_point = min_point;
		this.max_point = max_point;
	}
	@Override
	public String toString() {
		return "StudentMyScoreANDHakjumDTO [학번=" + studno + ", 이름=" + name+", 점수="+total+", 학점="+hgrade+"]";
	}
	
	
}
