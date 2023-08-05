package week3day1_assignments;

public class Automation extends MultipleLanguage implements Language {
	

	public void java() {
		
		System.out.println("Java from Automation Class");
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby from Automation Class");
		
	}

	public static void main(String[] args) {

		Automation autoVaribale = new Automation();
		autoVaribale.ruby();
		autoVaribale.java();
		autoVaribale.python();

	}


}
