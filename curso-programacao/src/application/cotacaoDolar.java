package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class cotacaoDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cot = new CurrencyConverter();
	
		System.out.println("What is the dollar price? ");
		cot.cotation = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		cot.dolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f%n", cot.calcCotation());
	}

}
