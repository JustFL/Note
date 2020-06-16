package javaSE;

/**
 * �ӿ���һ�����͹淶
 * ��ͨʵ����ʵ�ֽӿ� ����ʵ�ֽӿ��е����г��󷽷�
 * ����Լ̳ж���ӿ�
 * �ӿڿ��Լ̳кͶ�̳�
 * @author summerKiss
 *
 */

//�����ͷ
interface Elec3{
	//�ӿ��е����г�Ա����public
	public abstract void charge3();
	default void df() {
		System.out.println(3);
	}
}

//�����ͷ
interface Elec2{
//	public abstract void charge2();
	void charge2();
//	public final int N = 55;
	int N = 55;
	//Ĭ�Ϸ���
	default void charge2Default() {
		System.out.println("charge default!");
	}
	//��̬����
	static void charge2Static() {
		System.out.println("charge static!");
	}

	default void df() {
		System.out.println(2);
	}
}

//��ͷ�̳������������� ʵ���˹��ܵ���չ
interface Socket extends Elec2,Elec3{
	void socketCharge();
	
	//����̳еĽӿ�����������Ĭ�Ϸ��� ��Ҫ��д
	default void df() {
		//��д����ʱ ���Ҫ���ø���ӿڵ�Ĭ�Ϸ���ʵ��ʱ ����
		Elec2.super.df();
		Elec3.super.df();
	}
}

class Computer implements Socket{

	@Override
	public void charge2() {
		System.out.println("computer use 2 charge!");
	}

	@Override
	public void charge3() {
		System.out.println("computer use 3 charge!");
	}

	@Override
	public void socketCharge() {
		System.out.println("computer use socket charge!");
	}
	
	public void show() {
		charge2Default();
		//�ӿ��еľ�̬���� ��Ҫʹ������.���������� 
		Elec2.charge2Static();
	}
	
}


public class TestInterface {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.charge2();
		computer.charge3();
		computer.socketCharge();
		computer.show();
		computer.charge2Default();
		
		computer.df();
		
		//������ ����������ĳ��󷽷� ����ʹ�������ڲ���ֱ�ʵ�������ӿڵĳ��󷽷�
	}
}
