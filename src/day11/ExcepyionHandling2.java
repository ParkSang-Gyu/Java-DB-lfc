package day11;

public class ExcepyionHandling2 {
	public static void main (String [] args){
		try{
			System.out.println(calc(1,0,'/'));
		}catch(Exception e){//예외클래스와 객체가 들어감
			e.printStackTrace();
		}finally{//예외가 발생하건 안 하건 무조건 실행되는 곳
			System.out.println("예외 처리가 끝나면 무조건 실행되는 곳");
		}
	}
		public static double calc (int num1, int num2, char op)
		throws Exception{
			double res=0.0;
			if (op=='/'&&num2==0){
				//throw new Exception ("0으로 나눌 수 없습니다.");//밑과 같은 코드
				Exception e = new Exception ("0으로 나눌 수 없습니다.");
				throw e;
			}
			switch (op) {
			case '+':res=num1+num2;break;
			case '-':res=num1-num2;break;
			case '*':res=num1*num2;break;
			case '/':res=(double)num1/num2;break;
			case '%':res=num1%num2;break;
			}
			return res;
		}
}


