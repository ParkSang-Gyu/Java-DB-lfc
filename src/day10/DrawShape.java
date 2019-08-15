package day10;

public class DrawShape {

	public static void main(String[] args) {
		Rect r= new Rect (2,2,4,8);
		r.print();
		r.resize(3, 6);
		r.print();
		Triangle t=new Triangle ();
		t.print();
		Triangle t1=new Triangle (3,3,5,5);
		t1.print();
		/*Triangle t2=null;
		t2.print();//에러 내용 : NullPointerException
				         에러 원인 : 참조변수가 null값을 가지는데 해당 변수를 사욜했을 경우에 생기는 에러
				   			   일반적으로 클래스의 객체를 선언만하고 new를 통해 생성하지 않은 상태에서 해당 객체의 메소드를 호출하는 경우 발생
				   	  해결 방법 : 객체를 생성하고 호출하면 된다*/
		
		/*Shape s1=new Rect();
		Shape s2=new Circle();
		Shape s3=new Shape();
		if (s1 instanceof Rect){
			Rect r1=(Rect)s1;
			r1.print();
			System.out.println("객체 s1은 Rect로 형변환이 가능");
		}
		if (s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능");
		}
		if (s2 instanceof Rect){
			System.out.println("객체 s2은 Rect로 형변환이 가능");
		}*/
	}

}

