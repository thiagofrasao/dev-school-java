package myapp.laguapa.pedidos;

import myapp.laguapa.empresa.Empresa;
import myapp.laguapa.loja.Produto;
import myapp.laguapa.loja.Venda;
import myapp.laguapa.loja.Vendedor;

public class Pedido {
	
	private Empresa empresa;
	private Produto produto;
	private Venda venda;
	private Vendedor vendedor;
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	

}
