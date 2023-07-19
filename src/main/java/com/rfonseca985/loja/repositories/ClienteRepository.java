package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	

}
