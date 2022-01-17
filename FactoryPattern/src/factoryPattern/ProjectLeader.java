package factoryPattern;

public class ProjectLeader implements User {
	
	private String info;
	private String mod;
	private String name;
	
	public ProjectLeader() {
		this.name = "Nancy Alcorta";
		this.mod = "Authorization level 6";
		this.info = "Hello this is the ProjectLeader " + this.name + " and she has an " + this.mod;
	}
	
	@Override
	public void getInfo() {
		System.out.println(this.info);
	}
	
}