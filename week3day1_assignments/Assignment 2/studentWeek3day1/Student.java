package org.studentWeek3day1;

import org.departmentWeek3day1.*;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("The Student name is Bhuvan");
	}
	
	public void studentDepart() {
		System.out.println("The Student studies in Computer Department");
	}
	
	public void studentID() {
		System.out.println("The Student's ID is CD007");
	}

	public static void main(String[] args) {
		
		Student stt = new Student();
		stt.collegeCode();
		stt.collegeName();
		stt.collegeRank();
		stt.departmentName();
		stt.studentName();
		stt.studentDepart();
		stt.studentID();
		

	}

}
