package odevGun3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor =new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demirog";
		instructor.gmail="engin@gmail.com";
		instructor.password="4569";
		
		Student student = new Student();
		student.id=2;
		student.firstName="Alihan";
		student.lastName="Acunsoz";
		student.gmail="alihan@gmail.com";
		student.password="1232";
		
		System.out.println("------------------------");
		StudentManager studentManager =new StudentManager();
		studentManager.login(student);
		studentManager.homework();
		
		System.out.println("------------------------");
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.add();
		
		System.out.println("------------------------");
		
	}

}
