package genericsJava;

/*
 * With this class shows how to use inheritance, use the info about the abstract class Student
 * and then override one abstract method and this is how we can use polymorphism.
 */

public class NewStudent extends Student {
	
	private String greeting;
	public NewStudent(String SN, String EM, String FN, String LN, String GT) {
		super(SN, EM, FN, LN);
		this.greeting = GT;
	}
	@Override
	public void sayHello() {
		System.out.println("Hello my name is " + this.firstName + " " + this.lastName + " and " + this.greeting);
		
	}
	
}
