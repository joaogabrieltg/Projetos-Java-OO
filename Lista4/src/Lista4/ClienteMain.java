package Lista4;

import java.util.Arrays;

public class ClienteMain {

    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[100];
        Cliente j = new Cliente ("Jose Antonio",10000);
        j.find(cliente);
        j.getLimiteDeCredito();
        String n = "";
        double i = 0;
        Cliente b = new Cliente(n, i);
        b.add(cliente);
        if(b.add(cliente)){
            System.out.println(Arrays.toString(b.find(cliente)));
        }
        else{
            System.out.println("ai, nada aconteceu");
        }

    }
}
