package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Empregado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Entre com o nome do funcionário: ");
		employee.name = scan.nextLine();
		
		System.out.println("Entre com o salário bruto: ");
		employee.grossSalary = scan.nextDouble();
		
		System.out.println("Entre com a taxa: ");
		employee.tax = scan.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		scan.close();
	}

}
