package day17;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class numberBaseBall {
	//중복되지 않은 1~9사이의 3개의 선택된 숫자를 맞추는 게임
	//스트라이크 : 자릿수와 숫자가 일치
	//볼 : 숫자는 있지만 자릿수가 불일치
	//아웃 : 일치하는 숫자가 없는 경우
	//3s : 전부 일치 => 게임종료
	
	/* 1.com의 번호를 생성
	 * 2.반복문 {
	 * 3.숫자를 3개 입력받아 List에 저장
	 * 4.스트라이크 개수 계산=>새로운 메소드 추가
	 * 5.볼 개수 계산=>countList(전체 개수)를 계산 후 4에서 구한 스트라이크 개수를 빼면 볼의 개수가 된다
	 * 6.출력
	 * }
	 */
	public static void main(String[] args) {
		//1.
		List<Integer> com = HashSetLottoNumber.randomArr(1, 9, 3);
		//3.
		List<Integer> user = new LinkedList<Integer>();//숫자 3개 저장
		System.out.println(com);//1번확인

		int strike=0, ball=0;
		Scanner scan = new Scanner(System.in);
		//2.
		while (strike<3){
			//3.
			//매번 입력받은 값들을 리스트에 그냥 추가하면 3개가 넘어가기 때문에 
			//입력받기 전에 리스트를 비워줘야 한다
			user.clear();
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();//숫자 3개를 입력받아
			user.add(num1);
			user.add(num2);
			user.add(num3);
			strike = getStrike(com, user);
			//5.
			ball = HashSetLottoNumber.countList(com, user)-strike;
			if (strike != 0)
				System.out.print(strike+"S");
			
			if (ball != 0)
				System.out.print(ball+"B");
			
			if (strike == 0 && ball == 0)
				System.out.print("3o");
			System.out.println();
		}
		System.out.println("정답입니다.!!");
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	//4.
	public static int getStrike(List<Integer> com, List<Integer> user){
		int count = 0;
		for (int i=0; i<com.size(); i++){
			//List.get()은 객체를 반환하기 때문에 com.get()==user.get(i)로 작성하면
			//두 객체의 주소가 같은지를 확인하기 때문에 우리가 원하는 값이 같은지를 확인하지 않는다.
			//그래서 equals를 통해 값이 같은지를 확인한다
			if (com.get(i).equals(user.get(i)))
				count++;
			}
		return count;
	}
	/*
	public static List<Integer> inputNums(Scanner scan){
		/*Set<Integer> set = new HashSet<Integer>();
		while (set.size()<3){
			int num = scan.nextInt();
			set.add(num);
		}
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new LinkedList<Integer>();
		while (it.hasNext()){
			list.add(it.next());
		}
		List<Integer> list = new LinkedList<Integer>();
		while(list.size()<3){
			int num=scan.nextInt();
			list.add(num);
		}
		return list;
	}*/
}
