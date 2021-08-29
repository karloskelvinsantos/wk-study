package br.com.wkstudy.resources;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkw.entidades.dados.pessoais.Endereco;
import com.jkw.entidades.dados.pessoais.Pessoa;
import com.jkw.entidades.dados.pessoais.PessoaFisica;
import com.jkw.entidades.dados.pessoais.Telefone;
import com.jkw.entidades.dados.pessoais.enums.Estado;
import com.jkw.entidades.dados.pessoais.enums.Sexo;
import com.jkw.entidades.dados.pessoais.enums.TipoTelefone;

import br.com.wkstudy.repositories.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoasResource {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping("/pessoa/{id}")
	public ResponseEntity<Pessoa> findPessoa(@PathVariable String id) {

		if (id == null || id == "")
			return ResponseEntity.badRequest().build();

		try {
			long longId = Long.parseLong(id);
			Pessoa pessoa = pessoaRepository.findById(longId).get();
			return ResponseEntity.ok(pessoa);
		} catch (NumberFormatException e) {
			return ResponseEntity.badRequest().build();
		} catch (NoSuchElementException e) {
			return ResponseEntity.notFound().build();
		}

	}

}
