package listaUm;
import java.util.Scanner;

public class ListaUm {
	public static void main(String[] args) {
		fibo();
		vacina();
	}
	//questão um
	public static void fibo(){
	
	/*
	 * defição das variáveis utilizadas para o cálculo da sequência
	 *sendo 'b' o primeiro termo, e 'a' o segundo, e 'c' é o termo
	 *que garante a continuidade.
	 *'i' e 'contador' são as variáveis que comandam os loops que
	 *repetem a sequência.
	 */
	float a = 1, b = 0, c = 0;
	float d = 0;
	int i = 0;
	
	System.out.println("Informe um número, este será o contador: ");
    Scanner scan = new Scanner(System.in);
    int contador = scan.nextInt();
	System.out.print("Sua mediana é: ");

    /*
     * Após receber o número do contador, são excluídos os dois primeiros termos,
     * 'b' e 'a', e é iniciado o loop até que 'i' esteja na metade da sequência
     */
    while (i <= (contador-2)/2)
    {
     d = ((b+a)/2);
     c = a + b;
     b = a;
     a = c;
     i++;
    }
    /*
     * Caso o número seja par, são somados os últimos dois termos da sequência anterior,
     * caso seja ímpar, é o resultado é 'c'
     */
    if(contador%2 == 0){
    	System.out.println(d);
    }
    else{
        System.out.println(c);
    }      
}
	
	
	
	
	
	//questão dois
	/*Sintaxe similar a C
	 * Por conta da similaridade de sua sintaxe com a sintaxe
	 * de C, a linguagem apresenta uma fácil adaptação para
	 * quem já programa em C, que é exatamente nosso caso, então
	 * por conta disso eu considero essa característica muito
	 * interessante e positiva.
	 */
	

	
	
	
	//questão três
	
	static boolean vacinado(){
	boolean vacinado;
	Scanner scan = new Scanner(System.in);
	System.out.println("Por favor, digite sua idade:");
	int idade = scan.nextInt();
	System.out.println("Tem alguma comorbidade?(responder com true/false)");
	boolean comorbidade = scan.nextBoolean();
	
	if(idade <= 85 && idade >= 54) {
		vacinado = true;
	}
	else if(idade <= 85 && idade >= (54-8) && comorbidade==true) {
		vacinado = true;
	}
	else {
		vacinado = false;
	}
	return vacinado;
}

	public static void vacina(){
	System.out.println(vacinado());
}
}