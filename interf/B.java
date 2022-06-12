package interf;

public interface B {
	
	void greet() 
	{
		System.out.println("hello man ");
	}
	// static methods cannot be inherited 
	// static interface methods should always have a body
	
	
	public static void main(string[] args)
	{
		B obj = new B();
		obj.greet();
	}

}
