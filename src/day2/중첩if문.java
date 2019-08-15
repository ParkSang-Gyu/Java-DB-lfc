package day2;

public class 중첩if문 {

	public static void main(String[] args) {
		int num2 = 7;
		if (num2 % 2 == 0) {
			if (num2 % 3 == 0){
			System.out.println("6의 배수");
			}else{
				System.out.println("2의 배수");
			}
		}else if (num2 % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다");
		}
		
	}

}
