package day19;

public class Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* 학생 클래스
 * 1.멤버 변수
 * 2.멤버 변수에 대한 getter와 setter
 * 3.toString() 오버라이딩
 *  =>객체 정보를 문자열로 쉽게 보기 위해
 * 4.hashCode(), equals() 오버라이딩
 *  =>학생 매니저에서 set을 이용하여 학생 정보를 관리하는데 set은 중복을 허용하지 않고
 *  중복확인을 hashCode()와 equals()를 이용하여 검사하는데 
 *  기본적으로 구현되어 있지 않으면 부모 것을 가져오기 때문에 id를 이용하여 같은지 다른지를
 *  판별하기 위해 오버라이딩한다
 * 5.생성자-객체를 좀 더 편하기 만들기 위해 사용한다
 * 
 */