package javaSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * ����
 * 1 �ɱ䳤��
 * 2 ֻ�ܴ洢�������� ���ܴ洢������������  ���Դ�Ű�װ��
 *                       Collection(interface)
 *                            |
 *      -------------------------------------------------------------- 
 *      |                     |                                       |    
 *   List(interface)     Set(interface)                        Queue(interface)����
 *      |                     |                                       |
 *      |                     |---HashSet(Class)�ײ�hash��            |---PriorityQueue(Class)���ȶ��� ������� Υ���˶����Ƚ��ȳ���ԭ��
 *      |                     |                                       |
 *  ArrayList(�ײ�����)    SortedSet(interface)����                 Deque(interface)˫�˶���
 *  Vector(�ײ�����)          |                                       |                                                                                          |
 *  LinkedList(����)      NavigateSet(interface)                   ArrayQueue
 *                            |                                    LinkedList
 *                         TreeSet(Class)������
 *  
 *  
 *  
 *   List������ظ� Set�������ظ�
 *                  
Map(interface)----SortedMap(interface)----NavigateMap(interface)----TreeMap(Class)
 *              |
 *              |
 *           HashMap(Class)---LinkedHashMap(����)
 *           HashTable(Class)---Properties
 *           
 *           
 *           
 *           
 *           
 * ArrayList
 * Vector�ײ㶼������ ���ݵ�ʱ����ʵ�Ǵ���һ���µĽϴ��������ʵ�ֵ�  ����洢���ڴ�����������  ������ɾ�Ƚ���
 * ��LinkedList��� ArrayList������ �������Ч�ʸ� LinkedList����ɾЧ�ʸ�          
 * */
public class TestAssemble {

	public static void main(String[] args) {
		
		//Collection��ķ���
		Collection<String> c = new ArrayList<>();
		//�Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		
		//���Ԫ�ؿ��ܷ���false 
		c.add("aa");
		
		//���ؼ�����Ԫ�ظ���
		System.out.println(c.size());
		
		//<? extends String> �����е�ͨ���  ͬʱ����������  ��ʾString��String�����඼����
		Collection<String> c1 = new ArrayList<String>();
		c1.add("aaaa");
		c1.add("bbbb");
		
		//���Ӽ����е�����Ԫ��
		c.addAll(c1);
		
		//removeIf�����ڲ���ʵ��
//		System.out.println(c);
//		c.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.length() == 2;
//			}
//		});
//		System.out.println(c);
		
		//removeIf lambdaʵ��
		c.removeIf((t)->{return t.length() == 4;});
		System.out.println(c);
	
		//������ת��Ϊ���� ���صĲ���ArrayList������  ��Arrays��һ���ڲ��� �Ƕ����� ֻ����������  
		String[] str = new String[]{"aa"};
		List<String> arraytoassemble =  Arrays.asList(str);
		System.out.println(c.containsAll(arraytoassemble));
		
		//����ת������
		Object[] obj = c.toArray();
		System.out.println(Arrays.toString(obj));
		
		System.out.println("----------------List----------------");
		//Listʾ��
		List<String> l = new ArrayList<String>();
		l.add("aa");
		l.add("bb");
		System.out.println(l);
		
		//ָ��λ�ò���Ԫ�� List�������  ��ֵ�����˳��
		l.add(1, "xx");
		System.out.println(l);
		
		//��ȡĳ��λ�õ�ֵ
		System.out.println(l.get(2));
		
		//�޸�ĳ��λ�õ�ֵ
		l.set(1, "yy");
		System.out.println(l);
		
		//����
		l.add("aa");
		System.out.println(l.indexOf("aa"));
		System.out.println(l.lastIndexOf("aa"));
		
		//ȡ�Ӽ� ��Χ��[) ��������ֹλ��
		List<String> l1 = l.subList(0, 1);
		System.out.println(l1);
		
		//���� ����һ���յıȽ��� ������Ȼ��������
		l.sort(null);
		System.out.println(l);
		
//		l.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		l.sort((o1,o2)->{return o2.compareTo(o1);});
		System.out.println(l);
		
	}

}
