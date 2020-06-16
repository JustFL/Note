package javaSE;

import java.util.ArrayList;
import java.util.List;

//raw type ԭ������ ��Ҫָ�����͵ľ�������
//����һ��������
//���� <T>���ǲ��������� �ڵ��ù�����ͨ������Ĳ��������� ָ��Ŀ������
//���ҿ��������趨���͵ķ�Χ e.g class Genericity<T extends Number> ����ֻ�������Ͻ� ���������½�
class Genericity<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


/*
 * ���ͽӿ�
 * */
interface GenericityInterface<I>{
	void display(I arg);
}

/*
 * ���ͽӿ�ʵ����
 * ��һ������ ���ͽӿ�ʵ����ȷ�������� ����ָ����String����
 * */
class GenericityInterfaceImp1 implements GenericityInterface<String>{

	@Override
	public void display(String arg) {
		System.out.println(arg);
	}
	
}

/*
 * �ڶ������� ���ͽӿ�ʵ������Ȼ��ȷ������
 * */
class GenericityInterfaceImp2<I> implements GenericityInterface<I>{

	@Override
	public void display(I arg) {
		System.out.println(arg);
	}
}


class GenericityClass{
	//���͹�����
	public <T> GenericityClass(T arg) {
		System.out.println("this is Genericity constructor");
	}
	
	//���ͷ��� ����һ��T���͵Ķ��� ����Ĳ���Ҳ��T���͵�
	public <T> T show(T arg) {
		return arg;
	}

}

public class TestGenericity {
	
	//�޽�ͨ��� <?> (���Ͳ���) ƥ���˷��������е����� �����������½� 
	public void show(Genericity<?> g) {
		System.out.println(g.getT());
	}
	
	//�Ͻ����� ��ʾ��������ֻ����Number���������� ���������ͻ��ڱ���׶ξͱ���
	public void showup(Genericity<? extends Number> g) {
		System.out.println(g.getT());
	}
	
	//�½����� ��ʾ��������ֻ����Number�ĸ���
	public void showdown(Genericity<? super Number> g) {
		System.out.println(g.getT());
	}

	public static void main(String[] args) {

		//ԭ������ û��ָ�����͵ľ������� ���Դ���object���͵���������
		/*
		 * Genericity g1 = new Genericity(); 
		 * g1.setT(1);
		 */
		
		//ָ���˷������� �Ⱥ��ұߵ�<>����Բ�д����������  ��������д��
		Genericity<String> g2 = new Genericity<>();
		g2.setT("hello world!");
		System.out.println(g2.getT());
		
		//��ָ���˷�������֮�� ����ָ����String
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("aaaa");
		//arrayList.add(100); �����ڴ������ε�ʱ�� ����ͻᱨ��
		
		//����ֻ�ڱ���׶���Ч 
		//ͨ����������ӿ���֤�� �ڱ���֮�������ȡȥ���ͻ��Ĵ�ʩ Ҳ����˵Java�еķ��� ֻ�ڱ���׶���Ч 
		//�ڱ�������� ��ȷ���鷺�ͽ���� �Ὣ���͵������Ϣ���� 
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<Double> a2 = new ArrayList<Double>();
		System.out.println(a1.getClass());
		System.out.println(a2.getClass());
		
		System.out.println("-------------�޽�ͨ���---------------");
		Genericity<Double> g3 = new Genericity<>();
		g3.setT(432.789);
		TestGenericity t1 = new TestGenericity();
		t1.show(g2);
		t1.show(g3);
		
		
		//���͹�������ʹ�� ����ʲô���� T����ʲô����
		GenericityClass g = new GenericityClass("abc");
		/* ���ͷ�����ʹ�� 
		* ��Ϊ����ʵ�ֵ�ʱ��������ͺͷ���ֵ����T���͵� 
		* ���Ե����õ�ʱ�� ��������Integer����
		* �������ֵ����Ҳ��Integer��
		*  
		*  */
		System.out.println(g.show(1).getClass());
		System.out.println(g.show("hello world!").getClass());
		
		//���ͽӿ�ʵ����ȷ�������� ʵ���������÷���ʱ�Ϳ���ֱ�ӿ�����������
		GenericityInterfaceImp1 gi1 = new GenericityInterfaceImp1();
		gi1.display("hello world!");
				
		//���ͽӿ�ʵ����������ʱ���Բ�ȷ������ ����Ҫ��ʵ������ʱ��ָ������
		GenericityInterface<Float> gi2 = new GenericityInterfaceImp2<Float>();
		gi2.display(1F);
	}

}
