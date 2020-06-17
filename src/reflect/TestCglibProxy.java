package reflect;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TestCglibProxy {
	
	public static void main(String[] args) {
		//�������������(Ŀ�����)
		JJ jj = new JJ();
		//�������������
		Enhancer ehancer = new Enhancer();
		//�������̳�Ŀ����� ��ȡĿ���������з���
		ehancer.setSuperclass(JJ.class);
		//���÷��������ض��� ����������ʵ�ָ��ֶԴ������Ĵ���
		ehancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodproxy) throws Throwable {
				System.out.println("��ױ");
				Object obj = method.invoke(jj, args);
				System.out.println("�ؼ�");
				return obj;
			}
		});
		
		//�����������
		JJ jjProxy = (JJ)ehancer.create();
		//������ô�����
		jjProxy.Singing();
		jjProxy.Talent();
	}
	
	
}
