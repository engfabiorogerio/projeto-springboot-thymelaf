package com.engfabiorogerio.projetospringthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.engfabiorogerio.projetospringthymeleaf.rh.dominio.Pessoa;
import com.engfabiorogerio.projetospringthymeleaf.rh.dominio.PessoaRepository;

@Component
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa("Fabio");
		p1.setCpf("11122233344");
		p1.setDataNascimento(1982, 04, 14);
		p1.setEmail("engfabiorogeriomoraes@gmail.com");
		p1.setTelefone("19983274529");
		
		Pessoa p2 = new Pessoa("Ivanete");
		p2.setCpf("11122233344");
		p2.setDataNascimento(1982, 04, 14);
		p2.setEmail("engfabiorogeriomoraes@gmail.com");
		p2.setTelefone("19983274529");
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
	}
	
	

	
	
}
