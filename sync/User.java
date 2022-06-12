package sync;

public class User extends Thread{
	
	private String name;
	private String message;
	public sender res;
	
	public User(sender res, String name , String message)
	{
		this.name=name;
		this.message=message;
		this.res=res;
	}
	
	public void run()
	{
		synchronized(res)
		{
			res.send_message(name , message);
		}
	}
	

}
