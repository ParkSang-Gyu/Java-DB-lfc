package day5;

public class 배열 {

	public static void main(String[] args) {
		// 배열은 같은 의미를 가지는 같은 타입의 여러 변수를 하나의 묶음 으로 다루는 것
		// 예 : 정수형 변수를 국어, 영어, 수학, 체육성적과 학년, 반, 번호를 저장하기 위해 배열로 만든다.(문법적으로 가능하지만 불편)
		// 예 : 학생 10명의 정수형 변수 국어 성적을 배열로 만든다.(문법적으로 가능하면서 쉽게)
		// 장점 : 물리적으로 연속된 공간으로 배열을 생성하기 때문에 읽는 속도(접근 속도)가 빠름.
		
		// 자료형 [] 배열이름;  // 배열을 선언
		// 배열이름 = new 자료형[배열의 크기];  // 배열 생성
		// 자료형 배열이름 [];  // 배열을 선언
		// 배열이름 = new 자료형[배열의 크기];  // 배열 생성
		// 변수는 선언하면 바로 사용하지만 배열은 바로 사용하지 못하고 생성을 해야 사용할 수 있다.
		// 배열의 시작 번지는 0번지부터이고 마지막 번지는 배열의 크기 - 1번지까지이다.
		// 배열은 주로 반복문과 사용된다.
		// 배열이름.length 는 배열의 크기를 알려줌.
		
		// 선언과 동시에 초기화를 할 수 있다.
		// 자료형 [] 배열 이름 = new int [] {값1, 값2, 값3, ...};
		// 자료형 [] 배열 이름 = {값1, 값2, 값3, ...};
		
		int []kor;
		kor = new int [10];//int [] kor = new int[10]; //선언과 생성을 한 번에 해도 된다.
		kor[0] = 10;
		System.out.println(kor[0]);
		System.out.println(kor[9]);
		//System.out.println(kor[10]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		                                // at day5.배열.main(배열.java:24)
									    // 잘못된 번지로 접근했을 때 나오는 에러 문구
		int i;
		for (i=0; i<kor.length; i++){
			System.out.println(i+"번지 : "+kor[i]);
		}
		/*Scanner scan = new Scanner(System.in);
		for (i=0; i<3; i++){
			kor[i]=scan.nextInt();
		}
		scan.close();*/
		int [] eng;
		eng = kor;
		for (i=0; i<eng.length; i++){
			System.out.println(i+"번지 : "+eng[i]);
		}
		eng[9] = 100;
		for (i=0; i<eng.length; i++){
			System.out.println(i+"번지 : "+kor[i]);
		}
		eng = new int[10]; // eng 배열 생성
		// kor 배열의 값을 eng 배열에 복사
		for (i=0; i<eng.length; i++){
			eng[i] = kor[i];
			System.out.println(i+"번지 : "+eng[i]);
		}
		
		//
		//int [] arr1, arr2;
		//int arr3 [] ;
		//arr2 = new int [3];//배열
		//arr3 = new int [3];//배열
		//arr4 = new int [3];//변수 (int형이 된다.)
	}

}
