package listaUm;
import java.util.Scanner;

public class ListaUm {
	public static void main(String[] args) {
		fibo();
		vacina();
	}
	//quest�o um
	public static void fibo(){
	
	/*
	 * defi��o das vari�veis utilizadas para o c�lculo da sequ�ncia
	 *sendo 'b' o primeiro termo, e 'a' o segundo, e 'c' � o termo
	 *que garante a continuidade.
	 *'i' e 'contador' s�o as vari�veis que comandam os loops que
	 *repetem a sequ�ncia.
	 */
	float a = 1, b = 0, c = 0;
	float d = 0;
	int i = 0;
	
	System.out.println("Informe um n�mero, este ser� o contador: ");
    Scanner scan = new Scanner(System.in);
    int contador = scan.nextInt();
	System.out.print("Sua mediana �: ");

    /*
     * Ap�s receber o n�mero do contador, s�o exclu�dos os dois primeiros termos,
     * 'b' e 'a', e � iniciado o loop at� que 'i' esteja na metade da sequ�ncia
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
     * Caso o n�mero seja par, s�o somados os �ltimos dois termos da sequ�ncia anterior,
     * caso seja �mpar, � o resultado � 'c'
     */
    if(contador%2 == 0){
    	System.out.println(d);
    }
    else{
        System.out.println(c);
    }      
}
	
	
	
	
	
	//quest�o dois
	/*Sintaxe similar a C
	 * Por conta da similaridade de sua sintaxe com a sintaxe
	 * de C, a linguagem apresenta uma f�cil adapta��o para
	 * quem j� programa em C, que � exatamente nosso caso, ent�o
	 * por conta disso eu considero essa caracter�stica muito
	 * interessante e positiva.
	 */
	

	
	
	
	//quest�o tr�s
	
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