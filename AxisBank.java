package assignments.week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Method from AxisBank : Deposit amount 40000 rs");

	}
	
	public static void main(String[] args) {
		AxisBank axisObj = new AxisBank();
		axisObj.saving();
		axisObj.fixed();
		axisObj.deposit();
	}

}
