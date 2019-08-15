package day19;

import java.util.ArrayList;
import java.util.Iterator;

import day20.Grade;

public class Std {
	//String 객체 멤버는 기본값이 null이기 때문에 ""빈 문자열로 명시적 초기화를 해주면 보기에 좋다
	//초기화 순서 : 기본값>명시적 초기화>초기화 블록>생성자
	//명시적 초기화를 해주면 기본생성자를 만들 필요가 없다
	//접근제한자가 private이기 때문에 외부에서 접근이 불가 => getter/setter가 필요한 이유
	private String name="";//초기값이 null로 출력되기 때문에 빈 문자열로 초기화 해줌
	private String Sname="";//학교이름
	private String id="";
	private String major="";
	private double avr;
	private ArrayList<Grade> subjectList = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 학교이름 : " + Sname + ", 학번 : " + id + ", "
				+ "전공 : " + major + ", 평점 : " + avr + "]";
	}
	//그룹 == 분류
	//id가 같으면 같은 그룹에 있게 하기 위해서
	//hashCode와 equals는 항상 세트로 오버라이딩을 해야함
	//같다는 것을 판별하기 위한 정보들이 있는데 이 정보들이 같은데 다른 그룹이면 다른 객체로 판별하게 된다.
	//따라서 같은 객체로 판별하기 위해서는 같은 정보를 가지면 같은 그룹에 있게 해야 한다
	//객체 하나당 하나의 그룹을 갖고 있다(나:1반, 너:1반)=>하나의 그룹에 여러 개의 객체가 있다
	//=>그래서 하나의 그룹에 같은 객체가 있을 수 있다
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	/*생성자는 클래스명과 동일하고 리턴타입이 없다.
	마음대로 호출할 수 없고 객체가 생성될 때(new라는 연산자를 사용해서 객체를 만들었을 때) 호출된다*/
	
	//기본 생성자는 생성자가 하나도 없으면 자동으로 생성되지만
	//다른 생성자가 있으면 자동으로 생성되지 않는다
	//사실 이 클래스에서 기본 생성자가 할 일은 없다=>명시적 초기화를 해줬기 때문에
	//다른 생성자를 만들거고 혹시나 기본 생성자를 이용해서 
	//객체를 만들 상황이 있을 수도 있기 때문에 간단히 만들어줬다
	public Std(){}
	
	//복사 생성자 : 매개변수로 같은 클래스의 객체가 넘어오는 경우
	//오버로딩 : 한 클래스 내에서 동일한 이름을 가진 메소드(혹은 생성자)가 여러개 존재하는 경우를 말한다
	//매개변수의 개수가 다르거나 자료형이 달라야 한다(오버로딩의 조건)
	public Std(Std s){
		//this()는 내 생성자를 호출한다
		//복사 생성자는 아래에서 구현한 생성자 오버로딩을 호출하여 코드의 중복을 제거함
		this(s.name,s.id,s.Sname,s.major,s.avr,s.subjectList);
	}
	
	//생성자 오버로딩
	public Std(String name,String id,String sName,
			String major,double avr,ArrayList<Grade> subjectList){
		//this는 나를 의미한다
		this.name=name;
		this.id=id;
		this.Sname=sName;
		this.major=major;
		this.avr=avr;
		this.subjectList=subjectList;
	}
	
	/* 기능:학생이 수강과목을 입력하면 subjectList에 추가
	 * 매개변수:수강과목=>Grade grade
	 * 리턴타입:없다=>void
	 * 메소드명:insertSubject
	 */
	public void insertSubject(Grade grade){
		subjectList.add(grade);
		//평점을 다시 계산=>평점을 계산=>과목추가 사용, 과목수정 사용, 과목삭제 사용
		//평점을 계산하려면 각 학점의 점수
		calculateAverage();
	}
	
	/* 과목 리스트에 있는 과목들의 평점을 계산
	 * 매개변수:없다=>과목리스트에 있는 과목들의 정보는 멤버변수subjectList에 있기 때문에
	 * 리턴타입:없다=>평점을 멤버변수 avr에 저장하기 때문에 따로 알려 줄 필요없고
	            * 평점에 대한 정보를 확인하려면 getAvr()를 호출하면 된다
	 * 메소드명:calculateAverage
	 */
	public void calculateAverage(){
		//리스트에 있는 과목들을 하나씩 꺼내어 해당 과목에서 받은 성적을 계산한 후 avr에 저장
		/* 1.리스트에 있는 과목들을 하나씩 꺼냄=>반복문을 통해서
		 * 2.해당 과목에서 받은 성적을 이용해 계산
		 * 2.1 P인 경우 해당 학점을 계산에 추가하지 않는다
		 * 2.2 그 외의 성적은 해당 학점에 대한 평점을 구하고(?????)
		 *     평점과 학점을 곱한 값을 누적시키고 학점도 누적시킨다
	     * 3.반복문이 종료되면 평점과 학점을 누락시킨 칼ㄹ에 누적시킨 합점으로 나눈 후 avr에 저장    
		 */
		Iterator<Grade> it = subjectList.iterator();
		int sumUnit = 0;
		double sumPoint = 0.0;
		while (it.hasNext()){
			//리스트에서 과목을 하나 꺼냄
			Grade tmp = it.next();
			if (tmp.getStep().equals("P"))
					continue;
			//평점과 학점을 곱한 값을 누적
			sumPoint += tmp.getPoint()*tmp.getUnit();
			//평점을 누적
			sumUnit += tmp.getUnit();
		}
		avr = sumPoint/sumUnit;
	}
	//선택한 학생의 수강과목을 출력하는 기능
	//매개변수:없다
	//리턴타입:선택한 학생이 있는지 없는지, 수강과목이 있는지 없는지를 알려주기 위해 boolean
	public boolean printSubjects (){
		if (subjectList.size()==0)
			return false;
		Iterator<Grade> it = subjectList.iterator();
		while (it.hasNext()){
			Grade tmp = it.next();
			System.out.println(tmp);
		}
		return true;
	}
}
