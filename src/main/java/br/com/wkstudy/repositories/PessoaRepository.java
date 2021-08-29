package br.com.wkstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkw.entidades.dados.pessoais.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
