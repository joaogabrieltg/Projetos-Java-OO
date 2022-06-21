package Lista5;

public class ClienteInvestidor extends Cliente{

    public ClienteInvestidor(String nome, double ingressoMensal){
        super(nome, ingressoMensal);
    }
    private double salario;
    private double rendimentos;

    public void setRendimentos(double rendimentos){
        this.rendimentos = rendimentos;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getIngressoMensal(){
        double ingressoMensal = (this.salario + this.rendimentos);
        return ingressoMensal;
    }
}
