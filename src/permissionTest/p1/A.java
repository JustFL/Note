package permissionTest.p1;
/**
 * private���η� ֻ���ڱ�����ʹ��
 * Ĭ�����η� �����ڱ����ͬ��������ʹ��
 * public���η� ���κεط�������ʹ��
 * @author summerKiss
 *
 */
public class A {
	private int a1;
	int a2;
	protected int a3;
	public int a4;
	
	public void aTest() {
		//�����ж�����ʹ��
		System.out.println(a1+a2+a3+a4);
	}
}
