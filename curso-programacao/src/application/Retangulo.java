package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the width: ");
		rectangle.width = ler.nextDouble();
		System.out.println("Enter the height: ");
		rectangle.height = ler.nextDouble();

		System.out.printf("Rectangle area: %.2f%n", rectangle.Area());
		System.out.printf("Rectangle Perimeter: %.2f%n", rectangle.Perimeter());
		System.out.printf("Rectangle Diagonal: %.2f%n", rectangle.Diagonal());
		
		ler.close();
	}

}