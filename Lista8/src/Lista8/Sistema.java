package Lista8;
import java.time.LocalDate;

public abstract class Sistema {

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

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(int dia, int mes, int ano) {
        this.nascimento = LocalDate.of(ano,mes,dia);
    }//entradas ficam como de costume, ex 10/10/2002

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}