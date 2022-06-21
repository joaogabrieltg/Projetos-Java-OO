package Lista8;
import java.time.LocalDate;

public abstract class Colaboradores extends Sistema{

    public LocalDate entrada;
    public String matricula;
    public double salarioTotal;
    public double salarioBase;

    public Colaboradores(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco, String matricula, double salarioBase, double salarioTotal, LocalDate entrada){
        super(nome, cpf, email, telefone, nascimento, endereco);
        this.entrada = entrada;
        this.matricula = matricula;
        this.salarioTotal = salarioTotal;
        this.salarioBase = salarioBase;
    }

    public LocalDate getEntrada(int ano, int mes, int dia) {
        this.entrada = LocalDate.of(ano, mes, dia);
        return entrada;
    }
    public void setEntrada(int dia, int mes, int ano) {
        this.entrada = getEntrada(ano, mes, dia);
    }//entradas ficam como de costume, ex 10/10/2002

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioTotal(){
        return salarioTotal;
    }
    public void setSalarioTotal(double salarioTotal){
        this.salarioBase = salarioTotal;
    }
}
