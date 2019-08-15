package day7;

public class 시험3 {

	public static void main(String[] args) {
		// 3. 50이하의 소수를 출력하는 코드를 작성하세요
		int i, num, cnt;
		for (i=1;i<=50;i++){
			//cnt=0; 여기에 초기화 해도 됨
			for (num=1,cnt=0;num<=i;num++){//cnt를 여기서 초기화 안 해주면 누적이 된다
				if (i%num==0){
					cnt++;	
				}
			}
			if (cnt==2){
				System.out.print(i+" ");
			} 	
		}
	}

}
