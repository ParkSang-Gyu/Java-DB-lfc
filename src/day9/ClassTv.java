package day9;

public class ClassTv {

	public static void main(String[] args) {
		//기본생성자를 이용한 객체 생성 후 초기화
		Tv t1=new Tv();
		t1.printChannel();
		t1.printVolume();
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		Tv t2=new Tv(100, 15);
		t2.printChannel();
		t2.printVolume();
		Tv t3=new Tv(t2);
		System.out.println("t3");
		t3.printChannel();
		t3.printVolume();
		t3.volumeDown();
		System.out.println("t3 소리 줄이기 실행 후 t3");
		t3.printVolume();
		System.out.println("t3 소리 줄이기 실행 후 t2");
		t2.printVolume();
		//t4를 생성하지 않고 t3의 다른 이름으로 t4라 부른다
		Tv t4=t3;
		System.out.println("t3 소리 줄이기 실행 후 t4");
		t4.printVolume();
	}
	

}
