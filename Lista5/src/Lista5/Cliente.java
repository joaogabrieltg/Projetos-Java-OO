package Lista5;
import java.util.Scanner;
public class Cliente {

    private double limiteDeCredito;
    private String nome;
    private double ingressoMensal;
    Scanner scan = new Scanner(System.in);
    public Object[] Cliente;

    public Cliente(String nome, double ingressoMensal){
        this.nome = nome;
        this.ingressoMensal=ingressoMensal;
        this.limiteDeCredito = this.ingressoMensal + (0.4*this.ingressoMensal);
    }


    public boolean add(Cliente[] clientes){
        for(int i=0; i<=1; i++) {
            nome = scan.nextLine();
            ingressoMensal = scan.nextInt();
            Cliente [i] = new Cliente(nome,ingressoMensal);
        }
        return false;
    }

    public Cliente[] find(Cliente[] cliente) {
        System.out.println(nome + ", "+ ingressoMensal + ", " + getLimiteDeCredito());
        return cliente;
    }


    public String setNome(String nome) {
        System.out.println(nome);
        return nome;
    }

    public double setIngressoMensal(double ingressoMensal) {
        System.out.println(ingressoMensal);
        return this.ingressoMensal;
    }

    public double getLimiteDeCredito() {
        limiteDeCredito = (this.ingressoMensal + this.ingressoMensal*0.4);
        System.out.println(limiteDeCredito);
        return this.limiteDeCredito;
    }
}