package myapp.laguapa.loja;

public class Produto {
	
	private Integer codigo;
	private String descricao;
	private Double preco;
	
	private int tipo;
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo (int tipo) {
		this.tipo = tipo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
