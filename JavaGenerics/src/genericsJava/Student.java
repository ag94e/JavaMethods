/*
 * With this abstract class shows how to encapsulate with the keyword private.
 * 
 */

package genericsJava;

public abstract class Student {

		private String studentNumber;
		private String email;
		public String firstName;
		public String lastName;
		
		public Student(String SN, String EM, String FN, String LN) {
			this.studentNumber = SN;
			this.email = EM;
			this.firstName = FN;
			this.lastName = LN;
		}
		
		public String getStudentNumber() {
			return studentNumber;
		}
		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void showData() {
			System.out.println("Student Number: "+ studentNumber);
			System.out.println("Student Email: "+ email);
			System.out.println("Student First Name: "+ firstName);
			System.out.println("Student Last Name: "+ lastName);
			
		}
		
		public abstract void sayHello();

}
