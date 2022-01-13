package genericsJava;

/*
 * With this class shows all the structure done before with the new Student giving the
 * attributes as a string to call later the showData method in the abstract class
 * and the sayHello method override in the NewStudent Class.
 */


public class showData {

	public static void main(String[] args) {
		NewStudent obj = new NewStudent(
				"A321",
				"antonio@gmail.com",
				"Antonio",
				"Guerrero",
				"Welcome everybody");
		
		obj.showData();
		obj.sayHello();

	}

}
