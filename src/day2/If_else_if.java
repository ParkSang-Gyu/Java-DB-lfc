package day2;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		int num = 0;
		//num가 0이면 0이라고 출력하고, 1이면 1이라고 출력하고, 0과 1이 아니면 0과 1이 아닙니다라고출력//
		if (num  == 0) {
			System.out.println("0");
		} else if (num == 1) {
			System.out.println("1");
		} else {System.out.println("0과 1이 아닙니다");}
		
		//num가 2의 배수이면 2의 배수라고 출력
		int num1 = 4;
		if (num1 % 2 == 0) {
			System.out.println(num1+"는 2의 배수");
		}
			
		//num가 2의 배수이면 2의 배수라고 출력하고
		//num가 3의 배수이면 3의 배수라고 출력하고
		//num가 6의 배수이면 6의 배수라고 출력하고
		//num가 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력
		//num = 6 => 6의 배수입니다만 출력
		int num2 = 6;
		if (num2 % 2 == 0 && num2 % 3 == 0) {
			System.out.println("6의 배수");
		}else if (num2 % 2 == 0) {
			System.out.println("2의 배수");
		}else if (num2 % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다");
		}
		
		//점수가 주어지면 점수에 맞는 학점을 출력
		//90점 이상~100점 이하 : A
		//80점 이상~90점 미만 : B
		//70점 이상~80점 미만 : C
		//60점 이상~70점 미만 : D
		//0점 이상~60점 미만 : F
		//0점 미만, 100점 초과 : 잘못된 점수입니다.
		int score = 75;
		if (score >= 90 && score <= 100) {
			System.out.println("grade " + "A");
		} else if (score >= 80 && score < 90) {
			System.out.println("grade " + "B");
		} else if (score >= 70 && score < 80) {
			System.out.println("grade " + "C");
		} else if (score >= 60 && score < 70) {
			System.out.println("grade " + "D");
		} else if (score >= 0 && score < 60) {
			System.out.println("grade " + "F");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
		
		//쌤 코드
		Scanner scan1 = new Scanner(System.in);
		double score1 = scan1.nextDouble();
		if (score1>=90 && score1<=100) {
			System.out.print("A");
		} else if (score1>=80 && score1<90) {
			System.out.println("B");
		} else if (score1>=70 && score1<80) {
			System.out.println("C");
		} else if (score1>=60 && score1<70) {
			System.out.println("D");
		} else if (score1>=0 && score1<60) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
		scan1.close();
		
		//다른 방법
		Scanner scan2 = new Scanner(System.in);
		double score2 = scan2.nextDouble();
		if ((int)score2/10==9 || score2==100) {
			System.out.print("A");
		} else if (score2/10==8) {
			System.out.println("B");
		} else if (score2/10==7) {
			System.out.println("C");
		} else if (score2/10==6) {
			System.out.println("D");
		} else if (score2>=0 && score2<60) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
		scan2.close();
		
	}

}
