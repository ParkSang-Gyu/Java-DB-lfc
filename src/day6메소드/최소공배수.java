package day6메소드;

public class 최소공배수 {

	public static void main(String[] args) {
		// 
		int num1 = 10, num2 = 15;
		int gcdNum = 1;
		gcdNum = gcd(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최대공약수 : "+gcdNum);
		System.out.println(num1+"과 "+num2+"의 최소공배수 : "+lcm(num1, num2));
		// 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
		// 리턴타입(출력) : int
		// 매개변수(입력) : int num1, int num2
		// 메소드명 : gcd
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
	public static int lcm (int num1, int num2){
		return num1*num2/gcd(num1, num2);
	}
}
