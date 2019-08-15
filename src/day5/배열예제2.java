package day5;

public class 배열예제2 {

	public static void main(String[] args) {
		// 변수를 밖에서 선언하는 것과 안에서 선언하는 것의 차이점(변수의 유효 범위)
		// 일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호안에서 유효하다.
		// 반복문 안에서만 사용할 경우 변수를 안에서 선언하는게 좋다.
		for (int i=0; i<10;i++){
			System.out.println(i);
		}
		for (int i=0; i<5; i++){
			System.out.println(i);
		}
		
	}

}
