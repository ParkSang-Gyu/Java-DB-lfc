package day5_20;

public class p3 {

	public static void main(String[] args) {
		// 1번에서 작성환 코드를 이용하여 min, max가 주어지면 min~max까지의 합을 구하는 코드를 메소드로 작성
		int sum;
		int min = 2;
		int max= 10;
		sum = printSum(min,max);
		System.out.println(sum);
	}
	
	public static int printSum(int min,int max){
		int sum=0;
		for (int i=min;i<=max;i++){
			sum = sum + i;
		}
		return sum;
		
	}
}
