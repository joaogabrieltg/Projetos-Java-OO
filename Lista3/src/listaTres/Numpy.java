package listaTres;

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

	public int[] getPrime(int[] arr) {
		boolean prime;
		int getPrime[] = new int[5];

		System.out.print("[ ");
		for (valor = 0; valor < 5; valor++) {
			prime = true;
			if (arr[valor] == 0 || arr[valor] == 1) {
				prime = false;
			} else {
				for (int divisor = 2; divisor <= (arr[valor] / 2); divisor++) {
					if (arr[valor] % divisor == 0) {
						prime = false;
					}
				}
			}
			if (prime == true) {
				System.out.print(arr[valor] + " ");
			}
		}
		System.out.print("]");
		return getPrime;
	}

	public float generateMean(int[] arr, int window, int index) {
		float mean = 0;
		float sum = 0;
		if (window <= 5 && window > 0 && index <= 5 && index >= 0) {
			for (int loop = index; loop < window + index; loop++) {
				sum = sum + arr[loop];
			}
			mean = sum / window;
		} else {
			mean = 0;
		}
		return (mean);
	}

	int valor;
}