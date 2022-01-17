package factoryPattern;

public class ERS implements User {
	
	private String info;
	private String mod;
	private String name;
	
	public ERS() {
		this.name = "Luis Altamira";
		this.mod = "Authorization level 1";
		this.info = "Hello this is the ERS " + this.name + " and he has an " + this.mod;
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.info);
	}
	
}