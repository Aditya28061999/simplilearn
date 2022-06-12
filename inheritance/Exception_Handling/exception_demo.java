package Exception_Handling;

public class exception_demo {

	public static void main(String[] args) {
		int a=10,b=0,c;
		// c=a/b;
//		System.out.println(c);
//		System.out.println("Bye");
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("denominator should be zero ");

		}
		System.out.println("bye");



	}

}
