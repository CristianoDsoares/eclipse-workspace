package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();

		System.out.print("How Many Employee will be registered?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			
			System.out.println();
			
			System.out.println("Employee # " + (i + 1) + ":");

			System.out.print("Id: ");

			Integer id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();// para limpar o Bumfer
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Employee emp = new Employee (id, name, salary);
			
			list.add(emp);

		}
		
		////////////////Segunda Parte Do Exercicio ////////////
		
		System.out.print("Enter Employee id that Will have a salary increase: ");
		int 

		sc.close();

	}
	
	public Integer hasId(List <Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
			
		}
	}

}
