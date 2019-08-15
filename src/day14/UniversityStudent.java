package day14;

public class UniversityStudent extends Person {

		// 대학교 학생을 관리하는 프로그램
		// =>UniversityStudent(일반 대학교를 다니는 학생)
		// 학사, 석사, 박사 학위를 구분
		// 사람=>person
		//이름, 나이, 성별, 생일, 주소, 국적
		// 클래스의 객체는 참조변수이므로 주소를 저장해야 해서 대입연산자를 신중히 사용해야 하지만 String은 일반 클래스와 좀 다르다
	
	// 멤버 변수
	private String id;//학번
	private String state;//재학여부(재학, 휴학, 수료, 졸업, 제적)
	private double averageScore;//학점
	private int semester;//학기
	private String major;//전공
	private String universityName;//학교이름
	private String advisor;//지도교수
	//getters와 setters
	public String getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public int getSemester() {
		return semester;
	}
	public String getMajor() {
		return major;
	}
	public String getUniversityName() {
		return universityName;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setAverageScore(double averageScore) {
		if(averageScore>=0)
		this.averageScore = averageScore;
	}
	public void setSemester(int semester) {
		if(semester>0)
		this.semester = semester;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	//생성자
	public UniversityStudent(){
		//super();기본생성자 호출할꺼면 써도 되고 안써도 됨(자동생성되므로)
		setSemester(1);
		setAverageScore(0.0);
		id="";advisor="";state="";universityName="";major="";
	}
	public UniversityStudent (UniversityStudent s){
		super(s);
		setSemester(s.semester);
		setAverageScore(s.averageScore);
		id=s.id;advisor=s.advisor;state=s.advisor;
		universityName=s.universityName;major=s.major;
	}
	public UniversityStudent (String name, String address,
			String nationality, String gender, String birthDay, int age,
			int semester, double averageScore,String id, String advisor,
			String state, String universityName, String major){
		super(name, address, nationality, gender, birthDay, age);
		setSemester(semester);
		setAverageScore(averageScore);
		this.id=id;this.advisor=advisor;this.state=state;
		this.universityName=universityName;this.major=major;
	}
}
