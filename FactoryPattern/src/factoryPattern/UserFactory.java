package factoryPattern;

public class UserFactory {

	public User getNewUser(String type) {

		switch (type) {

		case "1":
			return new Developer();
		case "2":
			return new ERS();
		case "3":
			return new FunctionalAnalyst();
		case "4":
			return new ProjectLeader();
		case "5":
			return new QA();

		}
		return new NoUser();
	}
}
