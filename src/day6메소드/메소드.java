package day6메소드;

public class 메소드 {

	public static void main(String[] args) {
		// 메소드의 구현위치는 클래스 안에 구현하되 다른 메소드 안에 구현할 수 없다
		// 메소드는 다른 메소드안에서 호출되어야 한다
		// 메소드를 테스트하기 위해서는 main메소드에서 호출해야 한다
		// 메소드명과 리턴타입이 연관되게 한다
		
		/* 메소드에서 리턴값이 있을 때 구현 시 유의사항
		조건문을 통해 리턴하는 경우나 반복문안에서 리턴할 경우 조심해야 한다
		 - 조건문을 통해 리턴할 경우 조건문이 거짓인 경우를 고려해야 한다
		 - 반복문안에서 리턴할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야 한다
		 - 반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 
		     자바 컴파일러는 세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야 한다 */
		
		//1. 메소드의 기능을 풀어 쓴다
		//2. 풀어쓴 기능에서 매개변수를 정한다
		//3. 풀어쓴 기능에서 리턴타입을 정한다
		//4. 메소드명을 정한다
		//5. 2,3,4에서 정한 내용을 토대로 메소드를 선언한다
		//6. 메소드를 구현한다
		
		/*일반변수 vs 참조변수
		일반변수 : 값을 저장하는 변수 (int num)
		참조변수 : 주소를 저장하는 변수 (int [] arr) 대표적으로 배열*/
		
		//매개변수의 원본이 바뀌려면 매개변수가 참조변수이어야 한다
		
		//메소드를 만들 때 지역변수로 할 것인가? 매개변수로 할 것인가?
		//메소드 안에서 변수를 초기화 하는 경우 지역변수로 선언하고 
		//누군가 알려준 정보를 그대로 활용하면 매개변수로 선언한다
		
		System.out.println(sum(1,2));
		printSum(1,2);
	}
	public static int sum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	
	//기능 : 두 수의 합을 콘솔에 출력하는 기능
	//입력 : 두 정수 => int num1, int num2
	//출력 : 없다 => void
	//이름 : printSum
	
	public static void printSum (int num1, int num2) {
	System.out.println(num1+num2);
	}
	
	//기능 : 배열을 num로 초기화 하는 메소드
	//매개변수: 배열, num => int [] arr, int num
	//리턴타입 : 없다 => void
	//메소드명 : initArr
	public static void initArr(int []arr, int num){
		for (int i=0; i<arr.length;i++){
			arr[i]=num;
		}
	}
}

