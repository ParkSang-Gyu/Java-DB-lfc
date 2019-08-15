package day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int num = 3;
		switch(num % 2){
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;	
		}
		
		//달력에 각 달마다 마지막 일수가 다릅니다.
		//달이 입력되면 해당하는 달의 마지막 일수를 출력
		int month = 1;
		switch (month) {
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31"+'일');
				break;
			case 2:
				System.out.println("28"+'일');
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30"+'일');
				break;
		}
		//쌤 방식
		Scanner scan = new Scanner(System.in);
		int month1 = scan.nextInt();
		switch (month1) {
			case 1:  
			case 3:  
			case 5:  
			case 7:  
			case 8: 
			case 10: 
			case 12:
				System.out.println("31일");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
		}
		scan.close();
		//컴퓨터가 랜덤으로 가위, 바위, 보 중에서 하나 선택하고
		//유저가 가위, 바위, 보 중에서 하나 선택하면
		//누가 이겼는지 확인하는 게임
		//랜덤으로 원하는 범위의 정수(a~b)를 만드는 방법
		// 0 * (b-a+1) + a <= Math.random() * (b-a+1) + a < 1 * (b-a+1) + a
		// a <= Math.random() * (b-a+1) + a < b + 1
				int min=1;
				int max=3;
				int com = (int) (Math.random() * (max-min+1) + min);
				int user = 0;
				Scanner scan1 = new Scanner(System.in);
				System.out.println("가위(1),바위(2),보(3) 중 하나를 입력하시오.");
				user = scan1.nextInt();
				switch(user-com){
				case 0:
					System.out.println("무승부");
					break;
				case -1:
				case 2:
					System.out.println("컴퓨터 승");
					break;
				case 1:
				case -2:
					System.out.println("사용자 승");
					break;
				}
					System.out.println(com);
					scan1.close();
	}
}
