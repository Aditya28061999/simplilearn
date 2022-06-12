package thread_demo;

public class thread_demo_1 extends Thread{
	
	void Start()
	{
		System.out.println("thread started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_demo_1 t1 = new thread_demo_1();
		thread_demo_1 t2 = new thread_demo_1();
		
		t1.start();
		t2.start();
		

		
		

	}

}
