package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String> ();
		/*Queue는 인터페이스
		 * 인터페이스 자체는 객체를 만들 수 없다(생성자가 없기 때문에)
		 * Queue 인터페이스를 구현한 클래스(LinkedList)를 이용하여
		 * Queue 인터페이스의 객체를 생성할 수 없다
		 * */
		Queue<String> q = new LinkedList<String> ();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop());//입력한 수를 밖으로 뺄 때 pop 사용
		}
		
		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());//입력한 수를 밖으로 뺄 때 poll 사용
		}
	}

}
