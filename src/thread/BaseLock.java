package thread;

import java.util.concurrent.locks.ReentrantLock;

public class BaseLock {
	
	static private ReentrantLock baseLock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		new Thread("t1") {

			@Override
			public void run() {
				
				try {
					baseLock.lock();
					System.out.println(Thread.currentThread().getName() + " start ...");
					
					for (int i = 0; i < 20; i++) {
						System.out.println(Thread.currentThread().getName() + "->" + i);
					}
				} finally {
					baseLock.unlock();
				}
			}
			
		}.start();
		
		
		new Thread("t2") {

			@Override
			public void run() {
				
				try {
					baseLock.lock();
					System.out.println(Thread.currentThread().getName() + " start ...");
					
					for (int i = 0; i < 20; i++) {
						System.out.println(Thread.currentThread().getName() + "->" + i);
					}
				} finally {
					baseLock.unlock();
				}
			}
			
		}.start();
	}
}
