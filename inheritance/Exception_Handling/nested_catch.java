package Exception_Handling;

public class nested_catch {

	public static void main(String[] args) {
		int a[]= {30,20,10,40,0};
		try {
		int c=a[0]/a[5];
		System.out.println("Divison is : "+ c);
		
		System.out.println(a[3]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("denominator is zero");

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid array index");

		}
		System.out.println("bye");

		



	}

}
