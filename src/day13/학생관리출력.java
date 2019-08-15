package day13;

import java.util.Scanner;

import day12.Student;
import day12.StudentManager;

public class 학생관리출력 {
	
	public static void main(String[] args) {//메인 메소드는 입력받은 것을 호출해주는 역할
		//StudentManager의 객체 멤버 메소드 printMenu를 호출하려면 StudentManager 객체를 생성해야 한다
		StudentManager Mng = new StudentManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
			Mng.printMenu();
			menu=scan.nextInt();
			Student s=new Student();//new Student부분은 생략 가능 
			switch (menu) {
				case 1:
					System.out.println("추가할 학생 정보를 입력하세요");				
					s=Mng.inputStudent(scan);				
					Mng.insert(s);
						break;
				case 2:
					System.out.println("수정할 학생 정보를 입력하세요");
					s=Mng.inputStudent(scan);
					Mng.modify(s);
					break;
				case 3:
					System.out.println("삭제할 학생 정보를 입력하세요");
					s=Mng.inputSearchStudent(scan);
					Mng.delete(s);
					break;
				case 4:	
					System.out.println("학생정보출력");
					Mng.print();
					break;
				case 5:System.out.println("종료");break;
			
				default:System.out.println("잘못된 번호입니다. 다시 입력하세요");
						Mng.printMenu();
						menu=scan.nextInt();
					break;
			}
			
		
		}while(menu!=5);
		
		/*for (;menu!=5;){
			stdMng.printMenu();
			menu=scan.nextInt();
		}*/
		
		/*while(menu!=5){
			stdMng.printMenu();
			menu=scan.nextInt();
		}*/
		
		
		
		scan.close();
		
	}

}
