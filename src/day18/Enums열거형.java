package day18;

import day18.Card.Kind;

public class Enums열거형 {

	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.kind);
		c.kind=Kind.CLOVER;//외부에서 사용할 때 클래스명.해당 열거형
		System.out.println(c.kind.ordinal());
		System.out.println(c.kind.name());
	}

}
class Card{
	//Kind는 일종의 자료형으로 쓰였으므로 대문자로 쓰는 게 좋다
	//외부에서 사용하기 위해 public 사용
	//값이 제한적인 경우 사용하면 좋다(switch문처럼)
	public enum Kind {SPACE(1),CLOVER(2),HEART(3),DIA(4);
		private final int value;
		Kind (int value) {this.value=value;}
		public int getValue(){return value;}
		}
	
	Kind kind=Kind.SPACE;
	
}