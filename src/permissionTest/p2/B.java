package permissionTest.p2;

import permissionTest.p1.A;

/**
 * ��ͬ���е��಻��ֱ��ʹ�� ���ַ���
 * 1 import package.class ���� import package.*
 * 2 ʹ�����ȫ�޶�����packagename.classname
 * �����ͬ������ͬ������ ֻ��ʹ��ȫ�޶�������ʹ��
 * @author summerKiss
 *
 */

public class B {
	public void bTest() {
		permissionTest.p1.A a = new A();
		//��ͬ����������� ����public���ε����� ����Ķ������Է���
		//System.out.println(a.a1);
		//System.out.println(a.a2);
		//System.out.println(a.a3);
		System.out.println(a.a4);
	}
}
