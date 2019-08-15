package day8;

public class Method_calculate {

	public static void main(String[] args) {
		//기능:두 정수의 산술 연산 결과를 알려주는 메소드
		//매개변수:두 정수, 산술 연산자 (int num1, int num2, char op)
		//리턴타입:산술연산결과 (double)
		//메소드명:calculate
		
		System.out.println(calculate(1,2,'+'));
		System.out.println(calculate(1,2,'-'));
		System.out.println(calculate(1,2,'*'));
		System.out.println(calculate(1,2,'/'));
		System.out.println(calculate(1,2,'%'));
	}
	/*public static double calculate (int num1, int num2, char op){
		double res=0.0;
		if (op=='+'){
			res=num1+num2;
		}else if (op=='-'){
			res=num1-num2;
		}else if (op=='*'){
			res=num1*num2;
		}else if (op=='/'){
			res=(double)num1/num2;
		}else if (op=='%'){
			res=num1%num2;
		}
		return res;
	}*/
	
	//다른 방법
	public static double calculate (int num1, int num2, char op){
		double res=0;
		switch (op) {
		case '+': res=num1+num2; break;
		case '-': res=num1-num2; break;
		case '*': res=num1*num2; break;
		case '/': res=num1/num2; break;
		case '%': res=num1%num2; break;
		}
		return res;
	}
}
