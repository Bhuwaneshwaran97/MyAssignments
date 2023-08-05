package week3day1_assignments;

public class Student {
	
	public String getStudentInfo(String a) {
		
		System.out.println("The Value is "+ a);
		return a;
		
	}
	
	public int getStudentInfo(int b) {
		
		System.out.println("The value is "+ b);
		return b;
	}

	public static void main(String[] args) {
		
		Student info = new Student();
		info.getStudentInfo("ID is CS5667");
		info.getStudentInfo("8807442774");
		info.getStudentInfo("bhuvanvasu@gmail.com");

	}

}
