package listaTres;
import java.util.Scanner;
public class NumpyMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// vetor e vetor default
		Numpy metodo = new Numpy();
		int arr[] = new int[5];
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		arr[3] = 0;
		arr[4] = 0;
		// valor de cada espaco do vetor
		int valor = 0;
		// valor que inicia o loop
		int opcao = 0;

		System.out.println("digite o que deseja.\n" + "caso queira inserir um vetor digite \"1\"\n"
				+ "caso queira ver o último valor do vetor digite \"2\"\n"
				+ "caso queira vizualizar o maior valor digite \"3\"\n"
				+ "caso queira vizualizar a soma dos valores digite \"4\"\n"
				+ "caso queira vizualizar a media digite \"5\"\n"
				+ "mas se já tiver terminado, digite \"6\", este comando se mantem para" + "todo o processo.");
		do {
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("Insira os valores do vetor, lembre-se que sao apenas 5");
				for (valor = 0; valor < 5; valor++) {
					arr[valor] = scan.nextInt();
				}
				System.out.println("digite outro comando para usar esse vetor: [" + arr[0] + " " + arr[1] + " " + arr[2]
						+ " " + arr[3] + " " + arr[4] + "]");

			}
			else if (opcao == 2) {
				System.out.println("O ultimo valor e " + metodo.pop(arr));
				System.out.println("digite outro comando");

			}
			else if (opcao == 3) {
				System.out.println("O maior valor e " + metodo.max(arr));
				System.out.println("digite outro comando");

			}
			else if (opcao == 4) {
				System.out.println("A soma dos valores e " + metodo.sum(arr));
				System.out.println("digite outro comando");

			}
			else if (opcao == 5) {
				System.out.println("A media dos valores e " + metodo.mean(arr));
				System.out.println("digite outro comando");
			}
			else if (opcao == 6) {
				System.out.print("os primos sao: ");
				 metodo.getPrime(arr);
				System.out.println("\ndigite outro comando");
			}
			else if (opcao == 7) {
				System.out.println("selecione a janela e o indice:\ncaso seu indice seja deslocado da string"
						+ "\nos valores \"extras\" serao considerados como 0");
				int window = scan.nextInt();
				int index = scan.nextInt();
				System.out.printf("A media dos valores selecionados e: %.2f",metodo.generateMean(arr, window, index));
				System.out.println("\ndigite outro comando");
			}
			else if (opcao == 8) {
				//nada :)
			}
			else {
				System.out.println("comando invalido, tente novamente");
			}
		} while (opcao != 8);
		System.out.println("processo finalizado.");
		scan.close();
	}
}