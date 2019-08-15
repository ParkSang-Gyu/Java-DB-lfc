package day16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String> ();
		//맵에서 put메소드는 두 개의 매개변수를 가지는데
		//첫 번째가 key, 두 번째가 value
		//지정된 키와 값을 HashMap에 저장
		map.put("myId", "1234");
		map.put("asdf", "1111");
		//키 값이 중복됐을 때 value를 덮어쓴다.
		map.put("asdf", "1234");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			//문자열의 모든 공백을 제거하는 게 trim
			String id = s.nextLine().trim();//id는 공백이 없기 때문에 그래서 trim을 사용
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if (!map.containsKey(id)){
				System.out.println("입력하신 id는 존재하지 않습니다."+" 다시 입력해주세요.");
				continue;//굳이 필요하지 않음
			}else {
				//입력받은 비밀번호와 id의 비밀번호가 같지 않으면=>
				if (!(map.get(id))/*해당 id의 value값을 불러온다*/.equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
				}else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}

}
