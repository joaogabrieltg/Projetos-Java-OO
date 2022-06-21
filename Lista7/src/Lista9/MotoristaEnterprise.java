package Lista9;
import java.time.LocalDate;

public class MotoristaEnterprise extends Motorista{

    private int passageiros;

    public MotoristaEnterprise(String nome, String cpf, String cnh, LocalDate dataDeNascimento, LocalDate dataDeEntrada, Veiculo veiculoCadastrado, int passageiros, boolean vinculoEmpresarial) {
        super(nome, cpf, cnh, dataDeNascimento, dataDeEntrada, veiculoCadastrado, true);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public double calcularRepasse(double valorDaCorrida) {
        return ((valorDaCorrida * 0.15)+(this.passageiros * 5));
    }
}
