package lamda_expression;

@FunctionalInterface
interface MyLamda
{
	public void display();
}

//class my implements MyLamda
//{
//	public void display()
//	{
//		System.out.println("hello Lambda");
//	}
//}

public class lamdademo_1 {

	public static void main(String[] args) {
		MyLamda m1 =()-> {
		//	public void display()
		//	{
				System.out.println("hello Lambda");
		//	}
		};
		
		
				
		m1.display();
		
		
		

	}

}
