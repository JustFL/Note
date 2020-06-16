package javaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���ϲ����Ĺ����� ��Χ�����е�collection���͵ļ���
 * 
 * */
public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//�򼯺���һ������Ӷ��Ԫ��
		Collections.addAll(list, "aa","cc","bb","aa");
		list.forEach(System.out::println);
		
		System.out.println("------ʹ�ñȽ������н���-------");
		Collections.sort(list, (t1,t2)->t2.compareTo(t1));
		list.forEach(System.out::println);
		
		System.out.println("------��Ȼ�����-------");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("------����Ԫ���ڼ����е�λ�� �����Ƚ�����Ȼ�������򣡣���-------");
		System.out.println(Collections.binarySearch(list, "aa"));
		
		System.out.println("---------���Ҽ����е���СԪ��--------------");
		System.out.println(Collections.min(list));
		
		System.out.println("---------���Ҽ����е����Ԫ��--------------");
		System.out.println(Collections.max(list));
		
		System.out.println("---------���Ҽ�����Ԫ�صĳ��ִ���--------------");
		System.out.println(Collections.frequency(list, "aa"));
		
		System.out.println("------------��ת���������е�Ԫ��---------");
		Collections.reverse(list);
		list.forEach(System.out::println);
		
		System.out.println("-------���Ԫ��---------");
		Collections.fill(list, "Hello");
		list.forEach(System.out::println);
	}
	
}
