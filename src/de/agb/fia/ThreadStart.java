package de.agb.fia;

/**
 * @author Daniel Katzberg
 *
 */
public class ThreadStart {

	public static void main(String[] args) {
		ThreadStart threadStart = new ThreadStart();
		threadStart.testThreads();
	}

	public void testThreads() {
		Thread thread1 = new Thread(new CounterRunnable("Thread1"));
		Thread thread2 = new Thread(new CounterRunnable("Thread2"));
		thread1.start();
		thread2.start();
	}

}
