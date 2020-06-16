package javaSE;
/**
 * ������һ��������޵����Ա�
 * ֻ���ڶ�β���� ��ͷɾ��
 * �Ƚ��ȳ�
 * */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class TestQueue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		System.out.println("-----------add���׳��쳣 offer�������쳣-----------------");
		q.add("aa");
		q.add("bb");
		q.offer("cc");
		q.offer("dd");
		q.forEach(System.out::println);
		
		System.out.println("-----------remove���׳��쳣 poll�������쳣-----------------");
		q.remove();
		q.poll();
		
		//ģ�����
		while (q.size()>0) {
			System.out.println(q.remove());
		}
		System.out.println(q.size());
		
		//PriorityQueue ������� 
		PriorityQueue<String> p = new PriorityQueue<>();
		p.offer("aa");
		p.offer("cc");
		p.offer("bb");
		//ע�� ���в������nullֵ �ᱨ��ָ���쳣 ����ֻ��LinkedList����

		System.out.println("��Ҫ����PriorityQueue�е�˳�� ������foreach���� ���Խ���ѭ������");
		while (p.size() > 0 ) {
			//��������ܿ���PriorityQueue�Ǿ�������Ķ���
			System.out.println(p.poll());
		}
		
		//Deque˫�˶���
		System.out.println("--------˫�˶���ģ����� �Ƚ��ȳ�---------");
		Deque<String> deque = new LinkedList<>();
		deque.add("aa");
		deque.add("bb");
		deque.addLast("cc");
		deque.addLast("dd");
		while (deque.size() > 0 ) {
//			System.out.println(d.poll());
			System.out.println(deque.pollFirst());
		}
		
		System.out.println("--------˫�˶���ģ��ջ ����ȳ�--------");
		Deque<String> stack = new ArrayDeque<>();
		stack.addFirst("aa");
		stack.offerFirst("bb");
		stack.addFirst("cc");
		stack.offerFirst("dd");
		while (stack.size() > 0 ) {
			System.out.println(stack.pollFirst());
		}
		
		System.out.println("--------push popר�ŵ�ջ����--------");
		stack.push("Tony Stark");
		stack.push("Steve Rogers");
		stack.push("Thor");
		stack.push("Bruce Banner");
		stack.push("Natasha Romanoff");
		stack.push("Clint Barton");
		stack.push("Wanda Maximoff");
		while (stack.size() > 0 ) {
			System.out.println(stack.pop());
		}
		
		
	}
	
}
