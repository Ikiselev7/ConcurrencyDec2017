package lesson171205;

import lesson171201.Utils;

public class UseWorker {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		Worker worker = new Worker();
		
		worker.execute(() -> {
			Utils.pause(1000);
			System.out.println("one");
		});
		
		worker.execute(() -> {
			Utils.pause(1000);
			System.out.println("two");
		});
		
		worker.execute(() -> {
			Utils.pause(1000);
			System.out.println("three");
		});

		worker.execute(() -> {
			System.out.println("Poison lambda");
			Thread.currentThread().interrupt();
		});
		
		System.out.println("main finished");
		
	}

}
