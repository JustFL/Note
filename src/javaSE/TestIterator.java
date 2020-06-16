package javaSE;
/**
 * 
 * List����
 * 
 * */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class TestIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		//1 forѭ��
		//2 ��ǿforѭ��
		//3 foreach �����list�ķ���
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//lambda��lambda��������
		list.forEach((t)->{System.out.println(t);});
		list.forEach(System.out::println);
		
		//4 ������ �ӿ�  ��;���Ǳ�������
		Iterator<String> i = list.iterator(); 
		
		//remove()ɾ�����һ��next()���ʵ�Ԫ��
		System.out.println("next���� "+i.next());
		i.remove();
		list.forEach(System.out::println);
		
		//while
		System.out.println("whileѭ��Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		//5 foreachremaining ����ǵ������ķ���
		System.out.println("-----foreachremaining-----");
		//��Ϊ�������ϴ��ù�֮�� ָ���Ѿ�ָ�������һ��Ԫ�� ���Եڶ��α�����û���κν����
		i.forEachRemaining(System.out::println);
		//�������»�ȡһ������������
		Iterator<String> i1 = list.iterator();
		i1.forEachRemaining(System.out::println);
		
		
		//6 ListIterator �ǵ��������ӽӿ� ֻ���list����
		ListIterator<String> li = list.listIterator();
		System.out.println("------ListIterator------------");
		while (li.hasNext()) {
			System.out.println(li.next());
			li.add("hello");
		}
		System.out.println(list);
		
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//7 list stream ���foreach��stream���ķ���
		System.out.println("----------Stream------------");
		list.stream().forEach(System.out::println);
	}

}
