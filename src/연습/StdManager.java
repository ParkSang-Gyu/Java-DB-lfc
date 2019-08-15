package 연습;

import java.util.*;

public class StdManager {
	
	private HashSet<Std> list = new HashSet<Std>();
	
	public boolean insert (Std s){
		Std tmp = new Std(s);
		return list.add(tmp);
	}
	
	public Std search (Std s){
		Iterator<Std> it = list.iterator();
		while (it.hasNext()){
			Std tmp = (Std)it.next();
			if (tmp.equals(s)){
				return tmp;
			}
		}
		return null;
	}
	
	public boolean update (Std s){
		if (!delete(s)){
			return false;
		}
		return list.add(s);
	}
	
	public boolean delete (Std s){
		Std tmp = search(s);
		return list.remove(tmp);
	}
	
	public void print (){
		Iterator<Std> it = list.iterator();
		while (it.hasNext()){
			Std tmp = it.next();
			System.out.println(tmp);
		}
	}
	
	public void printMenu (){
		System.out.println("1.학생정보추가");
		System.out.println("2.학생정보수정");
		System.out.println("3.학생정보삭제");
		System.out.println("4.학생정보출력");
		System.out.println("5.종료");
		System.out.println("-----------");
		System.out.println("메뉴를 입력하세요 : ");
	}
	
	public Std inputId(Scanner scan){
		System.out.println("정보를 입력하세요.");
		System.out.print("학번 : ");
		String id = scan.next().trim();
		Std tmp = new Std();
		tmp.setId(id);
		return tmp;
	}
	
	public Std inputStd(Scanner scan){
		Std tmp = inputId(scan);
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("학번 : ");
		String id=scan.next();
		System.out.print("전공 : ");
		String major=scan.next();
		System.out.print("학점 : ");
		char grade=scan.next().charAt(0);
		tmp.setName(name);
		tmp.setId(id);
		tmp.setMajor(major);
		tmp.setGrade(grade);
		return tmp;
	}
}
