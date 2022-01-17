package factoryPattern;

public class App {

	public static void main(String[] args) {
		UserFactory newUser = new UserFactory();
		
		User user1 = newUser.getNewUser("1");
		user1.getInfo();
		
		User user2 = newUser.getNewUser("2");
		user2.getInfo();
		
		User user3 = newUser.getNewUser("3");
		user3.getInfo();
		
		User user4 = newUser.getNewUser("4");
		user4.getInfo();
		
		User user5 = newUser.getNewUser("5");
		user5.getInfo();
	}

}
