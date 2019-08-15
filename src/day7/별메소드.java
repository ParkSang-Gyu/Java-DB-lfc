package day7;

public class 별메소드 {

	public static void main(String[] args) {
		
		//********** 출력하는 메소드
	printStar(5,'*');
	}
	public static void printStar(int cnt, char ch){
		for (int i=1;i<=cnt;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	
}
