package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	

}
