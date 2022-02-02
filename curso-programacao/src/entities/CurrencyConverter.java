package entities;

public class CurrencyConverter {

	public static double IOF = 6.0;
	public double cotation;
	public double dolar;
	
	public double calcCotation(){
		return cotation * dolar - IOF;
	}
}