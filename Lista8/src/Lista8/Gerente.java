package Lista8;
import java.time.LocalDate;
import java.time.Period;

public class Gerente extends Colaboradores{

    public double valorComissao;
    public int anosDeServico;

    public Gerente(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco, String matricula, double salarioBase, LocalDate entrada){
        super(nome, cpf, email, telefone, nascimento, endereco, matricula, salarioBase, salarioBase, entrada);
        this.matricula = matricula;
        this.entrada = entrada;
        this.salarioBase = salarioBase;
    }

    public int getAnosDeServico (){
        this.anosDeServico = Period.between(entrada, LocalDate.now()).getYears();
        return anosDeServico;
    }

    public double getValorComissao() {
        return valorComissao;
    }
    public void setValorComissao(float valorComissao, Funcionario funcionario) {
        this.valorComissao += valorComissao;
        funcionario.setComissao(this.valorComissao);
    }

    @Override
    public double getSalarioBase(){
        return salarioBase;
    }
    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double getSalarioTotal(){
        double bonus;
        this.anosDeServico = getAnosDeServico();
        bonus = (double)anosDeServico*0.03;
        if(bonus >= 0.3){
            bonus = 0.3;
        }
        if(anosDeServico > 0){
            this.salarioTotal = salarioBase*(1 + bonus);
        }
        else{
            this.salarioTotal = salarioBase;
        }
        return salarioTotal;
    }
    @Override
    public void setSalarioTotal(double salarioBase) {
        this.salarioTotal = getSalarioTotal();
    }
}
