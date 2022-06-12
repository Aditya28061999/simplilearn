package object_oriented_programming;

public class oops_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student gupta = new  student();
        student sharma = new student();
        
        
//        goyal.rno=13;
//        goyal.marks=88.5f;
//        goyal.name="aditya goyal";
        
        System.out.println(gupta.rno);
        System.out.println(gupta.name);
        System.out.println(gupta.marks);
        
        gupta.changename("aditya gupta");
        gupta.greetings();
        
        student one = new student();
        
        int a=25;
        int b=50;
        
        Integer num=45;
        num.longValue();
        
        // final keyword  (once declared we canot change the value)
        final int  bonus =2;
        bonus = 3;
        
        
        
        
        
        
        
        
        
        
	}
	
	class student
	{
		int rno;
		String name;
		float marks;
		
		
		// create a constructor during the run time they call themselves 
		//automatically
		
		student()
		{
			this.rno=13;
			this.name = "aditya goyal";
			this.marks = 88.5f;
		}
		
		void greeting()
		{
			System.out.println("hello ,  i am "+ this.name);
		}
		
		void changename(String newname)
		{
			this.name = newname;
			System.out.println("new anme is "+ this.name);
		}
		
		// multiple constructor
		student(int rno, String name, float marks)
		{
			this.rno = rno;
			this.name = name;
			this.marks = marks;
		}
		
		student()
		{
			this(rno:45, name:"ashish goyal", marks:90.67f);
		}
	}
	
//	class car
//	{
//		int price;
//		String engine;
//		int seats;
//		
//	}
//	
//	car c1,c2;
//	c1.price=10;
//	c1.engine="electric";
//	c1.seats=6;
	
	

	
	
	

}
