package digytal;

import java.util.List;

import digytal.dao.CadastroDao;
import digytal.model.Cadastro;

public class JDBCApplication {

	static CadastroDao dao = new CadastroDao();

	public static void main(String[] args) {
		// testeInclusao();
		// testeExclusao();
		// testeAlteracao();
		//testeListar();
		testeBuscar(2);

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
		System.out.println("Cadastro efetuado com sucesso.");
	}

	private static void testeExclusao() {

		dao.excluir(1);
		System.out.println("Cadastro excluido com sucesso.");
	}

	private static void testeAlteracao() {
		Cadastro cadastro = new Cadastro();
		cadastro.setId(2);
		cadastro.setCodigo(1354);
		cadastro.setPessoa("PF");
		cadastro.setNome("ARTHUR SILVA ALTERADO");
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

		dao.alterar(cadastro);

		System.out.println("Cadastro alterado com sucesso.");
	}

	private static void testeListar() {

		List<Cadastro> cadastros = dao.listar();

		for (Cadastro cadastro : cadastros) {
			System.out.println("==================================");
			System.out.println("Cód: " + cadastro.getCodigo());
			System.out.println("Tipo Pessoa: " + cadastro.getPessoa());
			System.out.println("Nome:  " + cadastro.getNome());
			System.out.println("CPF: " + cadastro.getCpf());
			System.out.println("RG:  " + cadastro.getRg());
			System.out.println("Telefone: " + cadastro.getTelefone());
			System.out.println("Email: " + cadastro.getEmail());
			System.out.println("Profissao: " + cadastro.getProfissao());
			System.out.println("CEP: " + cadastro.getCep());
			System.out.println("Estado: " + cadastro.getEstado());
			System.out.println("Cidade: " + cadastro.getCidade());
			System.out.println("Bairro: " + cadastro.getBairro());
			System.out.println("Rua: " + cadastro.getRua());
			System.out.println("Número: " + cadastro.getNumero());
		}

		System.out.println("\n Total de " + cadastros.size() + " cadastros encontrados.");
	}

	private static void testeBuscar(int id) {

		Cadastro cadastro = dao.buscar(2);

		System.out.println("==================================");
		System.out.println("Cód: " + cadastro.getCodigo());
		System.out.println("Tipo Pessoa: " + cadastro.getPessoa());
		System.out.println("Nome:  " + cadastro.getNome());
		System.out.println("CPF: " + cadastro.getCpf());
		System.out.println("RG:  " + cadastro.getRg());
		System.out.println("Telefone: " + cadastro.getTelefone());
		System.out.println("Email: " + cadastro.getEmail());
		System.out.println("Profissao: " + cadastro.getProfissao());
		System.out.println("CEP: " + cadastro.getCep());
		System.out.println("Estado: " + cadastro.getEstado());
		System.out.println("Cidade: " + cadastro.getCidade());
		System.out.println("Bairro: " + cadastro.getBairro());
		System.out.println("Rua: " + cadastro.getRua());
		System.out.println("Número: " + cadastro.getNumero());

		
	}

}

