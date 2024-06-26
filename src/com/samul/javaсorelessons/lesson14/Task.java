package com.samul.javaсorelessons.lesson14;

public class Task {

	public static void main(String[] args) {

		////////////////////////////////// Группа № 1 ////////////////////////////////////////////

		Student[] std = new Student[5];

		// Инициализируем студенов рандомными оценками
		std[0] = new Student("Иванов", "Иван", "Ильич", "№1");
		std[1] = new Student("Петроф", "Иоанн", "Иванович", "№1");
		std[2] = new Student("Сидорофф", "Илья", "Игнатьевич", "№1");
		std[3] = new Student("Степанов", "Игорь", "Израилович", "№1");
		std[4] = new Student("Абрамов", "Роман", "Аркадьевич", "№1");

		// Добавляем их в группу
		Group grp1 = new Group("№1", std);

		// Двух студентов делаем отличниками
		std[0].setMarks(new int[] { 9, 9, 10, 10, 9 });
		grp1.getStudents()[1].setMarks(new int[] { 10, 10, 10, 10, 10 });

		// Печатаем всю группу
		grp1.printGroup();

		// Печатаем отличников
		grp1.printBestStudents();

		////////////////////////////////// Группа № 2 ////////////////////////////////////////////
		std = new Student[5];
		// Инициализируем студенов конкретными оценками
		std[0] = new Student("Иванович", "Иван", "Ильич", "№2", new int[] { 5, 5, 5, 5, 5 });
		std[1] = new Student("Петрович", "Иоанн", "Иванович", "№2", new int[] { 6, 6, 6, 6, 6 });
		std[2] = new Student("Сидорович", "Илья", "Игнатьевич", "№2", new int[] { 7, 7, 7, 7, 7 });
		std[3] = new Student("Степанович", "Игорь", "Израилович", "№2", new int[] { 9, 10, 9, 9, 9 });
		std[4] = new Student("Абрамович", "Роман", "Аркадьевич", "№2", new int[] { 10, 8, 9, 7, 7 });

		// Добавляем их в группу
		Group grp2 = new Group("№2", std);

		// Печатаем всю группу
		grp2.printGroup();

		// Печатаем отличников
		grp2.printBestStudents();
		
		// ну и просто печатаем на мой взгляд лучшего студента в группе №1
		System.out.println("\nПросто хороший человек: ");
		grp1.getStudents()[4].print();

	}

}
