package day4;

public class Prac4 {

	public static void main(String[] args) {
		//*********
		// *******
		//  *****
		//   ***
		//    *
		int i, j, a;
		for (i=1;i<=5;i++){
			for (a=1;a<=i-1;a++){
				System.out.print(" ");
			}
			for (j=1;j<=11-2*i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//다른 방법
		int i2, j2, a2;
		for (i2=5;i2>=1;i2--){
			for (a2=1;a2<=5-i2;a2++){
				System.out.print(" ");
			}
			for (j2=1;j2<=2*i2-1;j2++){
				System.out.print("*");
			}
			System.out.println();
		//100이하의 소수를 모두 출력하는 코드
		int i1, cnt, num;
		for (num=1;num<=100;num++){
			for (i1=1,cnt=0;i1<=num;i1++){
				if (num % i1 == 0){
					cnt++;
				}
			}
			if (cnt == 2){
				System.out.println(num);
			}
		}
		}
	}
}
