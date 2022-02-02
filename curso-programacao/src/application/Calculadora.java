package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER RADIUS: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("CIRCUNFERENCE: %.2f%n", c);
		System.out.printf("VOLUME: %.2f%n", v);
		System.out.printf("PI VALUE: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}
