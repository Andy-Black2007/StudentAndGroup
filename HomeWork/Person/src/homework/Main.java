package homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Group group = new Group("TR-42");
		while (true) {
			System.out.println("������� 1 ����� �������� ��������");
			System.out.println("������� 2 ����� ������� ��������");
			System.out.println("������� 3 ����� ����� ��������");
			System.out.println("������� 4 ����� ������� ������ ������");
			Scanner scWay = new Scanner(System.in);
			int way = scWay.nextInt();
			if (way == 1) {
				Scanner name = new Scanner(System.in);
				Student student = new Student();
				System.out.println("������� ��� ��������:");
				student.setName(name.nextLine());
				System.out.println("������� ������� ��������:");
				student.setSecondName(name.nextLine());
				System.out.println("������� ������� ��������:");
				student.setAge(name.nextInt());
				group.addStudent(student);
				
			} else if (way == 2) {
				Scanner secondName = new Scanner(System.in);
				System.out.println("������� ������� ��������:");
				group.deleteStudent(secondName.nextLine());
			} else if (way == 3) {
				Scanner secondName = new Scanner(System.in);
				System.out.println("������� ������� ��������:");
				System.out.println(group.findStudent(secondName.nextLine()));
			} else if (way == 4) {
				System.out.println(group.toString());
			} else {
				break;
			}
		}
	}

}
