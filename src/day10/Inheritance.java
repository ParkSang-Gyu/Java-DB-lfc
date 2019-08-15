package day10;

	/*상속을 받으면 부모 클래스에 있는 멤버 변수와 메소드를 물려 받지만 다 접근할 수 있는 것은 아니다(접근제한자 때문에)
	 * 접근제한자가 private이면 자식 클래스에서 접근할 수 없다
	
	 * is a 관계가 성립하면 상속을 할 수 있다
	  - 기아자동차는 자동차이다라는 말이 
	  - 성립하면 기아자동차는 자동차를 상속받을 수 있고
	  - 성립하지 않으면 상속받을 수 없다

	 * has a 관계가 성립하면 포함할 수 있다
	 
	 * 상속이 가능한가? 는 is a 관계가 성립하는가로 판단한다
	 * 포함이 가능한가? 는 has a 관계가 성립하는가로 판단한다(멤버변수로 객체가 올 수 있다)
	 */
public class Inheritance {
	
	//매개변수의 다형성 예제
	
	public static void main(String[] args) {
		Tv t = new Tv();
		t.price = 100;
		t.bonusPoint = 2;
		Computer c = new Computer();
		c.price = 50;
		c.bonusPoint = 1;
		Audio a = new Audio();
		a.price = 200;
		a.bonusPoint = 5;
		Buyer buyer=new Buyer();
		buyer.buy(c);
		System.out.println("컴퓨터 산 후 남은 금액 : "+buyer.money);
		buyer.buy(a);
		System.out.println("오디오 산 후 남은 금액 : "+buyer.money);
		buyer.buy(t);
		System.out.println("Tv 산 후 남은 금액 : "+buyer.money);
	}
}
	//부모 클래스
	class Product {
		int price;
		int bonusPoint;
	}
	class Tv extends Product{}         //자식클래스 1
	class Computer extends Product{}   //자식클래스 2
	class Audio extends Product{}      //자식클래스 3
	
	class Buyer {                      //구매자클래스
		int money = 1000;
		int bonusPoint = 0;
		//원래는 매개변수로 Tv t 또는 Computer c 또는 Audio a 가 와서 메소드 오버로딩으로 구현해야 하지만 그럴 경우 Product를 상속받는 제품들이 많아지면 추가해야할 메소드가 늘어난다
		//그래서 각 클래스의 객체가 아닌 해당 클래스들의 부모인 Product 클래스를 매개변수로 처리하면 Product 클래스를 상속받은 제품들은 일괄 처리가 된다.
		void buy(Product p){
			money-=p.price;
			bonusPoint+=p.bonusPoint;
		}
	}