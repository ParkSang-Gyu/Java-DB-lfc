package day14;

public class 예외처리 {

	public static void main(String[] args) {
		//메소드 내부에서 예외가 발생했을 때 내부에서 처리하기 위해 try-catch문을 사용
		/*
		int num =0;
		try {
		num=1/0;
		}catch(ArithmeticException e){
			System.out.println("계산 관련 예외 발생");
			e.printStackTrace();
		}
		catch(Exception e){//생략가능한데 넣을거면 항상 마지막에 위치해야 한다(if-else문에서 else가 마지막에 위치하는 것처럼)
			e.printStackTrace();
		}
		System.out.println(num);*/
		System.out.println(1.0/0.0);
		try {
			System.out.println(calc(1.0,0.0,'?'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static double calc(double num1, double num2, char op) 
			throws Exception, ArithmeticException{
		double res = 0.0;
		if((op == '/' || op == '%') && num2 == 0.0) 
			throw new ArithmeticException("0으로 나눌 수 없습니다");
		switch (op) {
		case '+':res=num1+num2;break;
		case '-':res=num1-num2;break;
		case '*':res=num1*num2;break;
		case '/':res=num1/num2;break;
		case '%':res=num1%num2;break;

		default:
			throw new Exception("잘못된 연산자입니다");
		}
		return res;
	}
}
