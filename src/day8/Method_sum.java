package day8;

public class Method_sum {

	public static void main(String[] args) {
		int res = sum(6,6);//단순히 sum값만 출력하면 의미가 없기 때문에 sum값을 다른 변수에 저장해서 다른 것에 사용할 수 있도록 하는게 좋다
		sum(6,6);//의미가 없다
		System.out.println(res);
	}
	//두 정수의 합을 알려주는 메소드
	//매개변수 : 두 정수 = int num1, int num2
	//리턴타입 : int
	//메소드명 : sum
	public static int sum (int num1, int num2) {
		return num1+num2;
	}
	
	//좀 더 간단한 방법
	/*public static int sum (int num1, int num2) {
		return num1+num2;
	}*/
	
}
