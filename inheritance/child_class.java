package inheritance;

public class child_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		box b = new box(4);
		
		System.out.println("l="+b.l+" b="+b.b+ " h="+b.h);

	}
	
	public class box
	{
		double h;
		double l;
		double b;
		
		box(double l , double h , double b)
		{
			this.l=l;
			this.b=b;
			this.h=h;
		}
		box()
		{
			this.l=-1;
			this.b=-1;
			this.h=-1;
		}
		
		// cube
		box(double side)
		{
			this.l=side;
			this.b=side;
			this.h=side;
		}
		
		
		
	}
	
//	class human extends species
//	{
//		int weight;
//	}

}
