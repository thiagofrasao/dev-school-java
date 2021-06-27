package myapp.laguapa.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import myapp.laguapa.empresa.Empresa;
import myapp.laguapa.loja.Produto;
import myapp.laguapa.loja.Venda;
import myapp.laguapa.metodos.Formatador;
import myapp.laguapa.pedidos.Pedido;


public class PrinterApp {
	
	public static void imprimirPedido(Pedido pedido) {
		Formatador formatador = new Formatador();
		Empresa empresa = pedido.getEmpresa();
		Venda venda = pedido.getVenda();
		
		StringBuilder sb = new StringBuilder();
		sb.append("=============================================================================\n");
		sb.append(empresa.getNome() + "\n");
		sb.append(empresa.getEndereco().enderecoFormatado(empresa.getEndereco()) + "\n");
		sb.append(String.format("CNPJ: %s \n", formatador.formatarCNPJ(empresa.getCnpj())));
		sb.append(String.format("IE: %s\nIM: %s\n",formatador.formatarIE(empresa.getIe()),
				formatador.formatarIM(empresa.getIm())));
		sb.append("-----------------------------------------------------------------------------\n");
		
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = formatadorData.format(new Date());
		sb.append(dataFormatada);
		
		sb.append("----------------------------------------------------------\n");
		sb.append("Produtos: \n");
		
		for (Produto produto : venda.getProdutos()) {
			sb.append("- " + produto.getDescricao() + " - R$ " + produto.getPreco() + "\n");
		}
		sb.append(String.format("\nValor total da compra: R$ %.2f", pedido.getVenda().getValor()));
		sb.append("\n-----------------------------------------------------------------------------\n");
		sb.append(String.format("Vendedor: %s \n", venda.getVendedor().getNome(), venda.getVendedor().getMatricula()));
		sb.append(String.format("Código da Venda: %s", venda.getCodigo()));
		sb.append("\n=============================================================================\n");
		sb.append("VOLTE SEMPRE!!!!!!!!!!!!!!!!!!!!");
		sb.append("\n=============================================================================\n");
		System.out.println(sb.toString());
		
	}

}
