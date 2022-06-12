package org.studyeasy;
import org.studyeasy.phone;
public class onelpus implements mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone mobile = new phone();
		String pp = mobile.processor();
		System.out.println("the number of the processor is : " + pp);

	}
	
	@Override
	public String cpu()
	{
		return "so935";
	}
	
	@Override
	public int spaceint()
	{
		return 0;
	}
	
	@Override
	public String hu()
	{
		return "no os";
	}
	

}
