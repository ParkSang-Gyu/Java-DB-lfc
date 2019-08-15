package day2;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i <= 5; i++){
			System.out.println("Hello World");	
		}
		//1에서 5까지 출력하는 코드를 반복문을 통해 작성하시오.
		int num = 0;
		for (num = 1; num <= 5; num = num + 1){
			System.out.println(num);
		}
		//
		int i1 = 0;
		int sum = 0;
		for (i1 = 1, sum = 0; i1 <= 10; i1++){
			sum = sum + i1; //sum += i
		}
			System.out.println("1부터 10까지의 합 : " + sum);
			
			
			//구구단의 7단을 출력하는 코드를 반복문을 이용하여 작성
			int i2 = 0;
			int num1=7;
			for (i2=1; i2 <= 9; i2++){
				System.out.println(num1 + " * " + i2 + " = " + num1*i2);
			}
			//정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 코드를 반복문을 이용하여 작성하시오.
			int num3, i3, cnt;
			Scanner scan = new Scanner(System.in);
			num3 = scan.nextInt();
			for (i3 = 1, cnt = 0; i3 <= num; i3++){
				if (num3 % i3 == 0){
					cnt++;
				}	
			} 
			if (cnt == 2) {
				System.out.println(num+"는 소수");
			}
			else {System.out.println(num3+"는 소수가 아님");
			}
			scan.close();
			int num4=1;
			int sum4=0;
			for (num4=1, sum4=0;num4<=5;num4++){
				sum4=sum4+num4;//sum4+=num4;
			}System.out.println(sum4);
			//
			int num5, sum5;
			for (num5=1, sum5=0;num5<=10;num5++){
				if (num5%2==0){
					sum5=sum5+num5;	
				}
			}System.out.println(sum5);
			//방법2
			int a=2,s=0;
			for (a=2;a<=10;a+=2){
				s+=a;
			}
			System.out.println(s);
			//방법3
			int i8,sum8;
			for (i8=1,sum8=0;i8<=5;i8++){
				sum8+=i8*2;
			}System.out.println(sum8);
	}
}
