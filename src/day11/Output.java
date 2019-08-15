package day11;
	
	/*객체 멤버 메소드에서 클래스 멤버 변수를 사용할 수 있다
	 * -클래스 멤버 변수는 클래스 이름을 통해 사용 가능
	 * -객체 생성 없이 사용 가능
	 * -객체가 생성되고 나서도 사용 가능
	
	 * 클래스 멤버 메소드에서 객체 멤버 변수를 사용할 수 없다
	 * -객체 멤버 변수는 객체를 생성하고 사용 가능
	 * -클래스 멤버 메소드는 객체 생성 없이 사용가능한데 
	 * -클래스 멤버 메소드 안에 객체 멤버 변수가 있다면 객체를 안 만든 상태에서 객체 멤버 변수를 사용하려 하기 때문에 에러가 난다*/

public class Output {

	public static void main(String[] args) {
		Shape s = new Shape (1,2,3,4);
		s.print();
		Shape.printCount();
		Circle c = new Circle (1, 2, 3);
		c.print();
		Circle.printCount();
		//자식클래스를 부모클래스로 변환할때는 자동형변환이 가능하다
		//Shape s2=c;
		//Shape.printCount();
		/*부모클래스를 자식클래스로 변환할때는 명시적형변환을 해야하고 조건부로 가능하다
		 * 조건을 만족하지 않으면 ClassCastException 이 발생할 수 있다
		 * 클래스형변환 에러로 변환은 했지만 사용할 수 없는 정보가 있어서 사용하지 못하는 경우에 발생한다
		Circle c2=(Circle) s;
		c2.print();//실행 시 에러발생*/
		Shape s3 = new Circle();
		Shape.printCount();
		Circle c3 = (Circle)s3;
		c3.print();
		Circle.printCount();
	}

}
