package lamda_expression;

@FunctionalInterface
interface lambda
{
	public void display(String str);
	
}



public class demo_4 {
	
	public void reverse(String rev)
	{
		StringBuffer sb = new StringBuffer(rev);
		sb.reverse();
		System.err.println(sb);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		lambda d1 =System.out::println;
//		// we can use the println method to directly print the parameter
//		d1.display("hello");
		
		lambda d2 = lambda::reverse;
		
		d2.display("hello lambda reference");
		
		
		
		
		
		

	}

}
