package sync;

public class main_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sender res= new sender(); // shared resources
		
		User user1 = new User(res, "Aditya" , "hello");
		User user2 = new User(res, "yamini", "hii");
		
		user1.start();
		user2.start();

	}

}
