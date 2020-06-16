package javaSE;
/**
 * 
 * �ɱ��ַ�����
 * StringBuffer  �̰߳�ȫ
 * StringBuilder �̲߳���ȫ
 * @author summerKiss
 *
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		
		//StringBufferĬ��16���ַ���С �������100���ַ��Ĵ�С
		StringBuffer sb1 = new StringBuffer(100);
		System.out.println(sb1.capacity());
		
		//ƴ���ַ���
		sb1.append("abc");
		char[] chars = new char[] {'2','3','4'};
		sb1.append(chars);
		System.out.println(sb1);
		
		//����StringBuffer���ȵ�ʵ�ʵĳ���
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		//���ַ����в����ַ�
		sb1.insert(1, 'h');
		System.out.println(sb1);
		
		//�����ַ���
		sb1.setCharAt(1, 'a');
		System.out.println(sb1);
		
		//ɾ���ַ���[)
		sb1.delete(4, 7);
		
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		
		//��ת
		sb1.reverse();
		System.out.println(sb1);
		
		//����ָ������λ�õ��ַ�
		System.out.println(sb1.charAt(0));
		
		//����ָ���ַ�����һ�γ��ֺ����һ�γ��ֵ�λ��
		System.out.println(sb1.indexOf("b"));
		System.out.println(sb1.lastIndexOf("c"));
		
	}
}
