package day16;

import java.util.*;

class ArrayListEx1 {
	@SuppressWarnings("unchecked")
	public static void main(String [] args){
		//크기가 10인 ArrayList를 생성
		ArrayList<Integer> list1 = new ArrayList<Integer> (10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//생성자 오버로딩을 사용 : 매개변수가 list인 경우
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> list2 = new ArrayList (list1.subList(1,4));//1번지부터 4번지보다 작은번지까지 호출
		print(list1, list2);
		
		//list1과 list2를 정렬한다
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//list1에 list2가 포함되어 있는지 확인
		System.out.println("list1.containsAll(list2):"
				+list1.containsAll(list2));
		
		list2.add("B");//B를 추가
		list2.add("C");//C를 추가
		list2.add(3, "A");//A를 3번지에 추가(기존에 값이 있으면 밀고난 뒤 추가)
		print(list1, list2);
		
		list2.set(3, "AA");//AA를 3번지에 덮어쓰기
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		//겹치는 내용이 있어서 삭제가 되면 true, 안되면 false
		System.out.println("list1.retainAll(list2) :"
				+list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다
		for (int i=list2.size()-1; i>=0 ; i--){
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		/* 0번지부터 작업하게 되면 번지가 바뀌게 되면서 확인해야 하는 원소를 확인하지 못하는 경우가 생기기 때문에
			작업순서가 거꾸로 진행된다*/
		}
		print(list1, list2);
	}
	static void print (ArrayList<Integer> list1, @SuppressWarnings("rawtypes") ArrayList<Comparable> list2){
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}