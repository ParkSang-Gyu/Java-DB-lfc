package day6메소드;

public class 구구단메소드 {

	public static void main(String[] args) {
		// 기능 : 구구단 전체를 메소드를 이용하여 출력하도록 작성하세요
		// 매개변수 : 없음
		// 리턴타입 : void
		// 메소드명 : gugu		
		/*gugu();
	}
	public static void gugu (){
		for (int i=2;i<=9;i++){
			 for (int num=1;num<=9;num++){
				 System.out.println(i + " x " + num + " = " + i*num);
			 }
			 System.out.println();
		 }
	}*/
	
	//쌤 방식(구구단을 원하는 단만 골라서 출력할 수 있는 메소드)
	//기능:두 정수가 주어지면 두 정수의 곱을 출력하고 그 결과를 알려주는 메소드
	//매개변수:두 정수 => int num1, int num2
	//리턴타입:곱한 결과 => int
	//메소드명:printMul
		printAll(2,9);
		printDan(2);
		printMul(2,6);
	}
	public static int printMul (int num1, int num2){
		System.out.println(num1+" x "+num2+" = "+num1*num2);
		return num1*num2;//굳이 없어도 된다
	}
	
	//단이 주어지면 해당하는 단을 출력하는 메소드
	//매개변수:두 정수 int num
	//리턴타입:없다=>void
	//메소드명:printDan
		
	public static void printDan(int num){
		for (int i=1;i<=9;i++){
			printMul(num,i);
		}
	}
	
	//기능: 스타트단계에서 엔드단계까지 출력하는 메소드
	//매개변수: int start, int end
	//리턴타입: 없다=>void
	//메소드명: printAll
	
	public static void printAll (int start, int end){
		if (start<0) return;//메소드 강제 종료 의미-리턴타입이 void일 때 강제종료하고 싶을 때 return 사용
		for (int i=start; i<=end;i++){
			printDan(i);
		}
	}

}
		