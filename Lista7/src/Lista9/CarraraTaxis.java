package Lista9;
import java.time.LocalDate;

public class CarraraTaxis {
    public static void main(String[] args){

        String nome = "Agostinho Carrara";
        String cpf = "531800800001";//tirar o '1' da certo
        String cnh = "8008135";
        LocalDate nascimento = LocalDate.of(2008, 4,22);//1968
        LocalDate dataDeEntrada = LocalDate.of(2001, 3,29);//viajante do tempo
        String placa = "CPR8253a";//tirar o 'a' da certo
        String chassi = "9BWSU19F08B302158a";//tirar o 'a' da certo
        int ano = 1959;
        String modelo = "Volkswagen Santana";
        String cor = "Amarelo";
        double valorDaCorrida = 100;
        int passageiros = 4;
        Veiculo veiculoCadastrado = new Veiculo(placa, chassi, ano, modelo, cor);

        Motorista normal = new Motorista(nome, cpf, cnh, nascimento, dataDeEntrada, veiculoCadastrado, false);
        Motorista diamante = new MotoristaDiamante(nome, cpf, cnh, nascimento, dataDeEntrada, veiculoCadastrado, false);
        Motorista enterprise = new MotoristaEnterprise(nome, cpf, cnh, nascimento, dataDeEntrada, veiculoCadastrado, passageiros, true);

        try {
            System.out.println("normal: "+ normal.calcularRepasse(valorDaCorrida));
            System.out.println("diamante: "+ diamante.calcularRepasse(valorDaCorrida));
            System.out.println("enterprise: "+ enterprise.calcularRepasse(valorDaCorrida) +" para "+ passageiros +" passageiros");
            veiculoCadastrado.getPlaca();
            veiculoCadastrado.getChassi();
            normal.printarCaracteristicas();
            diamante.printarCaracteristicas();
            enterprise.printarCaracteristicas();
        }
        catch (Exception e){
            System.err.println("ops, um erro ocorreu");
        }
    }
}

//QUESTAO 2
/*
O try/catch e um metodo de filtragem de excecoes no codigo, alem de permitir tratar e solucionar tais execoes, nesse codigo
eles foram utilizados nas classes pedidas na questao 1, sendo utilizado na maioria das vezes caso ifs nao fossem cumpridos,
mas tambem poderiam ser utilizados na main, com varios catchs para um try. Finally serve para executar algum comando apos
um erro, sempre sera executado, exceto em caso de System.exit(0) ou afins. Nao foi utilizado no codigo pois nao vi necessidade,
justamente por conta da maneira que os erros foram tratados nas classes.
*/