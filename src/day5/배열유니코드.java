package day5;

public class 배열유니코드 {

	public static void main(String[] args) {
		int numA='a';
		int numB='b';
		System.out.println(numA);//문자 a 대한 유니코드 정수값
		System.out.println(numB);//문자 b에 대한 유니코드 정수값
		numA='A';
		numB='B';
		System.out.println(numA);//문자 A에 대한 유니코드 정수값
		System.out.println(numB);//문자 B에 대한 유니코드 정수값
		int num = 100;
		System.out.println((char)num);
		//97이 a라는 것을 이용하여 a~z까지 출력하는 코드
		for (int i= 97; i<=97+25; i++){
			System.out.print((char)i);
		}
		System.out.println();
		for (int i = 'a'; i<='z'; i++){
			System.out.print((char)i);
		}
		System.out.println();
		for (int i = 0; i<=25; i++){
			System.out.print((char)('a'+i));
		}
	}

}
