package OOPs;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student(); // object creation //Student is data type

		student1.s_id = 1000;
		student1.s_name = "Sadia";
		student1.s_grade = 'A';
		student1.printStudentsData();
		
		String s = new String("Welcome");
		s.length();
		s.replace("W", "X");
		
		
		Employee emp1 = new Employee();
		emp1.e_id =4679;
		emp1.e_name="Aniqa";
		emp1.s_dept="Finance";
		emp1.salary=130000;
		
		emp1.display();

	}

}
