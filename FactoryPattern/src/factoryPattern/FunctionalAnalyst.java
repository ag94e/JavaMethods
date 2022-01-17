package factoryPattern;

public class FunctionalAnalyst implements User {
	
	private String info;
	private String mod;
	private String name;
	
	public FunctionalAnalyst() {
		this.name = "Jenny Prist";
		this.mod = "Authorization level 2";
		this.info = "Hello this is the FunctionalAnalyst " + this.name + " and she has an " + this.mod;
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.info);
	}
	
}