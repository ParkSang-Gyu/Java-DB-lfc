package day8;

public class Method_multiTable {

	public static void main(String[] args) {
		//기능:단(구구단)을 출력하는 메소드
		//매개변수:단=정수=> (int num)
		//리턴타입:void
		//메소드명:printMultiTable
		//System.out.println(printMultiTable(2));
			printMultiTable(2);
		printMultiTables(3,7);
	}
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
}
