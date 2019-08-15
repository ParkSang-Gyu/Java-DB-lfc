package day10;

public class Rect extends Shape {
	private int area;
	
	public int getArea() {
		return area;
	}
	@Override
	public void print(){
		super.print();
		System.out.println("넓이 : "+area);
	}
	public Rect (){
	}
	public Rect (int x, int y, int width, int height){
		super (x,y,width,height);
		area=width*height;
	}
	public void resize (int width, int height){
		this.width=width;
		this.height=height;
		area=width*height;
	}
}
