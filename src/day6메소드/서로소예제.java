package day6메소드;

public class 서로소예제 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 9;
		if (isA(num1, num2)){
			System.out.println("두 수는 서로소");
		}else {
			System.out.println("두 수는 서로소 아님");
		}
	}
	public static int gcd (int num1, int num2){
		int gcdNum = 1;//밖에 선언한 이유는 유효범위
		for (int i=1; i<=num1; i++){
			if (num1 % i == 0 && num2 % i == 0){
				gcdNum=i;
			}
		}
		return gcdNum;
	}
			// 기능 : 두 정수가 주어지면 두 정수가 서로소인지 아닌지를 알려주는 메소드
			// 리턴타입(출력) : boolean
			// 매개변수(입력) : int num1, int num2
			// 메소드명 : isA
	public static boolean isA (int num1, int num2){
		if (gcd(num1, num2) == 1){
			return true;
		}else {
			return false;
		}
	}
}
