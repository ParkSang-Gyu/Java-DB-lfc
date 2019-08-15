package day4;

public class Prac2 {

	public static void main(String[] args) {
		//1부터 100까지 짝수만 출력하는 코드
		int i ;
		for (i = 1 ; i <= 100 ; i++){
			if (i % 2 == 0){
				System.out.println(i) ;
			}
		}
		//다른 방법
		int i1;
		for (i1=2;i1<=100;i1+=2){
			System.out.println(i1);
		}
		//다른 방법
		int i2;
		for (i2=1;i2<=50;i2++)
			System.out.println(i2*2);//반복문이 한줄이고 실행문도 한줄이면 괄호 생략 가능
		
		//다른 방법
		int i3;
		for (i3=1;i3<=100;i3++){
			if (i3 % 2 == 0){
				System.out.println(i3) ;
			}
		}
	}
}
