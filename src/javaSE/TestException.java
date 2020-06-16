package javaSE;

/**
 * Throwable��Ϊ����Error���쳣Exception
 * Errorһ��Ϊjava������ڲ����� �޷����
 * Exception��Ϊ�ܼ��쳣 ���Ƿ�����ʱ�쳣 ���ֱ��붼�޷�ͨ�� ���봦�� ������Exception����һ��������
 * ��������ʱ�쳣 ���ֿ���ͨ���쳣�������ʹ����������� �����ж�
 * 
 * debugģʽF5���뷽���� F6�����뷽���� ������һ�д���
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class SelfDefineException extends Exception{

	private static final long serialVersionUID = 1L;

	public SelfDefineException(String str) {
		
	}
}

public class TestException {
	
	public static void a() {
		b();
	}
	
	public static void b() {
		
		System.out.println("--------���´���ѧϰtry-catch---------------");
		//try-catch
		Scanner superman = new Scanner(System.in);
		System.out.println("��������������");
		//try���ܻ�����쳣�Ĵ���
		try {
			//b=0 java.lang.ArithmeticException
			int a = superman.nextInt();
			int b = superman.nextInt();
			int res = a / b;
			System.out.println(res);
		} 
		//catch��û���쳣����ִ��
		//�����ֵ��쳣���ͺ�catch�����쳣���Ͳ�ƥ�� ��ִ��catch����� ������ж�
		//�����쳣���Һ�catch����������ͬ  ִ��catch�����
		catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
			//��ӡ�쳣�Ķ�ջ�Ĺ켣��Ϣ
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("���������������");
		}
		//ע�� ���catch���ʱ�� ����˳���  һ�㳣���ģ��򵥵ģ�����ķ�����  
		
		finally {
			//�����Ƿ����쳣һ��Ҫִ�еĴ��� ����Ҫ�ж�ҲҪִ�� ����System.exit(0) �˳������;
			superman.close();
		}
	}
	
	
	//Exception�ܼ��쳣 �����ڴ����н��д���  RuntimeException�����쳣 �ڴ����п��Բ�����
	//�������׳��쳣����ʱ ��Ҫ�ڷ���ͷ�Ͻ�������Ҫ�׳��쳣throws Exception
	public void f() throws Exception{
		System.out.println("throws�ؼ��ֽ����쳣�׳�");
		throw new RuntimeException();	
	}
	
	public void f1() throws Exception{
		System.out.println("�׳��Զ����쳣���д���");
		//throw�ؼ����Լ��׳�һ���쳣����
		throw new SelfDefineException("����һ���Զ����쳣");
	}
	
	public static void main(String[] args) {
		
		/**
		 *  չʾ�˷���ջ�ķ���ѹ��˳�� �����׳��쳣��ʱ��������ջ�ķ��� ������������ջ�ķ����׳�
		 *  ������������쳣������� �ʹ��� ������������׳�
		 * 	at javaSE.TestException.b(TestException.java:43)
			at javaSE.TestException.a(TestException.java:30)
			at javaSE.TestException.main(TestException.java:67)
		 */
		a();
		
		System.out.println("--------���´���ѧϰthrows---------------");
		TestException t = new TestException();
		//f()���������쳣��  ��������Ҫ����  ���Լ������Լ��ĵ������׳��쳣 ���߽���try-catch����
		try {
			t.f();
		} catch (Exception e) {
			System.out.println("�����߽��յ��쳣 ���д���");
			e.printStackTrace();
		}
		
		System.out.println("--------���´���ѧϰ�Զ����쳣---------------");
		try {
			t.f1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("�쳣�� �����������ִ��");
		
		
	}

}
