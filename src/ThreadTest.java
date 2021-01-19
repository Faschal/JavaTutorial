
public class ThreadTest {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		
		MyRunable runable1 = new MyRunable();
		Thread thread2 = new Thread(runable1);
		
		thread1.start();
//		thread1.join();
		thread2.start();
		
	}

}
