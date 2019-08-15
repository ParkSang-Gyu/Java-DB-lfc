package day12;

public class Student{
	private String name;
	private int grade;
	private int classNum;
	private int num;
	private double kor;
	private double math;
	private double eng;
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getNum() {
		return num;
	}
	public double getKor() {
		return kor;
	}
	public double getMath() {
		return math;
	}
	public double getEng() {
		return eng;
	}
	public void setName(String name) {
		//멤버변수 name에 매개변수 name을 저장해라
		//우선순위가 멤버변수보다 매개변수 또는 지역변수가 크기 때문에 밑의 코드는 아무 의미 없다
		//name=name;매개변수=매개변수
		if (name.length()<=5)
		//매개변수 또는 지역변수의 이름이 멤버변수와 동일한 경우
		//멤버변수와 매개변수(지역변수)를 구분하기 위해 this.을 붙인다
		//this : 현재 클래스(나)를 의미
		//. : 멤버변수나 멤버메소드를 호출하는 연산자(클래스나 객체명 다음에 온다)
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(double kor) {
		if (kor >= 0 && kor <= 100)
		this.kor = kor;
	}
	public void setMath(double math) {
		if (math >= 0 && math <= 100)
		this.math = math;
	}
	public void setEng(double eng) {
		if (eng >= 0 && eng <= 100)
		this.eng = eng;
	}
	
	//생성자는 객체를 만들 때(new 연산자를 호출한 시점에 만들어짐) 멤버 변수를 원하는 값으로 초기화 하고 싶은 때 구현해준다
	//생성자를 구현하지 않으면 기본생성자가 자동으로 만들어진다(필요하면 만들고 필요하지 않으면 만들지 않아도 된다)
	//단, 생성자가 하나라도 구현되어 있으면 기본생성자가 자동으로 만들어지지 않는다
	
	//0학년, 0반, 0번은 없으므로 1학년, 1반, 1번으로 초기화해주자
	//아무 정보도 안 넣는 경우
	public Student(){
		init();
	}
	//정보를 다 넣는 경우
	public Student(String name, int grade, int classNum, int num, double kor, double math, double eng){
		init(name, grade, classNum, num, kor, math, eng);
	}
	//복사생성자(정보를 수정하거나 기존 정보와 유사할 때)-비효율적
	public Student(Student s){
		init(s.name, s.grade, s.classNum, s.num, s.kor, s.math, s.eng);
	}
	//멤버변수를 초기화하는 메소드
	public void init(){
		init("",1,1,1,0,0,0);//재귀호출이 아니다
	}
	public void init(String name, int grade, int classNum, int num, double kor, double math, double eng){
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);
		this.setNum(num);
		this.setKor(kor);
		this.setMath(math);
		this.setEng(eng);
	}
	@Override
	//선택사항이긴 한데 보통 많이 사용함
	//메인 메소드에서 일일이 출력작업해야 할 것을 toString을 통해 간편하게 할 수 있다-깔끔하고 예쁘게 출력할 때
	public String toString() {
		return "Student [name=" + name + ", " + grade + " 학년, " + classNum + " 반, " + num + " 번, kor=" + kor
				+ ", math=" + math + ", eng=" + eng + "]";
	}
}