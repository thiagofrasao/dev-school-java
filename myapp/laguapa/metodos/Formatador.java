package myapp.laguapa.metodos;

public class Formatador {
	
	public String formatarCNPJ(String cnpj) {
		String cnpjFormatado = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." +
				cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" +
				cnpj.substring(12, 14);
		return cnpjFormatado;
	}
	
	public String formatarIE(String ie) {
		String ieFormatado = ie.substring(0, 3) + "." + ie.substring(3, 6) + "." +
				ie.substring(6, 9) + "." + ie.substring(9, 12);
		return ieFormatado;
	}
	
	public String formatarIM(String im) {
		String imFormatado = im.substring(0, 2) + "." + im.substring(2, 5) + "." +
				im.substring(5, 8);
		return imFormatado;
				
	}
}
