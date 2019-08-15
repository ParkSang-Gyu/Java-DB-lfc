package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//미완성코드
public class HashSetLotto {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer> ();
		
		for (@SuppressWarnings("unused")
		int i=0; set.size()<7;){
			int num = (int) (Math.random()*10)+1;
			set.add(new Integer(num));
		}
		
		List<Integer> list = new LinkedList<Integer> (set);
		System.out.println(list);
		
		Set<Integer> set1 = new HashSet<Integer> ();
		
		for (@SuppressWarnings("unused")
		int i=0; set1.size()<6;){
			int num = (int) (Math.random()*10)+1;
			set1.add(new Integer(num));
		}
		
		List<Integer> list1 = new LinkedList<Integer> (set1);
		System.out.println(list1);
		
		Iterator<Integer> it = list1.iterator();
		
		int cnt=0;
		while (it.hasNext()){
			//System.out.print(it.next()+" ");
			for (int i=0; i<list1.size();i++){
			if(set.contains(it.next())){
				cnt++;
				}
			}
			if(cnt==6){
				System.out.println("1등에 당첨되셨습니다.");
			}else if(cnt==5){
				System.out.println("3등에 당첨되셨습니다.");
			}else if(cnt==4){
				System.out.println("4등에 당첨되셨습니다.");
			}else if(cnt==3){
				System.out.println("5등에 당첨되셨습니다.");
			}else {
				System.out.println("꽝");
			}
		}
	}
}
