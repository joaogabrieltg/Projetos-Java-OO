package Lista9;
import java.time.LocalDate;
import java.time.Period;

public class Motorista {

    private String nome;
    private String cpf;
    private String cnh;
    private LocalDate dataDeNascimento;
    private LocalDate dataDeEntrada;
    private Veiculo veiculoCadastrado;
    private boolean vinculoEmpresarial = false;

    public Motorista(String nome, String cpf, String cnh, LocalDate dataDeNascimento, LocalDate dataDeEntrada, Veiculo veiculoCadastrado, boolean vinculoEmpresarial) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeEntrada = dataDeEntrada;
        this.veiculoCadastrado = veiculoCadastrado;
        this.vinculoEmpresarial = vinculoEmpresarial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        try{
            for(int i=0; i < cpf.length(); i++){
                if(cpf.length() == 11 && (cpf.charAt(i) >= 48 && cpf.charAt(i) <= 57)){
                    //nn e erro
                }
                else{
                    throw new cpfInvalidoException();
                }
            }
        }catch (cpfInvalidoException erro){
            System.out.println(erro.getMessage());
        }
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade(){
        int idade = Period.between(getDataDeNascimento(), LocalDate.now()).getYears();
        try {
            if(idade < 18){
                throw new motoristaMenorDeIdadeException();
            }
        }catch (motoristaMenorDeIdadeException erro){
            System.out.println(erro.getMessage());
        }
        return idade;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Veiculo getVeiculoCadastrado() {
        return veiculoCadastrado;
    }

    public void setVeiculoCadastrado(Veiculo veiculoCadastrado) {
        this.veiculoCadastrado = veiculoCadastrado;
    }

    public boolean isVinculoEmpresarial() {
        return vinculoEmpresarial;
    }

    public void setVinculoEmpresarial(boolean vinculoEmpresarial) {
        this.vinculoEmpresarial = vinculoEmpresarial;
    }

    public double calcularRepasse(double valorDaCorrida) {
        return (valorDaCorrida * 0.2);
    }

    public void printarCaracteristicas(){
        String vinculo;
        if (isVinculoEmpresarial()){
            vinculo = "Sim";
        }
        else{
            vinculo = "Nao";
        }
        System.out.println("\nnome: "+getNome() +
                "\ncpf: "+cpf+
                "\ncnh: "+getCnh()+
                "\ndata de nascimento: "+getDataDeNascimento()+
                "\ndata de entrada: "+getDataDeEntrada()+
                "\nnome do veiculo: "+getVeiculoCadastrado().getModelo()+
                "\nvinculo empresarial? "+ vinculo);
        getIdade();
        getCpf();
    }
}