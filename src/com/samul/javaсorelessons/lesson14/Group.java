package com.samul.javaсorelessons.lesson14;

public class Group {

	private String number;
	private Student[] students = new Student[5];

	public Group(String number, Student[] students) {
		this.number = number;
		this.students = students;
	}
	

	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public Student[] getStudents() {
		return students;
	}



	public void setStudents(Student[] students) {
		this.students = students;
	}



	public void printGroup() {
		
		System.out.println("\nГруппа: " + this.number);
		
		for (int i = 0; i < students.length; i++) {
			System.out.print((i+1) + ". ");
			students[i].print();
		}

	}

	public void printBestStudents() {
		
		System.out.println("\nЛучшие студенты в группе " + this.number + ": ");
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].isBest()) {
				students[i].print();
			}
		}

	}

}
