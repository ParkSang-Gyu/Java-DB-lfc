package Practice;

public class 예외처리 {
	public static void main(String[] args){
		try {
			System.out.println(calculator(1,2,'/'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	int num1;
	int num2;
	char op;
	public static double calculator(int num1,int num2,char op) 
			throws Exception {
		double res=0.0;
		if ((op=='/' || op=='%')&&num2==0)
			throw new ArithmeticException("잘못 나누었습니다.");
		switch (op) {
			case '+':res=num1+num2;break;
			case '-':res=num1-num2;break;
			case '*':res=num1*num2;break;
			case '/':res=(double)num1/num2;break;
			case '%':res=num1%num2;break;
		default:
				throw new Exception("연산자 잘못");
		}
		return res;
	}
}
