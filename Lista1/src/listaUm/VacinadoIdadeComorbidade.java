package listaUm;

import java.util.Scanner;

public class VacinadoIdadeComorbidade {
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

public static void main(String[] args){
	System.out.println(vacinado());
}
}
