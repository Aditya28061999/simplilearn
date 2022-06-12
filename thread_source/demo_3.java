package thread_source;

public class demo_3 extends Thread{
	
	public void Run() {
		while(true)
		{
			String name = "my name is Goyal";
					System.out.println(name);
		            try
		            {
		            	
		           Thread.sleep(1);
		            }
		            catch(Exception e)
		            {
		            	e.printStackTrace();
		            }
		}
	}

//	public void demo_3(String name)
//	{
//		super(name);
//		 
//	}

	public static void main(String[] args) {
		// demo_3 d3 = new demo_3("my name is Goyal");
		Thread t2 = new Thread();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		t2.start();
		t2.interrupt();
		while(true)
		{
			String name = "Goyal is the new boss";
					System.out.println(name);
		}
		//System.out.println(t2.isAlive());
		//System.out.println("program ended");




		
	     
		

	}

}
