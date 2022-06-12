package third_java;

public class function_overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(a:67);
		fun(name:"goyal");
		

	}
	static void fun(String name)
	{
		System.out.println(name);
	}
	
	static void fun(int a)
	{
		System.out.println(a);
	}
	

}
