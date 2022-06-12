package thread_source;

public class demo_1 extends Thread{
	
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+" hello");
			//i++;
			
		}
	}

	public static void main(String[] args) {
		demo_1 d1 = new demo_1();
		d1.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+" goyal");
			//i++;
			
		} 

	}

}
