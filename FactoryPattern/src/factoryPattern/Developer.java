package factoryPattern;

public class Developer implements User {
	
	private String info;
	private String mod;
	private String name;
	
	public Developer() {
		this.name = "Antonio Guerrero";
		this.mod = "Authorization level 5";
		this.info = "Hello this is the Developer " + this.name + " and he has an " + this.mod;
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.info);
	}
	
}
