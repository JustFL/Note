package thread;
/**
 * ������̵߳���ͬһ�������ͬһ������ʱ
 * ϣ��һ���߳��ڵ��õ�ʱ�� �����̲߳�Ҫ������
 * ��ʱ���ԶԶ����һ��ͬ���� ����ֻ����һ���߳�ִ���귽��ʱ �����̲߳ſ���ִ�д˷��� 
 * ���ּ����ķ�ʽ
 * 1>ͬ�������
 * 2>ͬ������
 * ���ַ������Ķ��Ƕ���this
 * */

//ʵ��Runnable��������Դ�Ĺ���
class Bank implements Runnable{
	private int money = 0;
	//synchronized public void setMoney(){
	public void setMoney(){
		money += 100;
		System.out.println(Thread.currentThread().getName()+"����100Ԫ�����Ϊ"+money+"Ԫ");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			//ͬ������� ����ǰ�����ͬ����
			synchronized (this) {
				setMoney();
			}
			
		}
	}
	
	
}

public class TestSync {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t1 = new Thread(bank,"Tony Stark");
		Thread t2 = new Thread(bank,"Bruse Banner");
		t1.start();
		t2.start();

	}

}
