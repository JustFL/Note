package javaSE;
/**
 * static���εı�����������������ڴ�ĶѺ�ջ�� ���Ǵ����ڷ�������
 * �ڳ��򴴽�ĳ������֮ǰ ��Ҫ�Ƚ������ģ�� Ҳ����������.class�ļ����ص��������� Ȼ��������ģ�������������Ķ���
 * ���������������ֽ����ļ�ʱ ͬʱ���ڷ������д�����̬�ı��� ������ɳ�ʼ��
 * 
 * static���εķ���Ϊ��̬���� ����ʹ��this super�ؼ��� ���ܷ��ʷǾ�̬��Ա �Ǿ�̬����
 * ʵ�������ȿ��Է���ʵ����Ա Ҳ���Է��ʾ�̬��Ա
 * 
 * @author summerKiss
 *
 */
class TS{
	int c1;//ʵ����Ա���� ����ÿ����������
	static int c2;//��̬��Ա���� ������ �����ڶ��� ������ж����� �����ڶ������
	static int c3;
	
	//��̬�� ��ʼ���� �����еľ�̬��Ա������ֵ �ڼ������ʱ���Զ�ִ��һ��
	{
		c3 = 100;
	}
	
	public void f1() {
		//�����Է���
		System.out.println(c1);
		System.out.println(c2);
		f2();
	}
	
	public static void f2() {
		//System.out.println(c1);//���ܷ��ʷǾ�̬��Ա
		System.out.println(c2);
		//f1();//���ܷ��ʷǾ�̬��Ա
	}
}

public class TestStatic {
	public static void main(String[] args) {
		TS ts1 = new TS();
		TS ts2 = new TS();
		ts1.c1++;
		ts2.c1++;
		TS.c2++;//��̬������������ ����ʹ��ʱ ��Ҫts1. ����Ҫ������.
		TS.c2++;
		System.out.println(ts1.c1);
		System.out.println(ts2.c1);
		System.out.println(TS.c2);
		System.out.println(TS.c2);
		System.out.println(TS.c3);
	}
	
}
