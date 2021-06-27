package myapp.laguapa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import myapp.laguapa.empresa.Empresa;
import myapp.laguapa.empresa.Endereco;
import myapp.laguapa.enums.TipoProdutoEnum;
import myapp.laguapa.loja.Produto;
import myapp.laguapa.loja.Venda;
import myapp.laguapa.loja.Vendedor;
import myapp.laguapa.pedidos.Pedido;
import myapp.laguapa.util.PrinterApp;


public class Application {
	

	public static void main (String[]args) {
		
		
		Vendedor vendedor = new Vendedor();
		vendedor.setMatricula("1254G");
		vendedor.setNome("Luís");
		vendedor.setDataAdmissao(LocalDate.of(2021, Month.APRIL, 29));
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto1 = new Produto();
		produto1.setCodigo(9654);
		produto1.setDescricao("Vestido Frente Única");
		produto1.setPreco(89.90);
		produto1.setTipo(TipoProdutoEnum.VESTIDO.valor);
		produtos.add(produto1);
		
		Produto produto2 = new Produto();
		produto2.setCodigo(5321);
		produto2.setDescricao("Blusa Transpassada");
		produto2.setPreco(59.90);
		produto2.setTipo(TipoProdutoEnum.BLUSA.valor);
		produtos.add(produto2);
		
			
		Venda venda = new Venda();
		venda.setCodigo(123654845L);
		venda.setForma("À VISTA");
		venda.setValor(produto1.getPreco() + produto2.getPreco());
		venda.setData(new Date());
		venda.setProdutos(produtos);
		venda.setVendedor(vendedor);
		
		Empresa empresa = new Empresa();
		Endereco endereco = new Endereco("Av. Sete de Setembro", "Centro", "Rio de Janeiro", "Rio de Janeiro", "RJ", 93);
				
		empresa.setNome("LA GUAPA CONFECÇÕES LTDA.");
		empresa.setEndereco(endereco);
		empresa.setCnpj("46919628000196");
		empresa.setIe("761741967922");
		empresa.setIm("14327860");
		
		Pedido pedido = new Pedido();
		pedido.setEmpresa(empresa);
		pedido.setVenda(venda);
		
		PrinterApp.imprimirPedido(pedido);
			
		
	   }
		
		
}
