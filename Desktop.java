package assignments.week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Method from Desktop Class : Desktop size is 12 inches");

	}
	
	public static void main(String[] args) {
		
		Desktop desktopObj = new Desktop();
		desktopObj.computerModel();
		desktopObj.desktopSize();
	}
	
}
