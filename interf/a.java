package interf;

public interface a extends brake{
	@Override
	public void brake()
	{
		System.out.println("this is a brake class");
	}
	
	default void fun()
	{
		syystem.out.println("i am in a");
	}

}
