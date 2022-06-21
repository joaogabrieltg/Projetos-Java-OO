package Lista5;

public class ClienteEmpreendedor extends Cliente{

    public ClienteEmpreendedor(String nome, double ingressoMensal) {
        super(nome, ingressoMensal);
    }

    double capitalDeGiroMensal;

    public void setCapitalDeGiroMensal(double capitalDeGiroMensal) {
        this.capitalDeGiroMensal = capitalDeGiroMensal;
    }
    public boolean emprestimoEmpresarial(int meses,float valor) {
        boolean emprestimoEmpresarial=true;
        double mensalidade;
        mensalidade = ((valor/meses)*(1.2));
        if (mensalidade > capitalDeGiroMensal){
            emprestimoEmpresarial = false;
        }
        else{
        //nada :)
        }
        return emprestimoEmpresarial;
    }
}
