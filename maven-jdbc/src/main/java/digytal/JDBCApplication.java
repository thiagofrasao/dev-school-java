package digytal;

import digytal.dao.CadastroDao;
import digytal.model.Cadastro;

public class JDBCApplication {
	
	static CadastroDao dao = new CadastroDao();
	
	public static void main(String[]args) {
		testeInclusao();
		
	}	
	private static void testeInclusao() {
		
		Cadastro cadastro = new Cadastro();
		cadastro.setCodigo(1354);
		cadastro.setPessoa("PF");
		cadastro.setNome("ARTHUR SILVA");
		cadastro.setCpf("120.154.4567-60");
		cadastro.setRg("16.766.755-20");
		cadastro.setTelefone(98656565);
		cadastro.setEmail("arthur_silva@gmail.com");
		cadastro.setProfissao("MOTORISTA");
		cadastro.setCep("24450-750");
		cadastro.setEstado("RJ");
		cadastro.setCidade("RIO DE JANEIRO");
		cadastro.setBairro("SANTA TERESA");
		cadastro.setRua("RUA AARÃO REIS");
		cadastro.setNumero(65);
	  		
		
		dao.incluir(cadastro);
	}
		
}
