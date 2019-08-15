package day11;

public class ExceptionHandling {

	//예외 처리

			/*try {
			예외상황이 발생할 수 있는 코드;
			}catch(예외 클래스){
			}
			
			일반적으로 예외 처리가 안 된 상태에서 예외가 발생하면 프로그램이 중단되는데
			예외처리를 하면 예외가 발생해도 프로그램을 중단하지 않고 다음 코드를 실행할 수 있다*/


		public static void main(String[] args) {
			int num1=1, num2=0;
			int res;
			int arr[]=new int [10];
			try{
				//예외 상황이 발생할 수 있는 코드
				//ArrayIndexOutOfBoundsException 이 발생할 수 있다
				arr[10]=0;
				res=num1/num2;
				System.out.println(res);
			}
			//try문에서 ArithmeticException 이 발생하면 아래 catch문을 실행하고 다음 코드를 실행해라
			catch(ArithmeticException e){//e는 하나의 객체이므로 밑에와 이름이 같아도 상관없다
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("연산 예외 발생!!!");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 예외 발생!!!");
			}
			//어떤 예외인지 모르는 경우 마지막에 Exception으로 처리한다
			catch(Exception e){
				System.out.println("예외 발생!!!");
			}
			System.out.println("프로그램 종료!!");
		}
	
	}

