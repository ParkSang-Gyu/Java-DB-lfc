package day5_20;

public class Point {
	// point 클래스 생성
	// point 클래스는 2차원 좌표 평면의 점을 나타내는 클래스
	// 멤버 변수는 x,y
	// 생성자 - 기본 생성자, 복사 생성자, 생성자 오버로딩 등
	// getter,setter 생성
	// 좌표 출력하는 메소드
	// 좌표 이동하는 메소드
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point(){}// 다른 클래스에서 사용하기 위해 명시
	public Point(Point p){
		changePoint(p.x,p.y);
		}
	public Point(int x,int y){
		changePoint(x,y);
	}
	
	public void printPoint(){
		System.out.println("(" + x + ","+ y +")");
	}
	public void changePoint(int x,int y){
		this.x = x;
		this.y = y;
	}
}
