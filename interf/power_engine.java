package interf;

public class power_engine implements engine{
	
	@Override
	public void start()
	{
		system.out.println("power engine starts");
	}
	
	@Override
	public void stop()
	{
		System.out.println("power engine stop");
	}
	
	@Override
	public void accl()
	{
		System.out.println("power engine acclerate");
	}

}
