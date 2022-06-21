package Lista8;
import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Sistema{

    private int idade;
    String tipoCliente;
    Compra compra;
    double valorTotal;
    double valorBase;
    String tipoPagamento;

    public Cliente(String nome, String cpf, String email, String telefone, LocalDate nascimento, String endereco) {
        super(nome, cpf, email, telefone, nascimento, endereco);
    }

    public Compra getCompra(){
        return compra;
    }
    public void setCompra(Compra compra){
        this.compra = compra;
        this.valorBase += compra.getValorBase();
    }

    public double getValorBase(){
        return valorBase;
    }

    public int getIdade (){
        this.idade = Period.between(nascimento, LocalDate.now()).getYears();
        return idade;
    }

    public String getTipoCliente(){
        int idade = getIdade();
        if(idade < 60 && getValorBase() >= 500){
            tipoCliente = "silver";
        }
        else if(idade >= 60 && getValorBase() <= 500){
            tipoCliente = "light";
        }
        else if(idade >= 60 && getValorBase() >= 500){
            tipoCliente = "plus";
        }
        else {
            tipoCliente = "normal";
        }
        return tipoCliente;
    }

    public void setTipoPagamento(String tipoDePagamento){
        this.tipoPagamento = tipoDePagamento;
    }
    public String getTipoPagamento(){
        return tipoPagamento;
    }

    public double getValorTotal(){
        valorTotal = compra.getValorCompra();
        return valorTotal;
    }
}
