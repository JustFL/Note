package javaSE;

/**
 * ���к����ڲ���ı������� �ڲ���->Outer$Inner.class
 * �ⲿ��Outer.class
 * @author summerKiss
 *
 */

interface Anonymous{
	void show();
}

class Outer{
	int a = 1;
	int b = 2;
	
	//ʵ����Ա�ڲ���
	class Inner{
		int a = 2;
		//�ڲ����в���������̬����
		//static int b;
		public void show() {
			//�ڲ����з����ⲿ��ͬ���ĳ�Ա����
			System.out.println("outer:"+Outer.this.a);
			//�ڲ����з����ⲿ����� ����ֱ�ӷ���
			System.out.println("outer:"+b);
			//�ڲ�������Լ�����
			System.out.println("inner:"+a);
		}
	}
	//��̬��Ա�ڲ���
	static class StaticInner{
		int a = 3;
		public void show () {
			System.out.println(a);
		}
	}
	
	
	public void show() {
		//�ⲿ������ڲ����ʵ������ ��Ҫ�ȴ����ڲ���Ķ���
		Inner inner = new Inner();
		System.out.println("inner:"+inner.a);
		
		//�ֲ��ڲ��� �ڷ����д���
		class PartInner{
			int a = 4;
			public void show() {
				System.out.println(a);
			}
		}
		
		PartInner partInner = new PartInner();
		partInner.show();
	}
}
public class TestInner {

	public static void main(String[] args) {
		//����ʵ����Ա�ڲ���Ķ��� ���ҵ����ڲ��෽��
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
		
		//������̬�ڲ���Ķ���
		Outer.StaticInner staticinner = new Outer.StaticInner();
		staticinner.show();
		
		//��֤�ֲ��ڲ���
		Outer outer = new Outer();
		outer.show();
		
		//�����ڲ��� ����ʵ�ֻ��߼̳�һ���ӿڻ����� ����new Anonymous()�����Ǵ����ӿڶ��� ���Ǵ�����ʵ����Ķ���
		Anonymous a = new Anonymous() {

			@Override
			public void show() {
				System.out.println("----------------");
				System.out.println("123");
			}
			
		};
		a.show();
	}

}
