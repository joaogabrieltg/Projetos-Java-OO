package Lista9;

public class Veiculo {

    private String placa;
    private String chassi;
    private int ano;
    private String modelo;
    private String cor;

    public Veiculo(String placa, String chassi, int ano, String modelo, String cor) {
        this.placa = placa;
        this.chassi = chassi;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        try {
            for(int i = 0; i < placa.length(); i++){
                if((placa.length() == 7) && ((i <= 2 && placa.charAt(i) >= 65 && placa.charAt(i) <= 90)
                        || (i >= 3 && placa.charAt(i) >= 48 && placa.charAt(i) <= 57))){
                    //nn e erro
                }
                else {
                    throw new placaInvalidaException();
                }
            }
        }catch(placaInvalidaException erro){
            System.out.println(erro.getMessage());
        }
        return placa;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getChassi() {//9BWSU19F08B302158
        boolean aux = true;
        int n = chassi.length();
        try{
            for(int i = 0; i < n; i++){
                char a = chassi.charAt(i);
                if(n == 17){
                    if(((i==0 || i>0 && i<5) || i==7 || (i>8 && i<11)) && a >= 'A' && a <= 'Z' && a != 'Q' && a != 'I' && a != 'O' ){
                        //nn e erro
                    }
                    else if((i==0 || (i>4 && i<7) || (i>7 && i<10) || i>10) && a >= 48 && a <= 57){
                        //nn e erro
                    }
                    else{
                        aux = false;
                    }
                }
                else{
                    aux = false;
                }
            }
            if (!aux){
                throw new chassiInvalidoException();
            }
        }catch(chassiInvalidoException erro){
            System.out.println(erro.getMessage());
        }
        return chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}