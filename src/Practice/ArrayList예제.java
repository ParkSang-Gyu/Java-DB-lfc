package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList예제 {

	public static void main(String[] args) {
		// 1에서 6을 ArrayList에 순서대로 저장하고 해당 ArrayList를 섞는 코드를 작성
		ArrayList<Integer> list = new ArrayList<Integer>(6);
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		for(int i=0;i<6;i++){
			int min=0;
			int max=5;
			int r = (int)(Math.random()*(max-min+1)+min);// int r = (int)(Math.random()*6);
			int tmp = list.get(r);
			list.set(r, list.get(i));
			list.set(i, tmp);
		}
		System.out.println(list);
		
		list.clear();
		for(int i=0;i<6;i++){
			list.add(i);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);

	}

}
