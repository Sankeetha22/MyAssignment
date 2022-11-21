package week3.day1;



public class AxisBank extends BankInfo {

	//Assignment 3
	public void deposit()
	{
	System.out.println("Deposit should be atleast 3 years");

	}
	public static void main(String[] args) {
		
		AxisBank bk = new AxisBank();
		bk.deposit();
		bk.saving();
		bk.fixed();
	}
}
