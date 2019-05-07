package br.com.apsoo.pedidos.repository;



import br.com.apsoo.pedidos.domain.PagamentoComBoleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoComBoletoRepository extends JpaRepository<PagamentoComBoleto, Integer> {

}
