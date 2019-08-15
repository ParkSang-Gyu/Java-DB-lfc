package day6메소드;

public class 로또번호생성 {

	public static void main(String[] args) {
		// 로또번호 생성 메소드 방법
		// 배열을 생성
		// 1. 랜덤한 수
		// 2. 중복되지 않고
		// 3. 7개짜리, 6개짜리
		// 1. 랜덤한 수를 생성하는 메소드 : random (임의의 정수를 만드는 공식이 복잡해서 간단하게 메소드로 만듬)
		// 2. (중복되지 않게 하기 위해서)배열에 검색하려는 수가 있는지 없는지 확인하는 메소드 : contain
		// 3. 배열을 생성(1, 2)를 만족하는 메소드 : createRandomArr
		
		// 메소드의 매개변수는 인자(인수)를 복사하여 생성한다.
		// 일반 변수를 매개변수로 하느냐, 참조변수를 매개변수로 하는냐에 따라 원본이 바뀔 수 있다
		// 일반 변수를 매개변수로 하면 원본이 안바뀐다.
		// 참조변수를 매개변수로 하면 원본이 바뀔 수 있다.(무조건 바뀌는 건 아님)
		// 참조변수란 변수에 주소를 저장(배열)
		
		int min=1, max=45;
		int [] arr = new int [7];
		int [] arr2 = new int [6];
		if (createRandomArr(min,max,arr)){
			printArr(arr);
		}else {
			System.out.println("배열 성공에 실패");
		}
		if (createRandomArr(min,max,arr2)){
			printArr(arr2);
		}else {
			System.out.println("배열 성공에 실패");
		}
	
		//당첨 등수를 출력하는 코드를 작성하시오
		//1등 : 보너스번호를 제외한 번호 6개가 일치
		//2등 : 보너스번호를 포함한 번호 6개가 일치
		//3등 : 보너스번호를 제외한 번호 5개가 일치
		//4등 : 보너스번호를 제외한 번호 4개가 일치
		//5등 : 보너스번호를 제외한 번호 3개가 일치
		//꽝 : 2개이하
		int r=rank(arr,arr2);
		printRank(r);
		
		//int r = random(min,max);
		//int arr [] = new int [] {1,2,3,4,5,6,7};
		//System.out.println(r);
		//System.out.println(isContain(arr, r, arr.length));//arr에 r이 arr.length만큼 있으면
	}
		//if (min>max){
		//	int tmp=min;
		//	min=max;
		//	max=tmp;
	
		// 기능 : 최솟값과 최댓값이 주어지면 최솟값과 최댓값 사이의 임의의 정수를 알려주는 메소드
		// 매개변수 : int min, int max
		// 리턴타입 : int
		// 메소드명 : random
	public static int random (int min, int max){
			return (int)(Math.random()*(max-min+1)+min);
		}
		// 기능 : 배열에 검색숫자가 있으면 위치(번지)를 알려주고 없으면 -1을 알려주는 메소드
		// 매개변수 : 검색숫자, 배열 => int [] arr, int num
		// 리턴타입 : 있는지(true) 없는지(false) => boolean
		// 메소드명 : isContain
	public static boolean isContain (int [] arr, int num, int cnt){//int cnt를 추가하면 모든 배열을 검색하지 않고 내가 원하는 개수만큼(번지만큼) 배열검색
		if (arr == null){
			//for (int tmp:arr){
			//	if (tmp==num){
			//		return i;
			//	}
			//}
			return false;
		}
		if (cnt>arr.length){
			cnt=arr.length;
		}
		for (int i=0 ; i<cnt ; i++){
			if (arr[i] == num){
				return true;
			}
		}
		return false;
	}
		// 기능 : 최솟값과 최댓값, 배열이 주어지면 중복되지 않은 랜덤한 수(min~max)로 배열을 채우고 성공여부를 알려주는 메소드
		// 매개변수 : int min, int max, int arr
		// 리턴타입 : boolean(배열을 채웠는지 못채웠는지 여부)
		// 메소드명 : createRandomArr
	public static boolean createRandomArr (int min, int max, int [] arr){
		if (arr == null){//매개변수로 넘어온 배열이 생성되어 있지 않다는 의미
			return false;
		}
		if (max-min+1 < arr.length){//생성할 수 있는 숫자의 개수보다 배열의 크기가 크다는 의미(중복되는 상황이 발생할 수 밖에 없다)
			return false;
		}
		int cnt = 0;//만들어진 배열에 저장된 랜덤한 숫자의 개수
		while (cnt < arr.length){//배열의 개수만큼 저장되면 반복문을 종료한다
			int r=random(min,max);
			if (!isContain(arr, r, cnt)){//arr에 r이 없으면
				arr[cnt]=r;
				cnt++;
			}
		}
		return true;
	}
		// 기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메소드
		// 매개변수 : int arr []
		// 리턴타입 : void
		// 메소드명 : printArr
	public static void printArr (int [] arr){
		System.out.print("[ ");
		for (int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.print("]\n");// /n은 엔터와 동일한 역할
	}
	
	// 기능 : 두 배열이 주어지면 두 배열에 같은 원소가 몇 개 있는지 알려주는 메소드
	// 매개변수 : int [] arr1, int [] arr2
	// 리턴타입 : int
	// 메소드명 : compareArr
	public static int compareArr (int [] arr1, int [] arr2){
		int cnt=0;//두 배열의 원소 중 일치하는 개수
		int size=0;//두 배열 중 작은 배열의 길이를 저장
		if (arr1.length>arr2.length){
			size=arr2.length;
		}else{
			size=arr1.length;
		}
		//두 배열에서 일치하는 원소의 갯수를 구하는 방법
		for (int i=0;i<size;i++){
			if (isContain(arr2,arr1[i],size)){
				cnt++;
			}
		}
		return cnt;
	}
	
	// 기능 : 당첨배열과 자동생성배열이 주어지면 몇등인지 알려주는 메소드(단, 꽝은 -1)
	// 매개변수 : 두 배열 => int [] lotto, int [] auto
	// 리턴타입 : 등수 => int
	// 메소드명 : rank
	public static int rank (int []lotto, int []auto){
		int cnt=compareArr(lotto,auto);
		switch (cnt){
		case 6:
			return 1;
		case 5:
			/*switch (isContain2(auto,lotto[lotto.length-1],auto.length)){
			case -1:
				return 3;
				default:
					return 2;
			}*/
			if (isContain(auto,lotto[lotto.length-1],auto.length))
				return 2;
			else
				return 3;
		case 4:
			return 4;
		case 3:
			return 5;
			default:
				return -1;
		}
	}
	public static void printRank (int r){
		if (r==-1){
			System.out.println("꽝");
		}else{
			System.out.println(r+"등");
		}
	}
}

