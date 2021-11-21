package homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Group group = new Group("TR-42");
		while (true) {
			System.out.println("¬ведите 1 чтобы добавить студента");
			System.out.println("¬ведите 2 чтобы удалить студента");
			System.out.println("¬ведите 3 чтобы найти студента");
			System.out.println("¬ведите 4 чтобы вывести список группы");
			Scanner scWay = new Scanner(System.in);
			int way = scWay.nextInt();
			if (way == 1) {
				Scanner name = new Scanner(System.in);
				Student student = new Student();
				System.out.println("¬ведите им€ студента:");
				student.setName(name.nextLine());
				System.out.println("¬ведите фамилию студента:");
				student.setSecondName(name.nextLine());
				System.out.println("¬ведите возраст студента:");
				student.setAge(name.nextInt());
				group.addStudent(student);
				
			} else if (way == 2) {
				Scanner secondName = new Scanner(System.in);
				System.out.println("¬ведите фамилию студента:");
				group.deleteStudent(secondName.nextLine());
			} else if (way == 3) {
				Scanner secondName = new Scanner(System.in);
				System.out.println("¬ведите фамилию студента:");
				System.out.println(group.findStudent(secondName.nextLine()));
			} else if (way == 4) {
				System.out.println(group.toString());
			} else {
				break;
			}
		}
	}

}
