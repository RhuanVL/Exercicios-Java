package application;

public class OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = {5, 8, 9, 6, 11, -1};
		
		int count = (vetor.length - 1);
		System.out.println("Vetor Inverso: ");
		//loop
		while (count >= 0) {
			System.out.println(vetor[count] + " ");
			count--;
		}
		
		System.out.println("\n---------------------");
		
		System.out.println("Vetor: ");
		for(int elemento : vetor) {
			System.out.println(elemento + " ");
		}
	}

}
