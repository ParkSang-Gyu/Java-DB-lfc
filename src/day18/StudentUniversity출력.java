package day18;

public class StudentUniversity출력 {

	public static void main(String[] args) {
			StudentUniversity std1=new StudentUniversity(Gender.MALE,
					Major.FRANCAIS,Grade.FRESHMAN,"홍길동",2002001103);
			System.out.println(std1);
			std1.setUniversityName("그린");
			std1.setAverage(3.0);
			System.out.println(std1);
	}

}
