package day8;

public class Method_abs {

	public static void main(String[] args) {
		
	}
	
	//절대값 구하는 코드
	
	public static int abs (int abs){
		int num = abs;
		if (num<0){
			num = -abs;
		}
		return num;
	}
}
