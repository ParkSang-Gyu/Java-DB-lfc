package day10;

	/*point클래스에서 사용한 내용들은 무엇이 있을까?

		클래스
		접근제한자
		멤버 변수
		변수 초기화
		메소드
		매개 변수
		생성자
		자료형
		리턴타입
		멤버 메소드
		메소드오버로딩
		생성자오버로딩
		호출
		객체
		*/

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public void move (int x, int y){
		this.x=x;
		this.y=y;
	}
	public void move(Point p){
		move(p.x,p.y);
	}
	public Point (){
		move(0,0);	
	}
	public Point (int x, int y){
		move(x,y);
	}
	public Point (Point p){
		move(p);
	}
}
