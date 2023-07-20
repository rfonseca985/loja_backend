package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
	

}
