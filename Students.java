package assignments.week3.day1;

public class Students {
	
	public void getStudentInfo(int ID) {
		System.out.println("Method 1 -> Student ID : "+ID);

	}
	public void getStudentInfo(int ID, String name) {
		System.out.println("Method 2 -> Student ID : "+ID+" , Student Name : "+name);

	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Method 3 -> Email : "+email+" , Phone Num : "+phoneNumber);

	}

	public static void main(String[] args) {
		Students studentobj = new Students();
		studentobj.getStudentInfo(754);
		studentobj.getStudentInfo(754, "Dhanvanth");
		studentobj.getStudentInfo("dhanvanth@gmail.com", 8765476542L);

	}

}
