package day5;

public class 배열로또생성예제 {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 로또 번호는 1~45사이의 랜덤한 수가 중복되지 않도록 7개 생성
		// 1. 로또 배열을 생성하여 각 번지에 0~6을 순차적으로 저장
		// 2. 로또 배열을 생성하여 각 번지에 1~45사이의 랜덤한 수를 저장
		// 3. 배열에 해당 값이 있는지 없는지 검색
		// 4. 로또 배열에 1~45사이의 중복되지 않은 랜덤한 수를 저장
		int [] num;
		num = new int [7];
		int i;
		int min = 1;
		int max = 7;
		for (i = 0; i < num.length; ){
			int r = (int)(Math.random() * (max - min + 1) + min);//(int)(Math.random() * 45 + 1)
			boolean find = false;
			for (int j = 0; j < num.length; j++){
				if (num[j] == r){
					find = true;
					break;
				}
			}//1.랜덤한 수를 생성
			 //2.생성된 수가 배열에 있는지 없는지 검색
			 //3.없으면 생성된 수를 배열에 저장, i를 증가
			 //4.있으면 아무일도 하지 않는다
			if (find == false){// !find
				num[i] = r;
				i++;
			}
		}
		for (int k = 0; k < num.length; k++){
			System.out.println(num[k]);
		}
		
		//a~z, A~z, 0~9로 조합된 8자리의 임시 비밀번호 발급하는 코드
		//a~z : 26개, A~Z : 26개, 0~9 : 10개, 총 62개, 0~61
		//0~9 : '0'~'9' => 배열은 자료형이 같아야 하므로 숫자와 문자가 같이 쓰일 수 없어서 숫자를 문자로 처리함
		//10~35 : 'a'~'z'
		//36~61 : 'A'~'Z'
		char [] pw;
		pw = new char [8];
		for (int i1=0; i1<pw.length; i1++){
			int r=(int)(Math.random()*62);
			if (r<=9){
				pw[i1] = (char)('0'+r);//문자 + 정수 = 정수, 문자 = 정수; 불가능, 문자 = (char)정수; 가능
			}else if (r<=35){
				pw[i1]=(char)('a'+(r-10));
			}else {
				pw[i1]=(char)('A'+(r-36));
			}
		}
		System.out.println(pw);
		
		
	}
}
