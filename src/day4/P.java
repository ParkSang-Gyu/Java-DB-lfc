package day4;

public class P {

	public static void main(String[] args) {
		//100부터 200사이의 소수를 출력
		int i, cnt, num;
		for (num = 100 ; num <= 200 ; num++){
			for (i = 100, cnt = 0 ; i <= num ; i++){
				if (num % i == 0){
					cnt++;
				}
			}
			if (cnt == 2){
				System.out.println(num);
			}
		}
	}

}
