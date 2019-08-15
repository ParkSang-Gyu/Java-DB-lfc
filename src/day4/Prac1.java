package day4;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1+num2);
		scan.close();
		Scanner scan1 = new Scanner(System.in);
		int num3, num4;
		num3 = scan1.nextInt();
		num4 = scan1.nextInt();
		char op = scan1.next().charAt(0);
		if (op == '+'){
			System.out.println(num3+num4);
		}else if(op == '-'){
			System.out.println(num3-num4);
		}else if(op == '*'){
			System.out.println(num3*num4);
		}else{
			System.out.println(num3/num4);
		}
		scan1.close();
		//
		Scanner scan2 = new Scanner(System.in);
		int num5, num6;
		char op1;
		num5 = scan2.nextInt();
		num6 = scan2.nextInt();
		op1 = scan2.next().charAt(0);
		switch (op1) {
		case '+':
			System.out.println(""+num5+op1+num6+"="+(num5+num6));
		//문자열 + 정수 = 문자열. 따라서 앞에 큰 따옴표를 넣어 문자열 형태로 만들어줌
			break;
		case '-':
			System.out.println(""+num5+op1+num6+"="+(num5-num6));
			break;
		case '*':
			System.out.println(""+num5+op1+num6+"="+(num5*num6));
			break;
		case '/':
			switch (num6) {
			case 0:
				System.out.println("0으로 나눌 수 없습니다");
				break;
			default:
					System.out.println(""+num5+op1+num6+"="+((double)num5/num6));
			}
			break;
		default:
			break;
		} 
		scan2.close();
	}
	
}
