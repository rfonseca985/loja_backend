package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	

}
