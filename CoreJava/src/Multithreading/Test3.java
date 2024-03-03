package Multithreading;

public class Test3 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<= 10 ; i++) {
			System.out.println("Thread running : "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		Test3 t4 = new Test3();
		Test3 t5 = new Test3();


		t3.start();
		t3.setName("lavda");
		t3.interrupt();
		t4.start();
		t4.setName("Yedzawa");
		t5.setName("lasun");
		t5.start();

		
	}

}
