package day4;

public class Prac3 {

	public static void main(String[] args) {
		// 두 수의 공약수를 출력하는 코드
		int i;
		int gcd=0;
		int num1=10, num2=5;
		System.out.print(num1 + "과 " + num2 + "의 공약수 : ");
		for (i=1; i<=num1; i++){
			if (num1 % i == 0 && num2 % i == 0){
				gcd=i;
				System.out.print(gcd + " ");
			}
		}
	
	}
}
