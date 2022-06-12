package interf;

public class car implements engine , brake{
	// it is used in place of multiple inheritance
	@Override
	public void brake()
	{
		System.out.println("i brake like a normal car");
	}
	

	@Override
	public void stop()
	{
		System.out.println("i stop like a normal car");
	}
	

	@Override
	public void accl()
	{
		System.out.println("i acclerate like a normal car");
	}
	

	@Override
	public void start()
	{
		System.out.println("i start like a normal car");
	}
	

}
