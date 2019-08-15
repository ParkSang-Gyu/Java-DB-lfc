package day11;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		/*String str1 = "Hello", str2 = "Hello";
		boolean cmp=str1==str2;
		System.out.println(cmp);
		cmp=str1 != (str2="Hello ");
		System.out.println(cmp);
		cmp=str1 != (str2="Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));*/
		
		//문자열을 입력하세요 : Hello World
		//찾을 문자열을 입력하세요 : He
		//Hello World에는 He가 있습니다.
		
		/*Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("문자열을 입력하세요. : ");
		str=scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요. : ");
		String search=scan.nextLine();
		if (str.contains(search)){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		if (str.indexOf(search)>=0){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		scan.close();*/
		
		//문자열을 입력하세요 : 112233445511
		//교체될 문자열을 입력하세요 : 11
		//교체할 문자열을 입력하세요 : 00
		//교체 결과 002233445500
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		String search="";
		String change="";
		
		System.out.print("문자열을 입력하세요. : ");
		str= scan.nextLine();
		System.out.print("교체될 문자열을 입력하세요. : ");
		search= scan.nextLine();
		System.out.print("교체할 문자열을 입력하세요. : ");
		change= scan.nextLine();
		
		String newStr="";
		newStr=str.replace(search, change);
		if (newStr==str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체 결과 : "+newStr);
		}
		scan.close();
		
		//문자열을 입력하세요. : 
		//교체될 문자열을 입력하세요. :
		//교체할 문자열을 입력하세요. :
		//교체될 문자열이 없습니다.
		
		/*Scanner scan2 = new Scanner(System.in);
		String str2 = "";
		System.out.print("문자열을 입력하세요. : ");
		str2=scan2.nextLine();
		System.out.print("교체될 문자열을 입력하세요. : ");
		String change3=scan2.nextLine();
		System.out.print("교체할 문자열을 입력하세요. : ");
		String change4=scan2.nextLine();
		if (str2.replace(change3,change4)){
			System.out.println("교체될 문자열이 없습니다. "+str2);
		}
		scan1.close();*/
	}
 
}
