package Lista6;
import java.time.LocalDate;

public class Sistema {

    String nome;
    String cpf;
    String email;
    String telefone;
    LocalDate nascimento;
    String endereco;

    public Sistema(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }
    public Sistema(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getNascimento(int ano, int mes, int dia) {
        this.nascimento = LocalDate.of(ano, mes, dia);
        return nascimento;
    }
    public void setNascimento(int dia, int mes, int ano) {
        this.nascimento = getNascimento(ano, mes, dia);
    }//entradas ficam como de costume, ex 10/10/2002


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}