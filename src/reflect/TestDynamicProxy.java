package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK��̬���� ģʽΪ�ӿ�+ʵ����
 * ��̬���� �����еĽ׶�Ϊÿ���������������� ������ʱ�����������*/

public class TestDynamicProxy {
	public static void main(String[] args) {
		
		//����Ŀ�����
		JJ jj = new JJ();
		
		//����������� ��������˵��
		//loader Ŀ������������ ��Ϊ���������Ҫ֪��Ŀ�����е�������Ϣ ����Ŀ����󴴽��������
		//interfaces Ŀ������ʵ�ֵĽӿ��б�(��ȡĿ��������з���)
		//InvocationHandler ��������Ĳ���
		Person p = (Person)Proxy.newProxyInstance(JJ.class.getClassLoader(), JJ.class.getInterfaces(), new InvocationHandler() {
			
			//InvocationHandler�ӿڷ���invoke ������������������ִ��  ÿ��һ��Ŀ�귽��ִ�� ����Ҫ��һ��������invokeִ�� 
			//���类��������10������ �ͻ���10�������� invoke�ͻ�ִ��10�� ���Ǳ������з�����
			//����˵��
			//proxy  �������
			//method Ŀ�귽������������
			//args   Ŀ�귽���Ĳ���
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if(method.getName().equals("Singing")) {
					System.out.println("��ױ");
					method.invoke(jj);
					System.out.println("�ؼ�");
				}
				else if(method.getName().equals("Talent")) {
					System.out.println("�����");
					method.invoke(jj);
					System.out.println("��Ϣ");
				}
				
				
				return null;
			}
		});
		
		//���������ô�����
		p.Singing();
		p.Talent();
	}
}
