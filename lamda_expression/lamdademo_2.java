package lamda_expression;

@FunctionalInterface
interface lambda_1
{
	//public void display(String str);
	public int sum(int a, int b);
	
}

public class lamdademo_2 {

	public static void main(String[] args) {
		// we are passing the parameter in the lambda expression
//		lambda_1 m2=(str) ->{ System.out.println(str); };
//		m2.display("goyal");
		
//		lambda_1 m2=(a,b) ->{ return a+b; };
		// we can also write in place of above statement
		lambda_1 m2=(a,b) -> a+b; 

		System.out.println("sum is : "+m2.sum(3, 5));
		
		
		
		

}
}
