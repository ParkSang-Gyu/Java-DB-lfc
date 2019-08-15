package day14;

import java.util.Scanner;

public class 복소수계산메소드 {

	public static void main(String[] args) {
		
		/*
		 출력예시
		복소수 1의 실수부:1
		복소수 1의 허수부:2
		복소수 2의 실수부:3
		복소수 2의 허수부:4
		(1+2i)+(3+4i)=(4+6i)
		(1+2i)-(3+4i)=(-2-2i)
		*/
		Scanner scan = new Scanner(System.in);
		int real1, img1;
		int real2, img2;
		System.out.println("복소수 1의 실수부 : ");
		real1=scan.nextInt();
		System.out.println("복소수 1의 허수부 : ");
		img1=scan.nextInt();
		System.out.println("복소수 2의 실수부 : ");
		real2=scan.nextInt();
		System.out.println("복소수 2의 허수부 : ");
		img2=scan.nextInt();
		
		int real3 = real1 + real2;
		int img3 = img1 + img2;
		int real4 = real1 - real2;
		int img4 = img1 - img2;
		System.out.println(ImagineNumber(real1, img1)
				+"+"
				+ImagineNumber(real2, img2)
				+"="
				+ImagineNumber(real3, img3));
		System.err.println(ImagineNumber(real1, img1)
				+"-"
				+ImagineNumber(real2, img2)
				+"="
				+ImagineNumber(real4, img4));
		scan.close();
	}
	// 기능:두 정수(a,b)를 복소수 형태(a+bi)의 문자열로 반환하는 기능
	// 매개변수:두 정수 =>int real, int img
	// 리턴타입:복소수형태의 문자열 =>String
	// 메소드명:ImagineNumber
	public static String ImagineNumber(int real, int img){
		String str="";
		if (real != 0)
			str+=real;
		if (img>1)
			str+="+"+img+"i";
		else if(img==1)
			str+="+i";
		else if(img<0)
			str+=img+"i";
		if (real != 0 && img != 0)
			str="("+str+")";
		return str;
	}
	
}
