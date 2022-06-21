package Lista5;

import java.util.Arrays;

public class Lista5 {

    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[100];
        ClienteEmpreendedor j = new ClienteEmpreendedor("Jose Antonio",10000);
        j.setCapitalDeGiroMensal(10000);
        System.out.println(j.emprestimoEmpresarial(1,100));

        ClienteInvestidor k = new ClienteInvestidor("Jose Antonio",0);
        k.setSalario(10000);
        k.setRendimentos(10000);
        System.out.println(k.getIngressoMensal());


    }
}