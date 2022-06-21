package Lista6;
import java.time.LocalDate;

public class Funcionario extends Colaboradores {

    public String nomeGerente;
    private float comissao;
    private float salario;

    public Funcionario(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco) {
        super(nome, cpf, email, telefone, nascimento, endereco);
        this.matricula = matricula;
        this.entrada = entrada;
        this.comissao = comissao;
        this.salario = salario;
        this.nomeGerente = nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
    public void getComissao() {
        Gerente gerente = new Gerente(nomeGerente);
        if(gerente.darComissao = true) {
            this.comissao = gerente.getValorComissao();
        }
    }
    public float getSalario(float salario, float comissao){
        if(comissao > 0){
            this.salario = salario + comissao;
        }
        else{
            this.salario = salario;
        }
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
