package lista2;

public class Numpy {

	public int pop(int[] arr) {
		// visualizar ultimo valor
		return arr[4];
	}

	public int max(int[] arr) {
		// visualizar maior valor
		int maior = 0;
		for (valor = 0; valor < 5; valor++) {
			if (maior < arr[valor]) {
				maior = arr[valor];
			}
		}
		return maior;
	}

	public int sum(int[] arr) {
		// soma dos valores
		return (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
	}

	public double mean(int[] arr) {
		// media dos valores
		Numpy interno = new Numpy();
		double mean;
		double soma = interno.sum(arr);
		mean = soma / 5;
		return mean;
	}

	int valor;
}
