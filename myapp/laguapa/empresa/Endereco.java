package myapp.laguapa.empresa;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String siglaEstado;
	
	private Integer numero;
	
	public Endereco(String logradouro, String bairro, String cidade, String estado, String siglaEstado, Integer numero) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.siglaEstado = siglaEstado;
		this.numero = numero;
		
	}
	
	public String enderecoFormatado(Endereco endereco) {
		return String.format("%s, %s, %s - %s - %s", logradouro, numero, bairro, estado, siglaEstado);
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getSiglaEstado() {
		return siglaEstado;
	}
	
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

}
