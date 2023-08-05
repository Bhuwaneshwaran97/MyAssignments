package org.systemWeek3Day1;

public class Desktop extends Computer {
	
	public void DesktopSize() {
		
		System.out.println("The Desktop size is 14 inches");
	}

	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		dk.computerModel();
		dk.DesktopSize();

	}

}

	