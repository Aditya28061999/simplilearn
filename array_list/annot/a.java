package annot;

public class a {
	// nested interface
	public interface nested_interface
	{
		boolean isodd(int num);
	}

}

class B implements a.nested_interface
{
	@Override
	public boolean isodd(int num)
	{
		return (num & 1)==1;
	}
}
