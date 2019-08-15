package day10;

import day9.Car;

public class kiaCar extends Car {
	public final static String brand="KIA";
	public kiaCar(){
		//speed=1;//접근 불가=>부모 클래스에서 접근제한자가 private으로 되어 있기 때문에
		setSpeed(0);
	}
}
