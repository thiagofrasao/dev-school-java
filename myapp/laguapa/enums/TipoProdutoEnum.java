package myapp.laguapa.enums;

public enum TipoProdutoEnum {
	
	BLUSA(1),
	VESTIDO(2);
	
	public int valor;
	private TipoProdutoEnum(int valor) {
		this.valor = valor;
	}

}
    