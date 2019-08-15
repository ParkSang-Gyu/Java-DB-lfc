package day12;

public class 클래스출력 {

	/* 클래스가 왜 필요한가?
	 * -학생의 정보를 따로 관리하면 불편하기 때문에 하나로 묶는 클래스를 만들면 편해서 사용한다
	 * getter, setter가 왜 필요한가?
	 * -학생 클래스의 멤버 변수를 public으로 설정하면 직접 정보를 변경할 수 있다
	 * 그래서 학생의 국어성적을 입력하는 중 실수로 200점을 입력하면 반영이 되면 안되는 상황이지만 수정이 되서 원하지 않는 결과가 발생하기 때문에 setter를 통해서 간접적으로 값을 입력한다
	 * getter와 setter를 사용할 땐 일반적으로 private을 사용한다
	*/
	
	//한 학교에서 학생 전체를 관리하기 위한 프로그램을 만드세요
	
	//학생의 이름, 학년, 반, 번호, 국어, 영어, 수학성적 등을 관리(어떻게 관리할 것인가?)
	//	- 클래스를 사용하지 않겠다(가능은 하지만 데이터가 많아질수록 불편함)
	//	- 학생클래스를 사용하겠다 : 멤버변수에 집중
	
	//관리 프로그램은 학생 정보 추가, 수정, 삭제, 출력하는 기능을 가짐(프로그램 기능을 어떻게 구현할 것인가?)
	//	- 프로그램매니저클래스 : 멤버메소드에 집중
	
	public static int MAX_STUDENT_COUNT=300;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager stdMng
		=new StudentManager(MAX_STUDENT_COUNT);
	stdMng.insert(new Student("홍길동",1,1,1,100,90,80));
	stdMng.insert(new Student("임꺽정",1,1,2,100,90,80));
	stdMng.print();
	stdMng.modify(new Student("유관순",1,1,1,100,100,100));
	System.out.println("--------------------------------");
	stdMng.print();
	stdMng.delete(new Student("",1,1,1,0,0,0));
	System.out.println("--------------------------------");
	stdMng.print();
	}
	public static void printMenu(){
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

}
