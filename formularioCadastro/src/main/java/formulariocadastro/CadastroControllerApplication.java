package br.edu.usj.ads.formulariocadastro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroControllerApplication {

	Cadastro cadastro = new Cadastro();

	@PostMapping(value="/cadastro")
	public ModelAndView postCadastro(
	@RequestParam String nome,
	@RequestParam String sobrenome,
	@RequestParam String idade,
	@RequestParam String email) {

	
		String mostraCadastro = "Nome: " + nome +
								"<br>" + "sobrenome: " + sobrenome +
								"<br>" + "Idade: " + idade +
								"<br>" + "E-mail: " + email;

		 cadastro.verCadastro(mostraCadastro);
		ModelAndView mad = new ModelAndView("index");
		mad.addObject("historico", cadastro.lerCadastro());


		return mad;
	}

}
