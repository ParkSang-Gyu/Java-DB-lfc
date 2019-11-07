package Practice;

import java.util.HashSet;
import java.util.Scanner;

public class Set예제 {
	
	public static void main(String[] args) {
		//스캐너와 컬렉션 프레임워크를 사용해 중복되지 않는 6개의 정수를 입력받는 코드
		
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<6){
			int num = scan.nextInt();
			set.add(num);
		}
		System.out.println(set);
		/*
		for(;;){
			int num = scan.nextInt();
		}
		*/
		scan.close();
		
	}

}
