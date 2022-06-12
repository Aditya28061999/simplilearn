package Exception_Handling;

class NegativeDimensionException
{
	return "area can't be negative";
}

public class throws_exception {
	
//	static int method_1()
//	{
//		return 10/0;
//	}
//	
//	static void method_2()
//	{
//		method_1();
//	}
//	
//	static void method_3() throws Exception
//	{
//		method_2();
//	}
	
	static int area(int l, int b) throws NegativeDimensionException
	{
		if(l<0 || b<0)
		{
			throw new negativeDimensionException();
		}
		return l*b;
	}
	
	static void method_4() throws NegativedimensionException
	{
		System.out.println("area is : "+ area(10,-5));
	}

	public static void main(String[] args)throws NegativeDimensionException {
		//method_3();
//		try
//		{
//			method_3();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//
//		}
		method_4();

	}

}
