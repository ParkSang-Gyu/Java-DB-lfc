package day9;

	//2차원 좌표의 점을 의미하는 Point 클래스

public class Point {

	//멤버 변수 : x좌표, y좌표
	private int X;
	private int Y;
	
	//생성자 생성
	//멤버 변수 초기화
	public Point(){
		X=0;
		Y=0;
		//move(0, 0);
	}
	public Point(int X, int Y){
		this.X=X;
		this.Y=Y;
		//move(X, Y);
	}
	public Point(Point p){
		this (p.X, p.Y);
		//move(p.X, p.Y);
	}
	
	
	public int getAxisX() {
		return X;
	}
	public void setAxisX(int X) {
		this.X = X;
	}
	public int getAxisY() {
		return Y;
	}
	public void setAxisY(int Y) {
		this.Y = Y;
	}
	
	//멤버 메소드
	//x, y의 값이 주어졌을 때 멤버 변수의 값 변경
	public void setAxis(int X, int Y){
		setAxisX(X);
		setAxisY(Y);
		}
	//현재 좌표 출력
	public void print(){
		System.out.println("("+X+","+Y+")");
		}
	//다른 점과의 거리 계산
	public double distance (Point p){
		/*int dX=p.axisX-axisX;
		int dY=p.axisY-axisY
				return Math.sqrt(Math.pow(dX, 2.0)+Math.pow(dY, 2.0));*/
		return distance (p.X, p.Y);
	}
	public double distance (int X, int Y){
		int dX=X-this.X;
		int dY=Y-this.Y;
				return Math.sqrt(Math.pow(dX, 2.0)+Math.pow(dY, 2.0));
	}
	
	//이 포인트 클래스를 이용해 다른 작업을 하고 싶다
	public void moveUp (){
		Y--;
	}
	public void moveDown (){
		Y++;
	}
	public void moveRight (){
		X++;
	}
	public void moveLeft (){
		X--;
	}
}
