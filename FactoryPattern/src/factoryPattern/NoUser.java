package factoryPattern;

public class NoUser implements User {
	
	@Override
	public void getInfo() {
		System.out.println("There is no info for this number");
	}
	
}