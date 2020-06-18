package thread;
/**
 * sleep(ʱ��)����cpuʹ��Ȩ û�з�����
 * wait(ʱ��)����cpuʹ��Ȩ Ҳ������
 * wait()����û�в��� ��ʾһֱ�ȴ� ��Ҫʹ��notify()ȥ����
 * */
class WaitFunction implements Runnable{
	private int i = 10;
	@Override
	synchronized public void run() {
		for (; i >= 0; i--) {
			if(i == 5 && Thread.currentThread().getName().equals("t1")) {
				try {
					//Thread.sleep(1000);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(i == 3) {
				//���ѵȴ����е�����һ������ ���Ѻ�����������еȴ���ȡͬ����
				notify();
				//���������߳�
				//notifyAll();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}

public class TestWait {

	public static void main(String[] args) {
		WaitFunction wf = new WaitFunction();
		Thread t1 = new Thread(wf,"t1");
		Thread t2 = new Thread(wf,"t2");
		t1.start();
		t2.start();

	}

}
