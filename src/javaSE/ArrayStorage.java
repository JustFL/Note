package javaSE;
/**
 * 
 * @author summerKiss
 * һ��java�����Ӧһ��jvm jvm��һ���ڴ� ���з�Ϊ�Ѻ�ջ 
 * ջ��һ���Ƚ���������ݽṹ ��java�����main������ʼ����ʱ ���Ƚ�main����ѹ��ջ�� �����õķ��������ν�ջ
 * ��main�����ж������ʱ ��������ǻ����������� �Ὣ����������ֱֵ�Ӵ洢��ջ��
 * ����������������� ��ջ�д洢���Ǳ������ڴ��ַ ��ַ��ָ����� ������ֵʵ�ʴ洢�ڶ���
 */
public class ArrayStorage {
	public static void main(String[] args) {
		//��̬��ʼ��
		int[] a = {55};
		int[] b = {66};
		a = b;
		System.out.println(a[0]);
		b[0] = 77;
		System.out.println(a[0]);
		
		
		//���鸴��
		//������ָ�����ȵ����� ϵͳ���Զ����г�ʼ�� ���Ƕ�̬��ʼ��
		int[] c = new int[10];
		System.arraycopy(a, 0, c, 5, 1);
		for (int i : c) {
			System.out.println(i);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int[] d = a.clone();
		System.out.println(d);
		for (int i : d) {
			System.out.println(i);
		}
 	}
}
