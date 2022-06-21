package Lista6;
import java.time.LocalDate;

public class Colaboradores extends Sistema{

    public LocalDate entrada;
    public String matricula;

    public Colaboradores(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco){
        super(nome, cpf, email, telefone, nascimento, endereco);
        this.entrada = entrada;
        this.matricula = matricula;
    }
    public Colaboradores(String nome) {
        super(nome);
    }

    public LocalDate getEntrada(int ano, int mes, int dia) {
        this.entrada = LocalDate.of(ano, mes, dia);
        return entrada;
    }
    public void setEntrada(int dia, int mes, int ano) {
        this.entrada = getEntrada(ano, mes, dia);
    }//entradas ficam como de costume, ex 10/10/2002
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
