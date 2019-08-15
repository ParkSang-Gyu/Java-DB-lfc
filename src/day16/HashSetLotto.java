package day16;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer> ();
		
		for (@SuppressWarnings("unused")
		int i=0; set.size()<6;){
			int num = (int) (Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List<Integer> list = new LinkedList<Integer> (set);
		System.out.println(list);
			
	}
}

