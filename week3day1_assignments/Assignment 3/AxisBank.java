package week3day1_assignments;

public class AxisBank extends BankInfo {
	
	public void deposits() {
		System.out.println("Your deposits are encrypted using block chain method.");
	}

	public static void main(String[] args) {
		
		AxisBank axbank = new AxisBank();
		axbank.deposits();

	}

}
