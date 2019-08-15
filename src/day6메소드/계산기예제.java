package day6메소드;

public class 계산기예제 {

	public static void main(String[] args) {
		// 기능 : 두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메소드
		// 리턴타입 : 계산결과 ==> double
		// 매개변수 : 두 정수와 산술연산자 ==> int num1, int num2, char op
		// 메소드명 : calc
		// public static double calc (int num1, int num2, char op){
		//                 return 0.0;
		// }
		int num1=1, num2=2;
		char op='*';
		System.out.println(calc(num1, num2, op));
	}
	public static double calc (int num1, int num2, char op){	               
			double res = 0.0;
				switch (op){
					case '+':res=num1+num2;
						break;
					case '-':res=num1-num2;
						break;
					case '*':res=num1*num2;
						break;
					case '/':res=(double)num1/num2;
						break;
					case '%':res=num1%num2;
						break;
				}
				return res;
	}
}
