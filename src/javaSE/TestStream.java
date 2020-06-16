package javaSE;

import java.util.stream.IntStream;

/**
 * ����������ļ���ȡ���Ǹ��� 
 * ��������һ���Ե� ��ʱ�Ե�ͳ�Ƶ�
 * @author summerKiss
 *
 */
public class TestStream {
	public static void main(String[] args) {
		
		//����һ����
		IntStream is1 = IntStream.builder().add(10).add(40).add(27).build();
		//ĩ�˷��� ʹ����� ���ͱ��ͷŵ��� (�ۼ���������ĩ�˷���)
		/*
		 * max()
		 * min()
		 * sum()
		 * average()
		 * count()
		 */
			
		//ʹ���� �����ͷ�
		System.out.println(is1.max().getAsInt());
		
		//�ٴ�ʹ�� Ҫ���´���
		IntStream is2 = IntStream.builder().add(10).add(40).add(27).build();
		//ʹ�ù����� �����Ƿ�����Ԫ����������
		boolean allMatch = is2.allMatch(value->value>0&&value<100);
		System.out.println(allMatch);
		
		IntStream is3 = IntStream.builder().add(10).add(40).add(27).build();
		//ʹ�ù����� �����Ƿ���ĳ��Ԫ����������
		boolean anyMatch = is3.anyMatch(value -> value > 20);
		System.out.println(anyMatch);
		
		IntStream is4 = IntStream.builder().add(10).add(40).add(27).build();
		//�м䷽�� ������᷵������һ���� 
		is4.filter(value -> value > 20).forEach(System.out::println);

		
	}
}
