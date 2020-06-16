package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ��ʽ�������ͷ�ͬ����
 * ʹ��ReentrantLock�����lock()��unlock()����*/
class ThreadTicket implements Runnable{
	private int sum = 20;
	
	//�������� 
	//��ƽ��ָ���ǳ�ʼ������true ��ʾ���ͷ�����ʱ�� �ɵȴ�ʱ������߳�����ȡ��
	private ReentrantLock lock = new ReentrantLock(true);

	//synchronized public void saleTicket(){
	public void saleTicket(){
		try {
			lock.lock();
			sum = sum - 1;
			System.out.println(Thread.currentThread().getName()+"����һ��Ʊ��ʣ��Ʊ��Ϊ��"+sum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			lock.unlock();
		}
		
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			saleTicket();
		}
	}
}

public class TestReentrantLock {

	public static void main(String[] args) {
		ThreadTicket tt = new ThreadTicket();
		Thread t1 = new Thread(tt,"����һ");
		Thread t2 = new Thread(tt,"���ڶ�");
		t1.start();
		t2.start();

	}

}
