package day19;

import java.util.Scanner;

import day20.Grade;

public class StdTest {

	public static void main(String[] args) {
		StdManager sMng = new StdManager();
		/*Std std = new Std("홍길동","2019100100","한국대","컴퓨터",0.0);
		System.out.println(std);
		std.insertSubject(new Grade("A+","세종대왕","한글",3));
		System.out.println(std);
		std.insertSubject(new Grade("B","이순신","해상학",2));
		System.out.println(std);*/
		/*sMng.insert(new Std("홍길동","2019100100","한국대","컴퓨터",0.0));
		sMng.insert(new Std("임꺽정","2019100100","한국대","컴퓨터",0.0));
		sMng.insert(new Std("유관순","2019100101","한국대","컴퓨터",0.0));
		sMng.delete(new Std("유관순","2019100101","한국대","컴퓨터",0.0));
		sMng.update(new Std("이순신","2019100100","한국대","컴퓨터",0.0));
		sMng.print();*/
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			//메뉴 출력
			sMng.printMenu();
			//메뉴 선택
			menu=scan.nextInt();
			Std std;
			Std result;
			int subMenu;
			switch (menu){
				case 1: 
					std = sMng.inputStd(scan);
					if(sMng.insert(std))
						System.out.println("학생 정보를 추가했습니다.");
					else
						System.out.println("이미 등록된 학번입니다.");
						break;
				case 2: 
					/* 기존엔 학생정보를 입력받고 학생정보를 추가했다면
					 * 변경후엔 2번 선택시 학생정보 수정 또는 과목 등록을 할 수 있게 한다
					 */
					//메뉴 출력
					System.out.println("2-1.학생 정보 수정");
					System.out.println("2-2.학생 수강과목 등록");
					System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
					//메뉴 선택
					subMenu = scan.nextInt();
					//선택된 메뉴의 해당 기능 동작
					if (subMenu==1){
						std = sMng.inputStd(scan);
						if(sMng.update(std)){
							System.out.println("해당 학생 정보를 수정했습니다.");
						}else {
							System.out.println("없는 학번입니다.");
						}
					}else if(subMenu==2){
						//과목 추가하는 기능 작성
						//학생 정보 검색해서 학생 객체 가져옴
						std=sMng.inputId(scan);
						result = sMng.search(std);
						if (result==null){
							System.out.println("없는 학번입니다.");
								break;
						}
						//과목 입력 후 입력받은 과목을 통해 과목 객체 생성
						Grade grade = sMng.inputSubject(scan);
						//위에서 검색한 학생 객체에 입력받은 과목 객체를 추가
						result.insertSubject(grade);
						//학생 정보 수정
						sMng.update(result);
						}
						break;
				case 3: 
					std = sMng.inputId(scan);
					if(sMng.delete(std))
						System.out.println("해당 학생 정보를 삭제했습니다.");
					else
						System.out.println("없는 학번입니다.");
					break;
				case 4:
					//서브메뉴 출력
					//1.전체학생 출력
					//2.학생 수강과목 출력
					//서브메뉴 선택
					//조건문을 통해 구현
					//학생정보 입력을 받아 객체로 만들고=>stdManager.inputId() 
					//만들어진 객체와 일치하는 학생의 정보를 가져온다=>stdManager.search()
					//해당 학생 객체의 수강 과목을 출력하고=>std.printSubject()메소드 추가
					//없으면 아무것도 안함
					System.out.println("4-1.전체 학생 출력");
					System.out.println("4-2.학생 수강과목 출력");
					System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
					
					subMenu = scan.nextInt();
					if (subMenu==1) sMng.print();	
					else if(subMenu==2){
						std=sMng.inputId(scan);
						result = sMng.search(std);
						if (!result.printSubjects()){
							System.out.println("수강한 강의가 없습니다.");
						}
					}
						break;
				case 5: break;
			default :
				System.out.println("-------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("-------------------");
			}
		}while(menu != 5);
		scan.close();
	}

}
