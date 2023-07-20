package com.rfonseca985.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfonseca985.loja.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	

}
