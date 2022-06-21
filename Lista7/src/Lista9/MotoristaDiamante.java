package Lista9;
import java.time.LocalDate;

public class MotoristaDiamante extends Motorista{

    public MotoristaDiamante(String nome, String cpf, String cnh, LocalDate dataDeNascimento, LocalDate dataDeEntrada, Veiculo veiculoCadastrado, boolean vinculoEmpresarial) {
        super(nome, cpf, cnh, dataDeNascimento, dataDeEntrada, veiculoCadastrado, vinculoEmpresarial);
    }

    @Override
    public double calcularRepasse(double valorDaCorrida) {
        return (valorDaCorrida * 0.4);
    }
}