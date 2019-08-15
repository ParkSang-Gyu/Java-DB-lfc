package day7;

public class 시험2 {

	public static void main(String[] args) {
		// 2. 5개짜리 배열을 생성하고 배열에 0번지에 5, 1번지에 4, 2번지에 3, 3번지에 2, 4번지에 1을 저장하고 출력하는 코드를 작성하세요
		int [] arr = new int [5];
		for (int i=0;i<arr.length;i++){
			switch (arr[i]=i) {
			case 0:
				arr[i]=5;
				break;
			case 1:
				arr[i]=4;
				break;
			case 2:
				arr[i]=3;
				break;
			case 3:
				arr[i]=2;
				break;
			case 4:
				arr[i]=1;
				break;

			default:
				break;
			
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//다른 방법
		int [] arr2 = new int []{5,4,3,2,1};
		for (int i=0; i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//다른 방법
		int [] arr3 = new int[5];
		for (int i=0;i<arr3.length;i++){
			arr3[i]=arr3.length-i;
			System.out.print(arr3[i]+" ");
		}
	}

}
