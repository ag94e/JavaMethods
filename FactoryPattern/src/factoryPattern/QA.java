package factoryPattern;

public class QA implements User {
	
	private String info;
	private String mod;
	private String name;
	
	public QA() {
		this.name = "Nancy Alcorta";
		this.mod = "Authorization level 1";
		this.info = "Hello this is the QA " + this.name + " and she has an " + this.mod;
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.info);
	}
	
}