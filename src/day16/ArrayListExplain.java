package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExplain {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(1);
		/*for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point(5,5);
		char mode = 'y';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("이동할 좌표(x,y)를 입력하세요(예 : 1 2)");
			int x =scan.nextInt();
			int y = scan.nextInt();
			pt.move(x, y);
			System.out.println("이동한 현재 좌표 : " + pt);
			pList.add(new Point(pt));//익명 개체
			System.out.println("더 하시겠습니까??(y or n)");
			mode = scan.next().charAt(0);
		}while(mode!='n');
		/*pList.add(new Point(pt));//(10,10)이 중복되어 출력되는 건 pt가 객체(참조변수)이기 때문에 
		pt.move(10, 10);//주소를 저장하고 그 주소값이 바뀌면 원본값도 바뀌기 때문이다
		pList.add(new Point(pt));*/
		for (int i=0; i<pList.size(); i++){
			System.out.println(pList.get(i));
		}
		scan.close();
	}

}
class Point {
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
	public Point (){}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Point (Point p){
		this(p.x,p.y);
	}
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	/* 객체가 어느 그룹에 속해 있는지 알려주는 메소드로 Point클래스에서는 x, y의 값이 같다면
	 * 다른 객체이더라도 같은 그룹에 속하기 때문에 검색을 빠르게 할 수 있다
	 */
	@Override
	public int hashCode() {//그룹을 나누어 비교를 좀 더 쉽게 할 수 있도록 해서 작업속도를 빠르게 하는 역할 
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	/* 두 객체가 같은 객체로 판별할것인지를 결정하는 메소드*/
	@Override
	public boolean equals(Object obj) {
		//주소가 같은 경우면 당연히 본인이기 때문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//클래스 이름을 가져와 비교
			return false;
		Point other = (Point) obj;
		//Point클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정함
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}