package day5_20;

public class Point3dPrint {

	public static void main(String[] args) {
		Point3d p = new Point3d();
		p.printPoint();
		p.changePoint(3, 3, 3);
		p.printPoint();
		p.changePoint(10, 10);
		p.printPoint();
		Point3d p2 = new Point3d(p);
		p2.printPoint();

	}

}
