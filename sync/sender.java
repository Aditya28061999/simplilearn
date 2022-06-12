package sync;

public class sender {
	
	public void send_message(String name, String message)
	{
		System.out.println(name + " is ending message : " + message);
		try()
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name + "message sent successfully");
	}

}
