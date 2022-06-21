package Lista4;

import java.util.Scanner;

public class Lista4Numpy {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // vetor e vetor default
    Numpy metodo = new Numpy();
    int[] arr = new int[5];
    arr[0] = 0;
    arr[1] = 0;
    arr[2] = 0;
    arr[3] = 0;
    arr[4] = 0;
    // valor de cada espaco do vetor
    int valor;
    // valor que inicia o loop
    int opcao;

    System.out.println("""
            digite o que deseja.
            caso queira inserir um vetor digite "1"
            caso queira ver o último valor do vetor digite "2"
            caso queira vizualizar o maior valor digite "3"
            caso queira vizualizar a soma dos valores digite "4"
            caso queira vizualizar a media digite "5"
            getprime "6"
            generateMean "7"
            capitalize "8"
            split "9"
            getUniques "10"
            mas se já tiver terminado, digite "11", este comando se mantem paratodo o processo.""");
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
            System.out.println("""
                    selecione a janela e o indice:
                    caso seu indice seja deslocado da string
                    os valores "extras" serao nconsiderados como 0""");
            int window = scan.nextInt();
            int index = scan.nextInt();
            System.out.printf("A media dos valores selecionados e: %.2f",metodo.generateMean(arr, window, index));
            System.out.println("\ndigite outro comando");
        }
        else if (opcao == 8) {
            System.out.println("selecionada a opcao captalize");
            String string = "se maome nao vai a montanha e tal e tal e tal";
            System.out.println(metodo.capitalize(string));
            System.out.println("\ndigite outro comando");
        }
        else if (opcao == 9) {
            System.out.println("selecionada a opcao split");
            String string = "se maome nao vai a montanha e tal e tal e tal";
            String split = "e";
            metodo.split(string, split);
            System.out.println("\ndigite outro comando");
        }
        else if (opcao == 10) {
            System.out.println("selecionada a opcao getUniques");
            String[] strings= {"java", "Java", "JAVA", "Lista", "Java"};
            metodo.getUniques(strings);
            System.out.println("\ndigite outro comando");
        }
        else if (opcao == 11) {
            //nada :)
        }
        else {
            System.out.println("comando invalido, tente novamente");
        }
    } while (opcao != 11);
    System.out.println("processo finalizado.");
    scan.close();
}
}
