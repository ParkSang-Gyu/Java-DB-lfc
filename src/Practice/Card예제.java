package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Card예제 {
	// 카드 클래스를 만들고 list에 모든 카드(52장)를 넣고 섞는 코드
	// 카드 클래스의 멤버 변수는 숫자, 모양이 있다
	public static void main(String[] args) {
		boolean s1 = false, s2 = false;
		int cnt = 0;
		while( cnt < 10){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1;i<=7;i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			//System.out.println(PokerRule.pare(user));
			//System.out.println(PokerRule.triple(user));
			//s1 = PokerRule.top(user);
			//s1 = PokerRule.straight(user) == 2;
			//s1 = PokerRule.flush(user);
			//s1 = PokerRule.fullHouse(user);
			//s1 = PokerRule.straightFlush(user) >= 1;
			//s1 = PokerRule.poker(user);
			//System.out.println(s1);
			System.out.println("유저 카드 :" + user);
			
			//System.out.println(PokerRule.pare(dealer));
			//System.out.println(PokerRule.triple(dealer));
			//s2 = PokerRule.top(dealer);
			//s2 = PokerRule.straight(dealer) == 2;
			//s2 = PokerRule.flush(dealer);
			//s2 = PokerRule.fullHouse(dealer);
			//s2 = PokerRule.straightFlush(dealer) >= 1;
			//s2 = PokerRule.poker(dealer);
			//System.out.println(s2);
			System.out.println("딜러 카드 :" + dealer);
			int win = PokerRule.whoIsWin(user, dealer); 
			if(win == 1){
				System.out.println("유저 승리!");
			}else if(win == -1){
				System.out.println("딜러 승리!");
			}else{
				System.out.println("무승부!");
			}
			cnt++;
			System.out.println("----------------------------------");
		}
		System.out.println(cnt);
	}
}
class PokerRule{
	private static int sameCnt(ArrayList<Card> list,int count){
		int sCnt=0;// 페어의 개수
		for(int i=0;i<list.size();i++){
			int cnt=0;// 같은 숫자의 개수
			for(int j=0;j<list.size();j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt==count){
				sCnt++;
			}
		}
		return sCnt/count;
	}
	// 누가 이겼는지 확인하는 메소드
	public static int score(ArrayList<Card> list){
		if(straightFlush(list) == 3) 	return 1;
		if(straightFlush(list) == 2) 	return 2;
		if(straightFlush(list) == 1) 	return 3;
		if(poker(list))					return 4;
		if(fullHouse(list))				return 5;
		if(flush(list) != null)			return 6;
		if(straight(list) == 3)			return 7;
		if(straight(list) == 2)			return 8;
		if(straight(list) == 1)			return 9;
		if(triple(list) >= 1)			return 10;
		if(pare(list) >= 2)				return 11;
		if(pare(list) == 1)				return 12;
		return 13;
	}
	public static int whoIsWin(ArrayList<Card> user1, ArrayList<Card> user2){
		int u1 = score(user1);
		int u2 = score(user2);
		if(u1 < u2)	return 1;
		if(u1 > u2)	return -1;
		return 0;
	}
	//탑을 찾는 메소드
	public static boolean top(ArrayList<Card> list){
		if(sameCnt(list,1) != 7)
			return false;
		if(flush(list) != null)
			return false;
		if(straight(list) == 0)
			return false;
		return true;
	}
	/* 기능 : 페어를 찾는 메소드
	 * 매개변수 : 카드 리스트
	 * 리턴타입 : 0=페어없음, 1=원페어, 2=투페어(페어가 2개이상)
	 */
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
	}
	// 트리플을 찾는 메소드
	public static int triple(ArrayList<Card> list){
		return sameCnt(list,3);
	}
	// 포커를 찾는 메소드
	public static boolean poker(ArrayList<Card> list){
		if(sameCnt(list,4) == 1)
			return true;
		return false;
	}
	// 스트레이트를 찾는 메소드
	// 0:스트레이트 아님, 1:스트레이트, 2:백스트레이트, 3:마운틴
	public static int straight(ArrayList<Card> list){
		// 정렬하는 방법
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1,Card c2){
				return c1.getNum() - c2.getNum();
			}
		});
		
		boolean flag = false;// 1이 있는지 체크
		boolean isStraight = false;
		for(int i=0;i<list.size()-3;i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
				flag = true;
			}
			for(int j=i+1;j<list.size();j++){
				if(std+straightCnt==list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1==list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			// 마운틴(10,J,Q,K,1)
			if(straightCnt == 4 && std == 10 && flag){
				return 3;
			}
			// 백스트레이트(1,2,3,4,5)
			if(straightCnt >= 5 && std == 1){
				return 2;
			}
			// 스트레이트
			if(straightCnt >= 5){
				isStraight = true;// 스트레이트인지 아닌지 여부만 체크
			}
		}
		if(isStraight)
			return 1;
		return 0;
	}
	//플러시를 찾는 메소드
	public static String flush(ArrayList<Card> list){
		int sCnt=0;
		int cCnt=0;
		int hCnt=0;
		int dCnt=0;
		// 0번지부터 6번지까지 비교해서 같은 모양이 있을 때 sCnt,cCnt,hCnt,dCnt를 하나씩 증가
		for(int i=0;i<list.size();i++){
			if(list.get(i).getShape().equals("S")) sCnt++;
			else if(list.get(i).getShape().equals("C")) cCnt++;
			else if(list.get(i).getShape().equals("H")) hCnt++;
			else if(list.get(i).getShape().equals("D")) dCnt++;
		}
		if (sCnt >= 5) return "S";
		if (cCnt >= 5) return "C";
		if (hCnt >= 5) return "H";
		if (dCnt >= 5) return "D";
		return null;
	}
	// 풀하우스를 찾는 메소드
	public static boolean fullHouse(ArrayList<Card> list){
		if(PokerRule.pare(list) >= 1 && PokerRule.triple(list) == 1)
			return true;
		if(PokerRule.triple(list) == 2)
			return true;
		return false;
	}
	// 스트레이트 플러시를 찾는 메소드
	public static int straightFlush(ArrayList<Card> list){
		String s = flush(list);
		ArrayList<Card> list2 = new ArrayList<Card>();
		// 카드리스트가 플러시가 아니면 스티플을 더이상 비교할 필요가 없다
		if(s == null){
			return 0;
		}
		// 카드리스트를 복사 => 플러시가 아닌 카드들을 제거해야 하기 때문에
		list2.addAll(list);
		// 플러시가 아닌 카드들을 제거
		for(int i=list2.size()-1;i>=0;i--){
			if(!list2.get(i).getShape().equals(s)){
				list2.remove(i);
			}
		}
		return straight(list2);
	}
}
class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	// 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가
	private void cardPackSet(String shape){
		for(int i=1;i<=13;i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("H");
		cardPackSet("C");
		cardPackSet("D");
	}
	public void show(){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
			if((i+1) % 10 == 0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	public Card give(){
		if(list.size()!=0){
			Card c = new Card(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
}
class Card{
	public int num;
	public String shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")){
			s += "♠";
		}else if(shape.equals("H")){
			s += "♥";
		}else if(shape.equals("C")){
			s += "♣";
		}else if(shape.equals("D")){
			s += "◆";
		}
		
		if(num==11) s += "J";
		else if(num==12) s+= "Q";
		else if(num==13) s+= "K";
		else
			s += num;
		return s;
	}
	public Card(){}
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
}
