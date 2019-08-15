package day9;
	
	//멤버 변수가 private일 경우 해당 멤버 변수 값을 확인할 수 있는 메소드가 필요하고 그 메소드를 getter, setter라 한다.
	//setter는 해당 멤버 변수의 값을 변경하는 기능을 하고
	//getter는 해당 멤버 변수의 값을 가져오는 기능을 한다
public class Car {

	//멤버 변수 설정 : 필요한 부품이나 요소
	
	//-속도
	//-시동
	//-기어
	//-전방등
	//-후방등
	//-와이퍼 속도
	
	private int speed;
	private boolean power;
	private char gear;
	private boolean frontLight;
	private boolean backLight;
	private int wiperSpeed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public char getGear() {
		return gear;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public boolean isfLight() {
		return frontLight;
	}
	public void setfLight(boolean fLight) {
		this.frontLight = fLight;
	}
	public boolean isbLight() {
		return backLight;
	}
	public void setbLight(boolean bLight) {
		this.backLight = bLight;
	}
	public int getWiperSpeed() {
		return wiperSpeed;
	}
	public void setWiperSpeed(int wiperSpeed) {
		this.wiperSpeed = wiperSpeed;
	}
	
	//생성자를 생성 : 멤버 변수 초기화
	//속도=0, 시동=off, 기어=파킹, 전방등, 후방등=off, 와이퍼 속도=0
	
	public Car(){
		this.power=false;
		this.speed=0;
		this.gear='p';
		this.frontLight=false;
		this.backLight=false;
		this.wiperSpeed=0;
	}
	
	//멤버 메소드를 생성 및 구현 : 필요한 기능
	//시동켜기, 시동끄기
	//엑셀온, 브레이크온
	//전방등 온, 오프
	//후방등 온, 오프
	//와이퍼 제어
	
	public void turnOn(){
		this.power =true;
	}
	public void turnOff(){
		if (speed==0)
		this.power =false;
	}
	public void accCar(){
		if (power&&(gear=='d'||gear=='D')){
			speed++;
		}
	}
	public void breakCar(){
		if (power&&(gear=='d'||gear=='D')){
			speed--;
		}
	}
	public void turnFrontLightOn(){
		frontLight=!frontLight;
	}
	public void turnBackLightOff(){
		backLight=!backLight;
	}
	public void printCar (){
		System.out.println("------------------------------------");
		if (power) System.out.println("시동이 켜져 있습니다.");
		else 	   System.out.println("시동이 꺼져 있습니다");
		
		System.out.println("속도 : "+speed);
		switch (gear){
		case 'P':
			System.out.println("기어 : P"); break;
		case 'D':
			System.out.println("기어 : D"); break;
		case 'N':
			System.out.println("기어 : N"); break;
		case 'R':
			System.out.println("기어 : R"); break;
		}
		if (frontLight)		System.out.println("전방등 켜져 있습니다.");
		else                System.out.println("후방등 꺼져 있습니다.");
		
		switch (wiperSpeed) {
		case 0:			System.out.println("와이퍼 : 정지"); break;
		case 1:			System.out.println("와이퍼 : 천천히"); break;
		case 2:			System.out.println("와이퍼 : 보통"); break;
		case 3:			System.out.println("와이퍼 : 빠름"); break;
		}
		System.out.println("------------------------------------");
	}
	
	
	
}
