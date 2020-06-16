package javaSE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * HashMap     �̷߳ǰ�ȫ   Ч�ʸ�
 * HashTable   �̰߳�ȫ      Ч�ʵ�
 * �ײ㶼��hash��
 * LinkedHashMap��HashMap����  �ײ�������  ���������Ԫ�ص�˳��
 * TreeMap �ײ��Ƕ����� ���� һ������Ȼ���� Ҳ�����Լ�ָ���Ƚ���
 * */

public class TestMap {

	public static void main(String[] args) {
		//HashMap֧�ֿռ��Ϳ�ֵ
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Tony Stark");
		map.put(2, "Steve Rogers");
		map.put(3, "Thor");
		System.out.println(map);
		
		//keyֵ�ظ� �Ḳ����ǰ��value
		map.put(2, "Bruce Banner");
		System.out.println(map);
		
		//�ж��Ƿ����ĳ������ĳ��ֵ
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Thor"));
		
		//����ĳ��keyȡ�ö�Ӧ��value
		System.out.println(map.get(2));
		
		//ɾ��ĳ������Ӧ�ļ�ֵ��
		map.remove(2);
		System.out.println(map);
		
		//����ֱ�ӷ��ʼ��ļ��� ����Set
		System.out.println(map.keySet());
		
		//ֵ�ļ��� ����Collection
		System.out.println(map.values());
		
		//����
		//1 ���ϵ�forEach
		map.forEach((k,v)->{System.out.println(k+","+v);});
		//2 Iterator
		System.out.println("-----------��Mapת��ΪEntry��ֵ�����ͽ��б���------------");
		map.entrySet().iterator().forEachRemaining(e->System.out.println(e.getKey()+","+e.getValue()));
		//3 Iterator+loop
		Iterator<Entry<Integer,String>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			Entry<Integer,String> e = i.next();
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		//���Map���� �鿴Map�Ĵ�С
		map.clear();
		System.out.println(map.size());
		
		//TreeMap���Զ�����key��ֵ��������
		SortedMap<Integer,String> sm = new TreeMap<>();
		sm.put(3, "Thor");
		sm.put(1, "Tony Stark");
		sm.put(2, "Steve Rogers");
	
		System.out.println(sm);
	}

}
