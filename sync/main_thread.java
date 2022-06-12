package sync;
import java.lang.Runnable;

public class main_thread implements Runnable{
	
	public static int  count = 0;
	
	void Start()
	{
		while(main_thread.count < 10)
		{
			try
			{
				System.out.println(Thread.currentThread().getName());
				main_thread.count++;
				Thread.sleep(1000);
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main_thread obj1 = new main_thread();
		Thread thread1 = new Thread(obj1);
		thread1.setName("first");
		thread1.start();
		
		main_thread obj2 = new main_thread();
		Thread thread2 = new Thread(obj2);
		thread2.setName("second");
		thread2.start();
		
		while(main_thread.count < 10)
		{ 
			try
			{
				System.out.println(Thread.currentThread().getName());
				main_thread.count++;
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
