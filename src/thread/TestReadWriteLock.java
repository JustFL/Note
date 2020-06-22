package thread;

/**
 * 
 * �����д�� ͬһʱ��ֻ����һ����
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
	
	static private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	static void read() {
		try {
			lock.readLock().lock();
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName() + "���ڶ�" + i + "��");
			}
		} finally {
			lock.readLock().unlock();
		}
	}
	
	static void write() {
		try {
			lock.writeLock().lock();
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName() + "����д" + i + "��");
			}
		} finally {
			lock.writeLock().unlock();
		}
		
	}
	
	public static void main(String[] args) {
		
		new Thread("t1") {

			@Override
			public void run() {
				read();
				write();
			}
			
		}.start();
		
		new Thread("t2") {

			@Override
			public void run() {
				read();
				write();
			}
			
		}.start();
		
	}
}
