package third_java;
import java.util.Scanner;
public class third_1_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("my name is goyal");
//     Scanner me = new Scanner(System.in);
//     System.out.println("enter the first number : ");
//     int num1 = me.nextInt();
//     System.out.println("enter the second number : ");
//     int num2 = me.nextInt();
//     
//     int sum=num1+num2;
//     
//     string message = greet();
//     System.out.println(message);
     
     String personalised = mygreet();
     System.out.println(personalised);
     
     //return 0;
     // access modifier
    // int ans = sum2(a:20, b:30);
     
     
	}
	
	static int  sum()
	{
		 Scanner me = new Scanner(System.in);
	     System.out.println("enter the first number : ");
	     int num1 = me.nextInt();
	     System.out.println("enter the second number : ");
	     int num2 = me.nextInt();
	     
	     int sum=num1+num2;
	     
	     System.out.println("the sum is : "+ sum);
	     return sum;
	}
	
	static String greet()
    {
		String greeting="how are you";
		return greeting;
	}
	
	static String mygreet()
	{
		String message = "hello name";
		return message;
	}
	
	

}
