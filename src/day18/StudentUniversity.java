package day18;
	//대학생 클래스 생성하고 멤버로
	//학년에는 열거형으로 학년을 설정한다(1~5)
	//성별도 열거형으로 설정(남성, 여성)
	//과도 열거형으로
	//학번, 평점, 학교이름은 자유롭게

public class StudentUniversity {
	private Gender gender;
	private Major major;
	private Grade grade;
	private String name;
	private Integer id;
	private String universityName;
	private double average;
	
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public double getAverage() {
		return average;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	public StudentUniversity(){
		gender=Gender.MALE;
		major=Major.FRANCAIS;
		grade=Grade.FRESHMAN;
	}
	public StudentUniversity(Gender gender,Major major,Grade grade,
			String name,Integer id){
		this.gender=gender;
		this.major=major;
		this.grade=grade;
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "StudentUniversity [성별=" + gender + ", 학과=" + major + ", 학년=" + grade + ", 이름=" + name
				+ ", 학번=" + id + ", 대학=" + universityName + ", 학점=" + average + "]";
	}
	
}