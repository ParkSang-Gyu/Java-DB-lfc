package day8;

public class Method_recursive {

	public static void main(String[] args) {
		//java.lang.stackOverflowError 발생
	System.out.println(factorial(5));
	}
	
	//재귀호출 메소드 (자기자신을 호출하는 메소드)
	//java.lang.stackOverflowError 발생하면 재귀호출을 의심해라
	
	//기능:정수 num이 주어지면 주어진 정수 num!을 알려주는 메소드
	//매개변수:int num
	//리턴타입:int
	//메소드명:factorial
	
	public static int factorial (int num){
		if (num==1||num==0)
			return 1;
			if (num < 0)
				return -1;
			return factorial (num-1)*num;
	}		
}
