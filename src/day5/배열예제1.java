package day5;

public class 배열예제1 {

	public static void main(String[] args) {
		// 7개를 저장할 수 있는 정수형 배열을 생성하고 각 번지에 1~45사이에 랜덤한 수를 생성하여 저장하는 코드
		int [] num;
		num = new int [7];
		int i=0;
		int min=1;
		int max=45;
		for (i=0; i<num.length;i++){
			num[i] = (int)(Math.random() * (max-min+1) + min);//(int)(Math.random() * 45 + 1)
			System.out.println(i + "번지 : " + num[i]);
		}
		// 7개를 저장할 수 있는 정수형 배열을 생성하고 0번지에는 0, 1번지에는 1, ..., 6번지에는 6을 넣는 코드
		int [] num1;
		num1 = new int [7];
		int i1=0;
		for (i1=0;i1<num1.length;i1++){
			num1[i1]=i1;
			System.out.println(i1 + "번지 : " + num1[i1]);
		}
		
	}

}
