package lista2;

import java.util.Scanner;

public class ListaDois {
	public static void main(String[] args) {
//quest�o 1
		Scanner scan = new Scanner(System.in);
		System.out.println("digite 'public', 'static', 'void', que esta palavra chave ser� explicada:");
		String option = scan.next();
		explicadoMain(option);

		/*
		 * Quest�o 2
		 * 
		 * Haver� erro na saida e n�o imprimir� nada, entretanto esse erro pode ser
		 * corrigido ao criar o m�todo public static void main(String[] args) e ser�
		 * impresso y = 1, mas continua errado. Para corrigir � necess�rio transformar
		 * "Calculadora.incrementarEDobrar(y);" em "calc.incrementarEDobrar(y);" e
		 * coloc�-lo no println no lugar de y, fica: "System.out.println("y =
		 * " + calc.incrementarEDobrar(y));". O resultado deve ser "y = 4".
		 */
	}

//quest�o 1

	public static void explicadoMain(String option) {

		if(option.equals("public")){
			System.out.printf("Define se o m�todo pode ser acessado por outras classes mesmo fora do projeto.\n"
					+ "Com esse modificador, pode ser acessado por qualquer classe.");
		}
		else if(option.equals("static")){
			System.out.printf("Ao definir um m�todo como est�tico voc� o associa a uma classe, fazendo com que\n"
					+ "n�o seja necess�rio criar um objeto da classe.");
		}
		else if(option.equals("void")){
			System.out.printf("Void � um tipo de retorno. Ao definir um m�todo como void, voc� faz com que o\n"
					+ "m�todo n�o retorne nada");
		}
		else{
			System.out.println("esta op��o n�o est� dispon�vel.");
		}
	}
}
