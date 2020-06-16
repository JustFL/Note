package javaSE;

/**
 * ������ �ǳ�������һ������ ���ܴ������� ��Ҫ����̳� �������������� �������������һ��ģ��
 * @author summerKiss
 *
 *
 * ������ͽӿڵ�����
 * ��������һ��ģ�� �Ǹ����Ʒ ���ڲ��涨�����Ի��߷��������ģ�����Ҫ���� ����̳��Ժ�����ڴ˻����Ͻ�����չ 
 * ��������̳г������ ˵���������Ҫ����Ҳ�Ǻ����ģ��һ����
 * 
 * �ӿ���ʵ��һ�����淶 ��ĳһ��� ʵ����ʵ�ֽӿں� �Ϳ��Զ�����ܽ��о���ʵ�� 
 * ����ʵ�������Ҫ���ܲ����ǽӿڵĹ��� ���ǽӿڹ���ҪΪ����Ҫ���ܷ����
 * ���˹۵�ӿ���ʵ���� �����кܶ�����Ҫʵ��ĳ������ ���Ҫ��ÿ�����ж�����һ�αȽ��鷳 ���Գ�ȡ����һ����ͬ�Ľӿ�
 * ��Ҫ������ܵ�ʵ�ֽӿ� ��д�Լ���ʵ���߼�����
 * 
 * ������ֻ�ܵ��̳� ���ǽӿڿ���ʵ�ֶ��
 * 
 */
abstract class Traffic{
	private int count;//���ڸ����private���� �����ǿ��Լ̳е� �����޷�����
	Traffic(int count){
		this.count = count;
	}
	public int getCount() {
		return this.count;
	}
	abstract void run();
}

//�������ʵ�ֳ���������г��󷽷�
class Bus extends Traffic{

	Bus(int count) {
		//��������Ĺ�����Ĭ�϶�����ʽ���ø�����޲��������� ��������ڻᱨ�� 
		//������ʽ���ø�����вι�����
		super(count);
	}

	@Override
	void run() {
		System.out.println("car running in road! "+this.getCount());
		System.out.println("car running in road! "+super.getCount());
	}
}


public class TestAbstract {
	public static void main(String[] args) {
		Bus bus = new Bus(4);
		bus.run();
	}
}
