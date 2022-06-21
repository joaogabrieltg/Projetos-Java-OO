package Lista6;
import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Sistema{

    private float desconto;
    private int idade;

    public Cliente(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco) {
        super(nome, cpf, email, telefone, nascimento, endereco);
        this.desconto = desconto;
        this.idade = idade;
    }

    public int getIdade (LocalDate nascimento){
        this.idade = Period.between(nascimento, LocalDate.now()).getYears();
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = getIdade(nascimento);
    }
    public float getDesconto(int idade) {
        float porcentagem = (float) getIdade(nascimento);
        this.desconto = 1-(porcentagem/100);
        return desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = getDesconto(idade);
    }
}
