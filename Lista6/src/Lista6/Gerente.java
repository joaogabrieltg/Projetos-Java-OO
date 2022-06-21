package Lista6;
import java.time.LocalDate;

public class Gerente extends Colaboradores{

    public boolean darComissao;
    public float valorComissao;

    public Gerente(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco) {
        super(nome, cpf, email, telefone, nascimento, endereco);
        this.matricula = matricula;
        this.entrada = entrada;
    }
    public Gerente(String nome) {
        super(nome);
    }

    public boolean isDarComissao() {
        return darComissao;
    }
    public void setDarComissao(boolean darComissao) {
        this.darComissao = darComissao;
    }
    public float getValorComissao() {
        return valorComissao;
    }
    public void setValorComissao(float valorComissao) {
        this.valorComissao = valorComissao;
    }
}
