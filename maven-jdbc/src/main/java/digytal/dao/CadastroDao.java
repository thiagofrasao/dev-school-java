package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	public void incluir(Cadastro cadastro) {
		try {
			String sql = "INSERT INTO public.tbl_cadastro (codigo,pessoa,nome,cpf,rg,telefone,email,profissao,cep,estado,cidade,bairro,rua,numero) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);"; 
			
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, cadastro.getCodigo());
			st.setString(2, cadastro.getPessoa());
			st.setString(3, cadastro.getNome());
			st.setString(4, cadastro.getCpf());
			st.setString(5, cadastro.getRg());
			st.setInt(6, cadastro.getTelefone());
			st.setString(7, cadastro.getEmail());
			st.setString(8, cadastro.getProfissao());
			st.setString(9, cadastro.getCep());
			st.setString(10, cadastro.getEstado());
			st.setString(11, cadastro.getCidade());
			st.setString(12, cadastro.getBairro());
			st.setString(13, cadastro.getRua());
			st.setInt(14, cadastro.getNumero());
			
			st.execute();
			st.close();
	  } catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	//COMO USAR O JDBC PARA IMPLEMENTAR ESSES MÉTODOS
	public void alterar(Cadastro cadastro) {
		
		    String sql = "UPDATE public.tbl_cadastro set codigo=?, pessoa=?, nome=?, cpf=?, rg=?, telefone=?" +
		            "email=?, profissao=?, cep=?, estado=?, cidade=?, bairro=?, rua=?, numero=?  where id=?";
		try {
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, cadastro.getCodigo());
			st.setString(2, cadastro.getPessoa());
			st.setString(3, cadastro.getNome());
			st.setString(4, cadastro.getCpf());
			st.setString(5, cadastro.getRg());
			st.setInt(6, cadastro.getTelefone());
			st.setString(7, cadastro.getEmail());
			st.setString(8, cadastro.getProfissao());
			st.setString(9, cadastro.getCep());
			st.setString(10, cadastro.getEstado());
			st.setString(11, cadastro.getCidade());
			st.setString(12, cadastro.getBairro());
			st.setString(13, cadastro.getRua());
			st.setInt(14, cadastro.getNumero());
			st.execute();
			st.close();
	  } catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	public void excluir(Integer id) {
		
		  try {
		    PreparedStatement st = cnn.prepareStatement("DELETE " + "FROM public.tbl_cadastro WHERE id=?");
		    st.setInt(1, id);
		    st.execute();
		    st.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
		 }
	}
		
	public List<Cadastro> listar() {
			
			List<Cadastro> cadastros = new ArrayList<Cadastro>();
		 
		try {
			
	        PreparedStatement st = this.cnn.prepareStatement("SELECT * FROM public.tbl_cadastro");
	        ResultSet rs = st.executeQuery();

	      while (rs.next()) {
	              // criando o objeto cadastro
	        Cadastro cadastro = new Cadastro();
	        cadastro.setId(rs.getInt("id"));
	        cadastro.setCodigo(rs.getInt("codigo"));
			cadastro.setPessoa(rs.getString("codigo"));
			cadastro.setNome(rs.getString("nome"));
			cadastro.setCpf(rs.getString("cpf"));
			cadastro.setRg(rs.getString("rg"));
			cadastro.setTelefone(rs.getInt("telefone"));
			cadastro.setEmail(rs.getString("email"));
			cadastro.setProfissao(rs.getString("profissao"));
			cadastro.setCep(rs.getString("cep"));
			cadastro.setEstado(rs.getString("estado"));
			cadastro.setCidade(rs.getString("cidade"));
			cadastro.setBairro(rs.getString("bairro"));
			cadastro.setRua(rs.getString("rua"));
			cadastro.setNumero(rs.getInt("numero"));
	        cadastros.add(cadastro);
	          }
	        rs.close();
	        st.close();
	      
	    } catch (SQLException e) {
	        e.printStackTrace();
	      }
		return cadastros;
		
	}
		
	public Cadastro buscar(Integer id) {
		Cadastro cadastro = null;
		 try {
		        String sql = "SELECT * FROM public.tbl_cadastro WHERE id=?";
		        PreparedStatement st = cnn.prepareStatement(sql);
		        st.setInt(1, 0);
		        ResultSet rs = st.executeQuery();
		 while (rs.next()) {
		              
		    cadastro = new Cadastro();
		    cadastro.setId(rs.getInt("id"));
		    cadastro.setCodigo(rs.getInt("codigo"));
		    cadastro.setPessoa(rs.getString("codigo"));
		    cadastro.setNome(rs.getString("nome"));
		    cadastro.setCpf(rs.getString("cpf"));
		    cadastro.setRg(rs.getString("rg"));
		    cadastro.setTelefone(rs.getInt("telefone"));
		    cadastro.setEmail(rs.getString("email"));
		    cadastro.setProfissao(rs.getString("profissao"));
		    cadastro.setCep(rs.getString("cep"));
		    cadastro.setEstado(rs.getString("estado"));
		    cadastro.setCidade(rs.getString("cidade"));
		    cadastro.setBairro(rs.getString("bairro"));
		    cadastro.setRua(rs.getString("rua"));
		    cadastro.setNumero(rs.getInt("numero"));
		         
		   }
		    rs.close();
		    st.close();
		      
	} catch (SQLException e) {
		        e.printStackTrace();
		      }
	return cadastro;
					
	}
	
	
}
