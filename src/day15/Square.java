package day15;

public class Square {

	public static void main(String[] args) {
		
			Rect r=new Rect();
			r.width=10;
			r.height=5;
			r.x=0;
			r.y=0;
			r.print();
	}

}
class Rect {
	int x, y;
    int width;
	int height;
	
	public void print(){
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
		System.out.println("중심점 : "+x+","+y);
		System.out.println("넓이 : "+width*height);
	}
}