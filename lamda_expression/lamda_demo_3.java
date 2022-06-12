package lamda_expression;

@FunctionalInterface
interface lambda
{
	public void display();
}

class demo
{
	public void display()
	{
		System.out.println("my name isa goyal");
	}
}

public class lamda_demo_3 {

	public static void main(String[] args) {
		int demo=10;
		final int count=1;
		//count++;
		lambda m3=() -> 
		{
			
			// int count=0;
		//	count++;
			
			System.out.println("hii");
			System.out.println("bye : " + demo);
			
		};
		
		m3.display();
		
		
	}
		

	}


