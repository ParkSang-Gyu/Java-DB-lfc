package day5;

public class 배열검색예제 {

	public static void main(String[] args) {
		// 배열 검색 코드
		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++){
			arr[1] = i;
		}
		int search = 5;
		//배열 : 0 1 2 3 4
		//배열에 있는 모든 값을 확인하여 배열의 값과 검색값이 같으면 find를 true로 변경 후 종료, 없으면 계속 진행
		//변수 find의 값이 배열 arr에 있는지 없는지를 나타내는 변수
		boolean find = false;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == search){
				find = true;
				break;
			}
		}
		if (find){
			System.out.println("배열에는 "+search+"가 있습니다");
		}else {
			System.out.println("배열에는 "+search+"가 없습니다");
		}
	}

}
