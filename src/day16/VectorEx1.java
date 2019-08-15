package day16;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		//v라는 객체를 5개 만듬
		Vector<String> v = new Vector<String> (5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		//빈 공간을 없앤다
		v.trimToSize();
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		//최소용량을 변경한다
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		//사이즈(크기)를 변경(capacity는 자동으로 +5만큼 늘어남)
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		//모두 비운다
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}
	public static void print (Vector<String> v){
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}
}
