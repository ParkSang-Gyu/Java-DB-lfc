package day5_20;

public class p2 {

	public static void main(String[] args) {
		// 1~10사이의 랜덤한 수를 6개 생성하여(중복가능) 배열에 저장하는 코드
		int arr [] = new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
