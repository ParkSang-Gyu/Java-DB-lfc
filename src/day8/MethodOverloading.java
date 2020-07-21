package day8;

public class MethodOverloading {

	//메소드 오버로딩 - 한 클래스 안에서 메소드명이 동일한 메소드가 여러개일 경우
	
	/* 메소드 오버로딩의 조건
	 * 1.매개변수의 갯수가 다르다
	 * 2.매개변수의 갯수가 같지만 자료형이 다르다 */
	
	public static void main(String[] args) {
		System.out.println(sum(1,1));
		System.out.println(sum(1.2,1.2));
		System.out.println(sum(1,2,3));
		
		printMultiTable(2);
		printMultiTables(3,7);
		printMultiTables();
	}

	//기능:두 정수의 합을 알려주는 기능
	//매개변수:두 정수(int num1, int num2)
	//리턴타입:int
	//메소드명:sum
	
	public static int sum (int num1, int num2){
		return num1+num2;
	}
	
	//기능:두 실수의 합을 알려주는 기능
	//매개변수:double num1, double num2
	//리턴타입:double
	//메소드명:sum
	
	public static double sum (double num1, double num2){
		return num1+num2;
	}
	
	//기능:세 정수의 합을 알려주는 기능
	//매개변수:int num1, int num2, int num3
	//리턴타입:double
	//메소드명:sum
	
	public static double sum (double num1, double num2, double num3){
		return num1+num2+num3;
	}
	
	//기능:단(구구단)을 출력하는 메소드
	//매개변수:단=정수=> (int num)
	//리턴타입:void
	//메소드명:printMultiTable
	//System.out.println(printMultiTable(2));
		
	public static void printMultiTable (int num){
		for (int i=1;i<=9;i++){
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
	
	//기능:2단에서 9단 중 원하는 단을 출력하는 기능(start단에서 end단을 출력하는 기능)
	//매개변수:2단에서 9단=정수=>int start, int end
	//리턴타입:void
	//메소드명:printMultiTables
	
	public static void printMultiTables (int start, int end){
		for (int i=start;i<=end;i++){
			printMultiTable(i);
		}
	}
	
	//기능:구구단 전체가 출력되는 기능
	//매개변수:구구단 전체
	//리턴타입:void
	//메소드명:printMultiTables
	public static void printMultiTables (){
		 printMultiTables (2,9);	
	}
}
