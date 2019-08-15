package day9;

	//변수명을 다르게 하는 것처럼 같은 패키지에서 클래스명을 동일하게 할 수 없다

	//멤버 메소드는 원하는 시점에서 호출이 가능하지만
	//생성자는 객체를 생성할 때에만 호출한다
	//객체 멤버 변수를 초기화
	//생성자가 없을 때 기본생성자가 컴파일러에 의해 자동으로 추가된다
	//기본생성자 없이 다른 생성자를 만들고 기본생성자를 호출하면 에러가 난다
public class Tv {
	//일반 멤버 변수(객체 멤버 변수)
	private int channel;
	private int volume;
	private final int MAX_CHANNEL=500;
	private final int MAX_VOLUME=100;
	//클래스 멤버 변수
	public static final String BRAND = "삼성";{//클래스 멤버는 static이 붙어있다
	}
	//일반 멤버 메소드(객체 멤버 메소드)
	public void channelUp(){
		if (channel<MAX_CHANNEL)
		channel++;
	}
	public void channelDown(){
		if (channel>1)
			channel--;
	}
	public void setChannel(int ch){
		if (ch==0)
			channel=1;
		else if (ch>MAX_CHANNEL)
			channel=MAX_CHANNEL;
		else
		channel = ch;
	}
	public void volumeUp(){
		if (volume<MAX_VOLUME)
			volume++;
	}
	public void volumeDown(){
		if (volume>0)
			volume--;
	}
	public void printVolume(){
		System.out.println("현재 소리 크기 : "+volume);
	}
	public void printChannel(){
		System.out.println("현재 채널 번호 : "+channel);
	}
	public Tv() {
		this (1, 10);//항상 첫 번째줄에 호출
	
	}
	public Tv(int channel, int volume) {
		setChannel(channel);
		if (volume>MAX_VOLUME)
			this.volume=MAX_VOLUME;
		else
			this.volume=volume;
		
	}
	//복사생성자-다른 객체를 복사한다고 해서
	//
	public Tv(Tv stv){
		this (stv.channel, stv.volume);
	}
}
