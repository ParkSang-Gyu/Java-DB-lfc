package day13;

public class 반복문 {

	public static void main(String[] args) {
		//구구단 전체를 출력하는 코드
		for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				int res=i*j;
				System.out.println(i + " x " + j + " = " + res);
			}
			System.out.println();
		}
		
		//다음 배열의 모든 값을 출력하는 코드
		int arr[]=new int []{1,3,5,7,9,2,4,6,8};
		for(int i=0;i<=8;i++){
			System.out.print(arr[i]);
		}
			System.out.println();
		// 다른 방법(향상된 for문-배열이나 컬렉션프레임워크일 때 사용, 배열의 값을 확인할 때 사용, 모든 배열을 확인하면서 번지를 신경 안쓸 때 사용, 배열의 값을 수정할 때는 미사용)
		// for(int tmp:arr){
		// 		System.out.print(tmp+" ");
		// }
			
		//위의 배열에서 짝수번지에 있는 값을 출력하는 코드
		for(int i=0;i<=8;i++){
			if(i%2==0){
				System.out.print(arr[i]);
			}
		}
			System.out.println();
		//다른 방법
		//for(int i=0;i<=arr.length;i+=2){
		//		System.out.print(arr[i]);
		//}
			
		//위의 배열에서 가장 큰 수를 출력하는 코드
		int great=arr[0];
		for(int i=1;i<=8;i++){
			if(great<arr[i]){
				great=arr[i];
			}
		}
		System.out.print(great);
		//다른 방법
		/*for(int tmp:arr){
				if(great<tmp){
					great=tmp;
				}
		}
	    	System.out.println(great);*/
	}

}
