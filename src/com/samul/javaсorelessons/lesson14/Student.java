package com.samul.javaсorelessons.lesson14;

import java.util.Random;

public class Student {
	private String lastName;
	private String firstName;
	private String midName;

	private String groupNumber;

	private int[] marks;

	public Student(String lastName, String firstName, String midName, String groupNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.midName = midName;
		this.groupNumber = groupNumber;
		this.marks = new int[5];

		setMarksByRandom();
	}

	public Student(String lastName, String firstName, String midName, String groupNumber, int[] marks) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.midName = midName;
		this.groupNumber = groupNumber;
		this.marks = new int[5];

		setMarks(marks);
	}

	private void setMarksByRandom() {
		Random rnd = new Random();

		for (int i = 0; i < this.marks.length; i++) {
			this.marks[i] = rnd.nextInt(10);
		}

	}

	public void setMarks(int[] param) {

		checkMarks(param);

		for (int i = 0; i < param.length; i++) {
			this.marks[i] = param[i];
		}

	}

	private void checkMarks(int[] param) {

		if (param.length != 5) {
			throw new RuntimeException("Массив оценок должен быть длиной 5!");
		}

		for (int i = 0; i < param.length; i++) {
			if (param[i] < 0 || param[i] > 10) {
				throw new RuntimeException("Оценка находится за пределами допустимого диапазона (0..10)!");
			}
		}

	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public boolean isBest() {
		boolean result = true;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 9) {
				result = false;
				break;
			}
		}

		return result;
	}

	public void print() {

		System.out.print(lastName + " " + firstName + " " + midName + ", Группа: " + groupNumber + " : Оценки: ");

		for (int i = 0; i < this.marks.length; i++) {
			System.out.print(this.marks[i] + " ");
		}

		System.out.println();
	}

}
