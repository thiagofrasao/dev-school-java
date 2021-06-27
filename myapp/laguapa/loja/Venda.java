package myapp.laguapa.loja;

import java.util.Date;
import java.util.List;

public class Venda {
	
	private Long codigo;
	private String forma;
	private Double valor;
	private Date data;
	
	private List<Produto> produtos;
	
	private Vendedor vendedor;
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getForma() {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}
