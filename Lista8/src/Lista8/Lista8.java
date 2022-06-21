package Lista8;
import java.time.LocalDate;

public class Lista8 {
    public static void main(String[] args){
        //testes de pessoas
        Cliente joao = new Cliente("joao", "000000000-00", "jgtg@ecomp.poli.br", "(81) 98245-1444", LocalDate.of(2002,10,10), "Recife-PE");
        Gerente g1 = new Gerente("pedro", "000000000-00", "pedro@email.com", "(12) 12345-1234", LocalDate.of(2002, 1,1), "Recife-PE", "000000000-00", 2500, LocalDate.of(2010, 1,1));
        Funcionario jose = new Funcionario("jose", "000000000-00", "jose@email.com", "(12) 12345-1234", LocalDate.of(2002, 1,1), "Recife-PE", "000000000-00", 1500, LocalDate.of(2010, 1,1), g1);
        Funcionario ana = new Funcionario("ana", "000000000-00", "ana@email.com", "(12) 12345-1234", LocalDate.of(2002, 1,1), "Recife-PE", "000000000-00", 1500, LocalDate.of(2010, 1,1), (g1));
        g1.setValorComissao(500, ana);
        g1.setValorComissao(750, ana);
        System.out.println(ana.getSalarioTotal());
        System.out.println(ana.getSalarioBase());
        System.out.println(jose.getSalarioTotal());
        System.out.println(jose.getSalarioBase());
        System.out.println(g1.getSalarioTotal());
        System.out.println(g1.getSalarioBase());
        System.out.println(g1.getAnosDeServico());

        //testes de compras
        LocalDate diaDaCompra = LocalDate.now();
        Produto produto1 = new Produto("produto", 10 , 1);
        Produto produto2 = new Produto("produto", 100 , 1);
        Produto produto3 = new Produto("produto", 500 , 1);
        Compra compra1 = new Compra(produto1 , joao, diaDaCompra);
        Compra compra2 = new Compra(produto2 , joao, diaDaCompra);
        Compra compra3 = new Compra(produto3 , joao, diaDaCompra);
        System.out.println(compra1.getValorBase());
        System.out.println(compra2.getValorBase());
        System.out.println(compra3.getValorBase());
        joao.setTipoPagamento("dinheiro");
        joao.setCompra(compra1);
        joao.setCompra(compra2);
        joao.setCompra(compra3);
        System.out.println(joao.getValorBase());
        System.out.println(joao.getValorTotal());
        System.out.println(joao.getTipoCliente());
        System.out.println(joao.getCompra().getDesconto());
    }
}
