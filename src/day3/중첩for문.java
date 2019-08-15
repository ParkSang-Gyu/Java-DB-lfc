package day3;

public class 중첩for문 {

	public static void main(String[] args) {
	// 구구단 전체를 출력하는 코드를 작성하시오.(곱의 법칙)
		int i, num;
		for (num=2;num<=9;num++){
			for (i=1;i<=9;i++) {
				System.out.println(num + " * " + i + " = " + num*i);	
			}
		}
		// *모양 찍기
		for (i=1;i<=6;i++){
				System.out.println("*****");
			}
		// 다른 방법
		int i2,j;
		for (i2=1;i2<=6;i2++){
			for (j=1;j<=10;j++){
				System.out.print("*");
				}
			System.out.println();
			}
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		int i3, j2;
		for (i3=1;i3<=6;i3++){
			 for (j2=1;j2<=i3;j2++){
				 System.out.print("*");
			 }
			 System.out.println();
			}
		//      *
		//     **
		//    ***
		//   ****
		//  *****
		// ******
		int i4, j3, a;
		for (i4 = 1 ; i4 <= 6 ; i4++){
			for (a = 1 ; a <= 6-i4 ; a++){
				System.out.print(" ");
				}
			for (j3 = 1 ; j3 <= i4 ; j3++){
				System.out.print("*");
				}
			System.out.println();
			}
		//      *        i=1 공=5 *=1
		//     ***		 i=2 공=4 *=3
		//    *****		 i=3 공=3 *=5
		//   *******     i=4 공=2 *=7
		//  *********    i=5 공=1 *=9
		// ***********   i=6 공=0 *=11
		int i5, j4, a2;
		for (i5=1;i5<=6;i5++){
			for (a2=1;a2<=6-i5;a2++){
				System.out.print(" ");
			}
			for (j4=1;j4<=2*i5-1;j4++){
				System.out.print("*");
			}
			System.out.println();
		}
		//다른 방법
		int i6, j5, a3;
		for (i6 = 1 ; i6 <= 6 ; i6++){
			for (a3 = 1 ; a3 <= 6-i6 ; a3++){
				System.out.print(" ");
				}
			for (j5 = 1 ; j5 <= i6 ; j5++){
				System.out.print("*");
				}
			for (j5 = 1 ; j5 <= i6-1 ; j5++){
				System.out.print("*");
				}
			System.out.println();
			}
	
		//******
		//*****
		//****
		//***
		//**
		//*
		int i7, j6;
		for (i7=1;i7<=6;i7++){
			for (j6=1;j6<=7-i7;j6++){
				System.out.print("*");
			}
			System.out.println();
		}
		//******
		// *****
		//  ****
		//   ***
		//    **
		//     *
		int i8, j7, a4;
		for (i8=1;i8<=6;i8++){
			for (a4=1;a4<=i8-1;a4++){
				System.out.print(" ");
			}
			for (j7=1;j7<=7-i8;j7++){
				System.out.print("*");
			}
			System.out.println();
		}
		//***********
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		int i9, j8, a5;
		for (i9=1;i9<=6;i9++){
			for (a5=1;a5<=i9-1;a5++){
				System.out.print(" ");
			}
			for (j8=1;j8<=14-2*i9-1;j8++){
				System.out.print("*");
			}
			System.out.println();
		}
		//
		int i10, j9, a6, num1 = 6;
		for (i10=1, num1 = 6;i10<=6;i10++){
			for (a6=1;a6<=i10-1;a6++){
				System.out.print(" ");
			}
			for (j9=1;j9<=num1+1-i10;j9++){
				System.out.print("*");
			}
			System.out.println();
		}
		//
		int i11, j10, a7, num2=6;
		for (i11=1;i11<=6;i11++){
			for (a7=1;a7<=i11-1;a7++){
				System.out.print(" ");
			}
			for (j10=1;j10<=2*(num2-i11)+1;j10++){
				System.out.print("*");
				}
				System.out.println();
			}
		//
	}
	
}
