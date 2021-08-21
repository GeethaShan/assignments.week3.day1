package assignments.week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Method from Student Class : Student name is Dhanvanth");
	}
	public void studentDept() {
		System.out.println("Method from Student Class : Student Department is Aeronautics");
	}
	public void studentId() {
		System.out.println("Method from Student Class : Student ID is ST1234");
	}
	
	public static void main(String[] args) {
		Student studentobj = new Student();
		studentobj.collegeName();
		studentobj.collegeCode();
		studentobj.collegeRank();
		studentobj.deptName();
		studentobj.studentName();
		studentobj.studentId();
		studentobj.studentDept();
	}

}
