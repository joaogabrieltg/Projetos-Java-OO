package listaTres;

import java.util.Scanner;

public class ListaTres {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("insira a string:");
		String parameter = scan.nextLine();

		if (parameter.length() > 100) {
			String limite = parameter.substring(0, 100);
			parameter = limite;
			System.out.println("Sua string excedeu o limite de caracteres, apenas os primeiros 100 serao validos");

		}

		System.out.println("insira o caracter:");
		char test = scan.next().charAt(0);

		System.out.print("Sua string e \"" + parameter + "\", seu caracter e \"" + test + "\"");
		System.out.println(countSubstringsChar(parameter, test));
		System.out.println(countSubstringLetter(parameter, test));
		scan.close();
	}

	public static int countSubstringsChar(String parameter, char test) {
		int loop = 0;
		int count = 0;
		int invalidos = 0;

		for (int loopvalido = 0; loopvalido < parameter.length(); loopvalido++) {
			if (caracterValido(parameter.charAt(loopvalido))) {
			} else {
				invalidos++;
			}
		}

		if (invalidos > 0) {
			System.out.print("\nString possui caracter invalido");
			count = -1;
		} else {
			for (loop = 0; loop < parameter.length(); loop++) {
				char caracter = parameter.charAt(loop);
				if (caracter == test) {
					System.out.println("");
					System.out.print(caracter);
					count++;
				}
				if (count > 0 && caracter != test) {
					System.out.print(caracter);
				}

			}
			if (count == 0) {
				System.out.print("\nString nao possui o caracter buscado");
			}
		}
		System.out.println("");
		return count;
	}

	public static int countSubstringLetter(String parameter, char test) {
		int loop = 0;
		int count = 0;
		int invalidos = 0;

		for (int loopvalido = 0; loopvalido < parameter.length(); loopvalido++) {
			if (caracterValido(parameter.charAt(loopvalido))) {
			} else {
				invalidos++;
			}
		}

		String teststring = Character.toString(test);

		if (invalidos > 0) {
			System.out.print("\nString possui caracter invalido");
			count = -1;
		} else {
			for (loop = 0; loop < parameter.length(); loop++) {
				char caracter = parameter.charAt(loop);
				String caracterString = Character.toString(caracter);
				if (caracterString.equalsIgnoreCase(teststring)) {
					System.out.println("");
					System.out.print(caracterString);
					count++;
				}
				if (count > 0 && (caracterString.equalsIgnoreCase(teststring) == false)) {
					System.out.print(caracterString);
				}

			}
			if (count == 0) {
				System.out.print("\nString nao possui o caracter buscado");
			}
		}
		System.out.println("");

		return count;
	}

	public static boolean caracterValido(char test) {
		if ((test >= 'a' && test <= 'z') || (test >= 'A' && test <= 'Z') || (test == 'ç') || (test == 'Ç')) {
			return true;
		} else {
			return false;
		}
	}
}