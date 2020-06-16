package thread;

public class ThreadInterrupt {
	public static void main(String[] args) {
		RunnableDemo2 r = new RunnableDemo2();
		Thread t = new Thread(r);
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        t.interrupt();
 
        System.out.println("main end");
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
