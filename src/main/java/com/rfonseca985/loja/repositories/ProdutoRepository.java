package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	

}
