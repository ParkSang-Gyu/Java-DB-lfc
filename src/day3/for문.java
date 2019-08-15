package day3;

public class for문 {

	public static void main(String[] args) {
		//8과 12의 최대공약수를 구하는 코드
		int num1=8, num2=12;
		int i=1, g=1;
		for (i=1,num1=8;i<=num1;i++){
			if (num1 % i == 0 && num2 % i == 0){
				g=i;
			}
		}System.out.println(num1 + "과 " + num2 + "의 최대공약수 : " + g);
		//두 수가 서로소인지 판별
		int num3 = 3, num4 = 7;
		int i1 = 1, g1 = 1;
		for (i1 = 1 ; i1 <= num4 ; i1++) {
			if (num3 % i1 == 0 && num4 % i1 == 0){
				g1 = i1;
			}
		} 
		if (g1 == 1) {
			System.out.println("서로소");
		} else {
			System.out.println("서로소가 아님");
		}
		//두 수의 최소공배수를 구하는 코드
		int num5=10, num6=15;
		int i2, l=1;
		for (i2=1;i2<=150;i2++){
			if (i2 % num5 == 0 && i2 % num6 == 0){
				l=i2;
				break;
			}
		}
			System.out.println(l);
		//다른 방법
		int num7=10, num8=15;
		int i3, l3=1;
		for (i3=15;i3>=15;i3++){
			if (i3 % num7 == 0 && i3 % num8 == 0){
				l3=i3;
				break;
			}
		}
			System.out.println(l3);
		//다른 방법
		int num9=10, num10=15;
		int i4, l4=1;
		for (i4=10;i4<=150;i4+=10){
			if (i4 % num9 == 0 && i4 % num10 == 0){
				l4=i4;
				break;
			}
		}
			System.out.println(l4);
		//다른 방법
		int num11=10, num12=15;
		int i5, l5=1, tmp;
		if (num12 > num11){
			tmp = num11;
			num11 = num12;
			num12 = tmp;//두 수를 바꾸는 코드(중요-암기할 것)
		}
		for (i5=15;i5>=15;i5++){
			if (i5 % num11 == 0 && i5 % num12 == 0){
				l5=i5;
				break;
			}
		}
			System.out.println(l5);	
		
	}
}
