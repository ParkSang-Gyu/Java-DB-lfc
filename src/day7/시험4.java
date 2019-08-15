package day7;

import java.util.Scanner;

public class 시험4 {

	public static void main(String[] args) {
		// 4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr [] = new int [3];
		for (int i=0;i<arr.length;i++){
			arr[i]=num;
		}
		System.out.println();
		scan.close();*/
		
		/*방법1
		Scanner scan1 = new Scanner(System.in);
		int num1=scan1.nextInt();
		int num2=scan1.nextInt();
		int num3=scan1.nextInt();
		int [] arr1 = new int [3];
		arr1[0]=num1;
		arr1[1]=num2;
		arr1[2]=num3;
		for (int tmp : arr1){
			System.out.print(tmp + " ");
		}
		System.out.println();
		scan1.close();*/
		
		/*방법2
		Scanner scan = new Scanner(System.in);
		int [] arr = new int [3];
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		for (int tmp : arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
		scan.close();*/
		
		//방법3
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [3];
		for (int i=0; i<arr.length;i++){
		arr[i]=scan.nextInt();
	}
	for (int tmp : arr){
		System.out.print(tmp + " ");
	}
	scan.close();
	}

}
