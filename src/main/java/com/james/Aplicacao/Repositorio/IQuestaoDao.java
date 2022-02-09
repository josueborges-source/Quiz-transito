package com.james.Aplicacao.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.james.Aplicacao.Modelo.Questao;

@Repository
public interface IQuestaoDao extends JpaRepository<Questao, Long> 
{	
	
	Optional<Questao> findById(Long id);	

}
