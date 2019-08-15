package day5;

import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		// for (초기화;조건식;증감연산) {
		// 실행문;
		// }
		// 초기화;
		// while (조건식) {
		// 실행문;
		// 증감연산;
		// }
		
		// for문과 while문의 차이는 문법 차이(조건식만 오느냐 초기화 \, 조건식, 증감연산이 같이 오느냐)
		// for문은 조건식에 아무것도 안와도 됐지만 while문은 조건식이 무조건 와야 한다.
		
		// while문의 무한루프 만드는 법
		// while (true) {
		// 실행문;
		// }
		
		// 1부터 10까지 합
		int i, sum;
		i=1;
		sum=0;
		while (i<=10){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		// do while문
		
		// for문과 while문은 조건식에 따라 한번도 실행되지 않을 수 있다.
		// do while문은 조건식에 따라 무조건 1번은 실행된다.
		
		// do {
		// 실행문;
		// } while(조건식);
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 삭제");
			System.out.println("4.학생정보 확인");
			System.out.println("5.종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu=scan.nextInt();
		} while (menu!=5);
		scan.close();
	}

}
