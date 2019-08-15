package day5_20;

public class Point3d extends Point{
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Point3d(){}
	public Point3d(int x,int y,int height){
		changePoint(x,y,height);
	}
	public Point3d(Point3d p){
		changePoint(p.getX(),p.getY(),p.height);
	}
	//오버로딩
	public void changePoint(int x,int y,int height){
		changePoint(x,y);
		this.height=height;		
	}
	//오버라이딩은 부모클래스의 메소드명과 매개변수가 같다
	//오버라이딩
	public void printPoint(){
		System.out.println("(" + getX() + ","+ getY() + "," + height + ")");
	}	
}
