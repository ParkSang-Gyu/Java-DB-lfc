package day9;

import java.util.Scanner;//다른 패키지에 있는 public 클래스를 사용하려면 import 패키지.클래스명; 을 선언해야 해당 클래스를 사용할 수 있다

import day8.Method_multiTable;
import day8.Method_recursive;

public class ClassExplain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Scanner(System.in)라는 생성자를 호출
		//int num = scan.nextInt();//Scanner 클래스의 멤버 메소드
		//char ch = scan.next().charAt(0);
		//next()는 Scanner 클래스의 멤버 메소드
		//charAt(0)는 String 클래스의 멤버 메소드
		scan.close();
		Tv tv=new Tv();
		tv.printChannel();
		Tv tv2=new Tv();
		tv2.printChannel();
		//Tv tv3=tv; => tv3는 tv와 같은 값을 가진다(tv에 있던 주소를 tv3에 저장했기 때문에)
		scan.close();
		
		//Class.main(s); =>다른 파일에서 클래스명.메소드명을 입력하면 사용할 수 있다
		int res=Method_recursive.factorial(5);
		System.out.println(res);
		Method_multiTable.printMultiTables(2, 9);
	}
	
}
