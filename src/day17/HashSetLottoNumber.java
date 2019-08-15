package day17;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLottoNumber {

	public static void main(String[] args) {
		/* 1.로또당첨번호를 생성
		   2.로또자동번호를 생성
		   3.당첨번호와 자동번호를 비교해서 일치하는 개수 확인
		   4.보너스번호 일치여부 확인
		   5.등수출력
		 */
		int min = 1, max = 45;
		List<Integer> lotto = randomArr(min,max,7);
		List<Integer> list = randomArr(min,max,6);
		System.out.println(lotto);
		System.out.println(list);
		System.out.println(countList(lotto, list));
		printRank(lotto, list);
	}
	/* 기능 : min, max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를
			count 개수만큼 생성하여 리스트로 반환하는 메소드
	      매개변수 : int min, int max, int count
               리턴타입 : List
               */
	public static List<Integer> randomArr(int min, int max, 
			int count){
		//생성할 수 있는 숫자의 범위보다 만들어야 하는 개수가 더 크면 
		//중복될 수 밖에 없기 때문에 무한루프에 빠지는 경우가 생기는 것을 막기위한 코드
		if(max-min+1<count)
			return null;
		Set<Integer> set = new HashSet<Integer>();
		//count개만큼 생성하기 위한 조건식
		while(set.size()<count){
			int num = (int)(Math.random()*(max-min+1))+min;
			set.add(new Integer(num));
		}
		//set으로 저장되어 있는 데이터를 List 데이터로 변환
		//여기서 set을 List로 바꾸는 이유는 set에는 원하는 번지에 직접 접근할 수 있는 메소드가 없기 때문에
		//List로 변환하여 List에 있는 get()을 이용하여 직접 접근하게 하기위해 변환시킴
		//set을 이용해서도 가능하긴 하지만 조금 복잡하기 때문에 List로 바꿈 
		List<Integer> list = new LinkedList<Integer>(set);
		return list;
	}
	/* 기능 : 로또당첨번호와 번호들이 주어지면 보너스번호를 제외하고
	 *      일치하는 개수가 몇 개인지 알려주는 메소드
	 * 매개변수 : 당첨번호, 번호 => List<Integer> lotto, List<Integer> list
	 * 리턴타입 : 개수 => int
	 * 메소드명 : countList
	 */
	public static int countList (List<Integer> lotto, 
			List<Integer> list){
		//첫번째 매개변수가 당첨번호가 되야 하는데 당첨번호가 아닌 번호가 오면 -1을 리턴 후 종료
		if (lotto.size()<list.size()){
			return -1;
		}
			int count=0;
			//당첨번호에서 번호를 하나 꺼내서 꺼낸 번호가 list에 있는지 없는지 확인해서
			//있으면 증가, 없으면 아무것도 안함
			//당첨번호에서 보너스번호를 제외하기 위해 조건식에 lotto.size가 아닌 list.size를 이용
			for(int i=0; i<list.size();i++){
				if (list.contains(lotto.get(i))){
					count++;
				}
			}
			return count;
		}
	public static void printRank (List<Integer> lotto, 
			List<Integer> list){
		//보너스번호를 제외한 일치하는 개수
		int count = countList(lotto, list);
		int rank=0;
		//보너스번호
		int bonusNum=lotto.get(lotto.size()-1);
		//보너스번호와 일치하는 번호가 있는지 없는지
		boolean checkBonus=list.contains(bonusNum);
		switch (count) {
		case 6: rank=1; break;
		case 5: rank=checkBonus?2:3; break;
		case 4: rank=4; break;
		case 3: rank=5; break;

		default:rank=-1;
			break;
		}
		if (rank>0){
			System.out.println(rank+"등 당첨!!");
		}else {
			System.out.println("꽝 !!");
		}
	}
	}

