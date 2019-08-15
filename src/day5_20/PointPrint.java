package day5_20;

public class PointPrint {

	public static void main(String[] args) {
		Point p/*참조변수*/ = new Point()/*생성자*/;
		p.printPoint();
		p.changePoint(3,5);
		p.printPoint();
		Point p2 = new Point(p);
		p2.printPoint();

	}

}
