package de.agb.fia;
/**
 * @author DKatzberg
 *
 */
public class CounterRunnable implements Runnable {

	private String name;
	
	public CounterRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 300; i++) {
			System.out.println(name + " " + i);
		}
	}

}
