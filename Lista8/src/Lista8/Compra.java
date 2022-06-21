package Lista8;
import java.time.LocalDate;

public class Compra implements Desconto,Pagamento{

    double desconto;
    Produto produto;
    Cliente cliente;
    double valorBase;
    double valorCompra;
    LocalDate dataDaCompra;

    public Compra(Produto produto, Cliente cliente, LocalDate dataDaCompra){
        this.produto = produto;
        this.cliente = cliente;
    }

    public double getValorBase(){
        valorBase = produto.getPreco();
        return valorBase;
    }

    @Override
    public String getTipoPagamento(){
        return cliente.getTipoPagamento();
    }

    @Override
    public double getDescontoSilver(){
        desconto = valorBase*0.03;
        return desconto;
    }

    @Override
    public double getDescontoLight(){
        desconto = valorBase*0.05;
        return desconto;
    }

    @Override
    public double getDescontoPlus(){
        desconto = 50;
        return desconto;
    }

    @Override
    public double getDescontoCartao(){
        desconto = valorBase*0.02;
        return desconto;
    }

    public double getValorCompra(){
        double desconto;
        valorBase = cliente.getValorBase();
        if(cliente.getTipoCliente().equals("silver") && cliente.getTipoPagamento().equalsIgnoreCase("dinheiro")){
            desconto = getDescontoSilver();
        }
        else if(cliente.getTipoCliente().equals("light") && cliente.getTipoPagamento().equalsIgnoreCase("dinheiro")){
            desconto = getDescontoLight();
        }
        else if(cliente.getTipoCliente().equals("plus") && cliente.getTipoPagamento().equalsIgnoreCase("dinheiro")){
            desconto = getDescontoPlus();
        }
        else if(cliente.getTipoPagamento().equalsIgnoreCase("cartao")){
            desconto = getDescontoCartao();
        }
        else{
            desconto = 0;
        }
        this.desconto = desconto;
        valorCompra = cliente.getValorBase()-desconto;
        return valorCompra;
    }

    public double getDesconto(){
        return desconto;
    }

    public LocalDate getDataDaCompra(){
        return dataDaCompra;
    }
    public void setDataDaCompra(LocalDate dataDaCompra){
        this.dataDaCompra = dataDaCompra;
    }
}
