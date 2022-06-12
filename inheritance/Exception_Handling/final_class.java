package Exception_Handling;

public class final_class {

	public static void main(String[] args) {
		System.out.println(10/5);
		System.out.println("final meaasge");
		
		try
		{
			System.out.println(10/0);
			
			

		}
		 catch(ArithmeticException e)
		{
				System.out.println(e);

		}
		// when it is not confirm that you can handle all the exception
		// the  we can use the finally block
		
		finally
		{
			System.out.println("final message");
			

		}



	}

}
