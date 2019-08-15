package day10;

public class Triangle extends Shape {
	private double area;//따로 초기화를 해줄 필요가 없다
	
	public double getArea() {
		return area;
	}
	@Override
	public void print(){
		System.out.print("밑변의 양 끝점 중의 한 점 : ");
		center.print();
		System.out.println("밑변: "+width);
		System.out.println("높이 : "+height);
		System.out.println("넓이 : "+area);
	}
	public Triangle (){//클래스명과 같고 리턴타입이 없다
	}
	public Triangle (int x, int y, int width, int height){
		super (x,y,width,height);
		area=width*height/2.0;//2가 아니라 2.0을 입력해야 실수값이 나오기 때문
	}
}
