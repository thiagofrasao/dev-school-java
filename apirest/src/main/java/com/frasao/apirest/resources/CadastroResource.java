package com.frasao.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frasao.apirest.models.Cadastro;
import com.frasao.apirest.repository.CadastroRepository;

@RestController
@RequestMapping(value="/api")
public class CadastroResource {
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@GetMapping("/cadastros")
	public List<Cadastro> listaCadastros() {
		return cadastroRepository.findAll();
	}
	
	@GetMapping("/cadastro/{id}")
	public Optional<Cadastro> listaCadastroUnico(@PathVariable(value="id") Integer id) {
		return cadastroRepository.findById(id);
	}
	
	@PostMapping("/cadastro")
	public Cadastro salvaCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
	
	
	@DeleteMapping("/cadastro")
	public void deletaCadastro(@RequestBody Cadastro cadastro) {
		cadastroRepository.delete(cadastro); 
	} 
	
	@PutMapping("/cadastro")
	public Cadastro atualizaCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro); 
	} 

}
