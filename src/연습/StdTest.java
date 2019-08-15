package 연습;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		StdManager sMng = new StdManager();
		Scanner scan = new Scanner(System.in);
		for (int menu=1;;menu++){
			sMng.printMenu();
			menu=scan.nextInt();
			if(menu==1){
				Std s = sMng.inputStd(scan);
				if(sMng.insert(s)){
					System.out.println("학생 정보를 추가했습니다.");
				}else{
					System.out.println("이미 등록된 학번입니다.");
				}
			}else if(menu==2){
				Std s = sMng.inputStd(scan);
				if(sMng.update(s)){
					System.out.println("해당 학생 정보를 수정했습니다.");
				}else{
					System.out.println("없는 학번입니다.");
				}
			}else if(menu==3){
				Std s= sMng.inputId(scan);
				if(sMng.delete(s)){
					System.out.println("해당 학생 정보를 삭제했습니다.");
				}else{
					System.out.println("없는 학번입니다.");
				}
			}else if(menu==4){
				sMng.print();
			}else if(menu==5){
				break;
			}
		}
		scan.close();
	}

}
