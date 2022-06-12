package interf;

public class electric implements engine{
	
	@Override
	public void start()
	{
		System.out.println("electric engine start");
	}
	
	@Override
	public void stop()
	{
		System.out.println("electric engine stop");
	}
	
	@Override
	public void accl()
	{
		System.out.println("electric engine acclerate");
	}

}
