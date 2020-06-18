package javaSE;

import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

class SetItem{
	private int id;
	private String name;
	public SetItem() {
		
	}
	public SetItem(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SetItem [id=" + id + ", name=" + name + "]";
	}
	
	//��дhashcode��equals������set��Ϊͬ��������ֵ����ͬһ������
	@Override
	public int hashCode() {
		return id+name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		SetItem item = (SetItem)obj;
		return item.id == this.id && item.name.equals(this.name);
	}
	
	
	
}

public class TestSet {

	public static void main(String[] args) {
		
		/**
		 * HashSet�洢���ݹ��� �ײ���hash��(����������+����)
		 * ��ȡ����hashcode()��ֵ ���hashcode()ֵ��Ӧλ����û������ ֱ�Ӵ�� 
		 * ���hashcode()ֵ��ͬ �ٶԶ������equals����  �������Ƿ���ȫһ��  
		 * ���hashcodeֵ��ͬ equalsֵ����ͬ ���ڵײ��������ͬhashcodeֵλ���ϴ���һ������ ���д洢
		 * ����̫���Ļ����²���̫�� �������ȳ���8��ʱ�� ת��Ϊ������
		 * 
		 * ���洴������TreeSet �ײ����ݽṹ�Ƕ����� ÿ���ڵ���ӽڵ㲻��������
		 * ÿ���ڵ����һ����������������� �ֱ�ָ����ڵ���ҽڵ� ��ڵ��С��  �ұߴ洢���
		 * 
		 * HashSet NavigableSet TreeSet LinkedHashSet����
		 * HashSet������Ч�ʸ�
		 * TreeSet���� һ������Ȼ���� Ҳ�����Լ�ָ���Ƚ�����������
		 * LinkedHashSet����  �ǰ��ռ����˳��(����洢)
		 * 
		 * 
		 * HashSet�ײ���һ��HashMap û��value ֻ��key 
		 * TreeSet�ײ���һ��TreeMap
		 * ������Key��Ϊֵ null��Ϊvalue
		 * */
		
		//��֤�ظ������޷����뵽set��
		SetItem i1 = new SetItem(1, "zs");
		System.out.println(i1.hashCode());
		SetItem i2 = new SetItem(2, "ls");
		SetItem i3 = new SetItem(1, "zs");
		System.out.println(i3.hashCode());
		HashSet<SetItem> hashSet = new HashSet<SetItem>();
		hashSet.add(i1);
		hashSet.add(i2);
		hashSet.add(i3);
		System.out.println(hashSet);
		
		//TreeSet�Ǹ���CompareTo��������ȥ�ص�... return 0�ͻᱻȥ�� ����...
		SortedSet<String> set = new TreeSet<>();
		set.add("cc");
		set.add("aa");
		set.add("aa");
		set.add("bb");
		
		set.forEach(System.out::println);
		
		//�����ĵ�һ��Ԫ�غ����һ��Ԫ��
		System.out.println("��һ��Ԫ�أ�"+set.first()+" ���һ��Ԫ�أ�"+set.last());
		
		//subset ȡ�Ӽ� ��Χͬ����[)
		System.out.println(set.subSet("aa", "cc"));
		
		SetItem d1 = new SetItem(1,"dfs");
		SetItem d2 = new SetItem(2,"ad");

		/*
		 * Comparator<SetItem> com = (o1,o2)->o1.getName().compareTo(o2.getName());
		 * Comparator<SetItem> com1 = (o1,o2)->{return
		 * o1.getName().compareTo(o2.getName());};
		 */
		
		
		//�ڹ���Set��ʱ���Լ�ָ���Ƚ���
		/*
		 * ������Ҫע�����¼���
		 * 1>����ĺ���ʽ�ӿڵķ�����Ҫ����һ��intֵ��
		 * 2>lambda���ʽ��()->{} ���ʡ��{} ��Ĭ�Ͻ����ʽ�ķ���ֵ���� �����ʡ��{}�����������ʽ���з���ֵ ���Ƚ�return���д�� 
		 * ��������ǰ�����䱨�� �﷨����ʾ �ȸ����������
		 */
		TreeSet<SetItem> treeSet = new TreeSet<SetItem>((o1,o2)->{o1.getName().compareTo(o2.getName());return 0;}) ;
		treeSet.add(d1);
		treeSet.add(d2);

		System.out.println(treeSet);
		
		NavigableSet<Integer> treeSet2 = new TreeSet<>();
		treeSet2.add(11);
		treeSet2.add(22);
		treeSet2.add(88);
		treeSet2.add(77);
		treeSet2.forEach(System.out::println);
		//����С��ָ���������������
		System.out.println(treeSet2.floor(33));
		//���ش���ָ����������С����
		System.out.println(treeSet2.ceiling(33));
		//����һ�������NavigableSet
		System.out.println("---------���򼯺�--------");
		treeSet2.descendingSet().forEach(System.out::println);
		//����һ������ĵ�����
		System.out.println("---------���������--------");
		treeSet2.descendingIterator().forEachRemaining(System.out::println);
		//�Ƴ���һ�������һ��Ԫ��
		treeSet2.pollFirst();
		treeSet2.pollLast();
		System.out.println("------�Ƴ���--------");
		treeSet2.forEach(System.out::println);
	}
	
	
}
