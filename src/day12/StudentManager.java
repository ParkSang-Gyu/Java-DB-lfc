package day12;

import java.util.Scanner;

//멤버 변수 초기화 순서
	//기본 초기화>명시적 초기화>초기화 블록>생성자

public class StudentManager {
	
	private Student std[];//학생들 정보를 담을 배열
	private int count;//현재 저장된 학생 수
	private final int MIN_STUDENT_COUNT=300;
	public StudentManager(){
		std=new Student[MIN_STUDENT_COUNT];//객체 생성
	}
	public StudentManager(int studentCnt){
		if(studentCnt>=MIN_STUDENT_COUNT)
			std=new Student[studentCnt];//객체 생성
		else
			std=new Student[MIN_STUDENT_COUNT];//객체 생성
	}
	
	//학생정보 추가
	/*
	 *기능:학생정보를 배열에 추가
	 *매개변수:학생정보=>Student s
	 *			  =>String name, int grade, ...
	 *리턴타입:void
	 *메소드명:insert
	 */
	public void insert (Student s){
		//std[??]:Student 클래스의 객체는 초기에 선언만 되어 있음
		//insert 기능에서 객체 정보를 추가하려면 객체를 생성한 후 매개변수의 값을 복사해야 함
		//std[count++]=s; =>잘못된 코드(매개변수 s와 std[count]를 같이 사용하기 때문에 s가 바뀌면 std[count]도 같이 바뀔 수 있다
		
		//학년, 반, 번호로 검색해서 해당 학생 정보가 없으면 학생정보 추가
		//있으면 아무것도 안함
		if (search(s.getGrade(), s.getClassNum(), s.getNum())==-1){
			std[count++]=new Student(s);
			//std[count]=new Student(s);
			//count++;
		}
		
	}
	
	//학생정보 출력
	 /*
	 *기능:학생정보 전체 출력
	 *매개변수:없다
	 *리턴타입:없다=>void
	 *메소드명:print
	 */
	public void print(){
		for (int i=0;i<count;i++){
			System.out.println(std[i]);
		}
	}
	
	//학생정보를 수정 또는 삭제하기 위해 학생정보가 있는지를 알아야 하기 때문
	/*
	 * 기능:학생정보 검색해서 없으면 -1을 , 있으면 배열에 위치한 번지를 알려주는 기능
	 * 매개변수:학년, 반, 번호 =>int grade, int classNum, int num
	 * 리턴타입:-1 또는 번지=>int
	 * 메소드명:search
	 */
	private int search(int grade, int classNum, int num){
		for(int i=0;i<count;i++){
			if(std[i].getGrade()==grade &&
				std[i].getClassNum()==classNum &&
				std[i].getNum()==num){
				return i;
			}
		}
		return -1;
	}
	
	//학생정보 수정
	/*
	 * 기능:학생정보를 배열에서 수정
	 * 매개변수:학생정보 =>Student s
	 * 				=>String name, int grade, ...
	 * 리턴타입:없다 =>void
	 * 메소드명:modify
	 */
	public void modify(Student s){
		//검색했을 때 해당정보가 있는 번지	
		int searchIndex=search(s.getGrade(),s.getClassNum(),s.getNum());	
		if(searchIndex != -1){
			std[searchIndex] = new Student (s);
		}
	}
	//학생정보 삭제
	/*
	 * 기능:배열에서 학생정보를 삭제하는 기능
	 * 매개변수:학생정보 =>Student s
	 * 				=>String name, int grade,...
	 * 리턴타입:없다 =>void
	 * 메소드명:delete
	 */
	public void delete (Student s){
		int deleteIndex=search(s.getGrade(),s.getClassNum(),s.getNum());
		if(deleteIndex != -1){
			//배열을 밀기
			for(int i=deleteIndex;i<count-1;i++){
				std[i]=std[i+1];
			}
			std[count-1]=null;
			//현재 저장된 개수를 감소
			count--;
		}
	}
	public void printMenu(){
		System.out.println("------------");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}
	//기능 : Scanner가 주어지면 검색을 위한 학생의 정보를 콘솔을 통해 입력받아 학생 객체를 만들어 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 학생 객체 => Student
	//메소드명 : inputSearchStudent
	public Student inputSearchStudent(Scanner scan){
		Student s=new Student();
		System.out.print("학년 : ");
		s.setGrade(scan.nextInt());
		System.out.print("반 : ");
		s.setClassNum(scan.nextInt());
		System.out.print("번호 : ");
		s.setNum(scan.nextInt());
		return s;
	}
			
	//기능 : Scanner가 주어지면 학생의 정보를 콘솔을 통해 입력받아 학생 객체를 만들어 돌려주는 기능
	//매개변수 : Scanner scan
	//리턴타입 : 학생 객체 => Student
	//메소드명 : inputStudent
	public Student inputStudent(Scanner scan){
		Student s=inputSearchStudent(scan);
		System.out.print("이름 : ");
		s.setName(scan.next());//next는 공백을 무시하지만 nextLine은 공백을 인정
		System.out.print("국어점수 : ");
		s.setKor(scan.nextInt());
		System.out.print("수학점수 : ");
		s.setMath(scan.nextInt());	
		System.out.print("영어점수 : ");
		s.setEng(scan.nextInt());
		return s;
	}
}
