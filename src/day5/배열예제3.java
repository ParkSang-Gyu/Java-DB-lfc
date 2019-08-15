package day5;

public class 배열예제3 {

	public static void main(String[] args) {
		// 두 수의 공약수들을 배열에 저장하여 출력하는 코드
		// 공약수는 최대 10개까지 저장
		int [] arr = new int [10];
		int num1 = 8, num2 = 12;
		int i, cnt=0;
		for (i = 1; i <= num1; i++){
			if (cnt == 10){
				break;
			}
			if (num1 % i == 0 && num2 % i == 0){
				arr[cnt] = i;
				cnt++;
			}
		}
		for (int j=0; j<arr.length; j++){
			System.out.print(arr[j] + " ");
		}
	}	

}
