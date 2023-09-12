package com.engfabiorogerio.projetospringthymeleaf.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.engfabiorogerio.projetospringthymeleaf.rh.dominio.PessoaRepository;

@Controller
public class PessoaController {
	
	private PessoaRepository pessoaRepo;
	
	public PessoaController(PessoaRepository pessoaRepo) {
		this.pessoaRepo = pessoaRepo;
	}
	
	@GetMapping("/rh/pessoas")
	public String pessoas(Model model) {
		
		model.addAttribute("listaPessoas",pessoaRepo.findAll());
		return "rh/pessoas/index";
	}

}
