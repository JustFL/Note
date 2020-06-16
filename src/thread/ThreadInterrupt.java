package thread;

/**
 * ���߳�A����sleep����join������״̬ʱ
 * �߳�B������A.interrupt()����
 * �߳�A�������� �����쳣���� 
 * �����������߳�t1(A)����sleep���� ���߳�(B)����A.interrupt()
 * ʹ�߳�t1�����쳣����
 * */

public class ThreadInterrupt {
	public static void main(String[] args) {
		   
        InterruptThread it1 = new InterruptThread();
		InterruptThread it2 = new InterruptThread();
		Thread t1 = new Thread(it1,"t1");
		Thread t2 = new Thread(it2,"t2");
		t1.start();
		t2.start();
		t1.interrupt();
        
//		RunnableDemo2 r = new RunnableDemo2();
//		Thread t = new Thread(r);
//		t.start();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//        t.interrupt();
		
        System.out.println("main end");
	}
}

class InterruptThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i == 3 && Thread.currentThread().getName().equals("t1")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("�쳣����");
				}
			}
		}
		
	}
	
}

class RunnableDemo2 implements Runnable{
	
	public void run() {
		while(true) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Yes,I am interruted,but I am still running");
				return;
	        }else{
	            System.out.println("not yet interrupted");
	        }
		}
		
		
	}
	
}


