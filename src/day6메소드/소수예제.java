package day6메소드;

public class 소수예제 {

	public static void main(String[] args) {
		int num = 7;
		if (isPrime(num)){
			System.out.println("소수");
		}else {
			System.out.println("합성수");
		}
	}
	// 기능 : 정수가 주어지면 해당 정수가 소수이면 참을 합성수이면 거짓을 알려주는 메소드
	// 리턴타입(출력) : boolean
	// 매개변수(입력) : int num
	// 메소드명 : isprime
	public static boolean isPrime (int num){
		int cnt = 0;
		for (int i = 1; i <= num; i++){
			if (num % i == 0){
				cnt++;
			}
		}
		if (cnt == 2){
			return true;
		}else {
			return false;
		}
	}
}
