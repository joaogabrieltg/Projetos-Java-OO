package lista2;

import java.util.Scanner;

public class ListaDois {
	public static void main(String[] args) {
//questão 1
		Scanner scan = new Scanner(System.in);
		System.out.println("digite 'public', 'static', 'void', que esta palavra chave será explicada:");
		String option = scan.next();
		explicadoMain(option);

		/*
		 * Questão 2
		 * 
		 * Haverá erro na saida e não imprimirá nada, entretanto esse erro pode ser
		 * corrigido ao criar o método public static void main(String[] args) e será
		 * impresso y = 1, mas continua errado. Para corrigir é necessário transformar
		 * "Calculadora.incrementarEDobrar(y);" em "calc.incrementarEDobrar(y);" e
		 * colocá-lo no println no lugar de y, fica: "System.out.println("y =
		 * " + calc.incrementarEDobrar(y));". O resultado deve ser "y = 4".
		 */
	}

//questão 1

	public static void explicadoMain(String option) {

		if(option.equals("public")){
			System.out.printf("Define se o método pode ser acessado por outras classes mesmo fora do projeto.\n"
					+ "Com esse modificador, pode ser acessado por qualquer classe.");
		}
		else if(option.equals("static")){
			System.out.printf("Ao definir um método como estático você o associa a uma classe, fazendo com que\n"
					+ "não seja necessário criar um objeto da classe.");
		}
		else if(option.equals("void")){
			System.out.printf("Void é um tipo de retorno. Ao definir um método como void, você faz com que o\n"
					+ "método não retorne nada");
		}
		else{
			System.out.println("esta opção não está disponível.");
		}
	}
}
