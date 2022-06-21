package Lista8;

public class Produto {

    String descricao;
    double preco;
    int quantidade;

    public Produto(String descricao, double preco, int quantidade){
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
