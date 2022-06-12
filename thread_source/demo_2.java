package thread_source;

public class demo_2 implements Runnable{
	
	public void run()
	{
		int i=1;
		while(i<15)
		{
			System.out.println(i+" hello");
			i++;
			
		}
	}	
		public static void main(String[] args)
		{
			demo_2 d2 = new demo_2();
			Thread t1= new Thread(d2);
			t1.start();
			

			int i=1;
			while(i<15)
			{
				System.out.println(i+" Goyal");
				i++;
				
			}
			
			
			
		}
	

	
	
	}
	
	