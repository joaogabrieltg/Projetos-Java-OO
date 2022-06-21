package Lista8;
import java.time.LocalDate;

public class Funcionario extends Colaboradores {

    private double comissao;
    public Gerente gerente;

    public Funcionario(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco, String matricula, double salarioBase, LocalDate entrada, Gerente gerente){
        super(nome, cpf, email, telefone, nascimento, endereco, matricula, salarioBase, salarioBase, entrada);
        this.matricula = matricula;
        this.entrada = entrada;
        this.salarioBase = salarioBase;
    }

    public Gerente getGerente(){
        return gerente;
    }
    public void setGerente(Gerente gerente){
        this.gerente = gerente;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
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
        salarioTotal = ((getSalarioBase() + getComissao()) * 0.975);
        return salarioTotal;
    }
    @Override
    public void setSalarioTotal(double salarioBase) {
        this.salarioTotal = getSalarioTotal();
    }
}
