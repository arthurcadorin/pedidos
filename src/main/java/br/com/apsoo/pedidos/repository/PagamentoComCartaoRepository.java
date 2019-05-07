package br.com.apsoo.pedidos.repository;


import br.com.apsoo.pedidos.domain.PagamentoComCartao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoComCartaoRepository extends JpaRepository<PagamentoComCartao, Integer> {

}
