package day16;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Object [] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		//set은 인터페이스, HashSet은 클래스
		Set<Object> set = new HashSet<Object> ();
		
		for (int i=0; i<objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
	}

}
