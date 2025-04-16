package com.devrafa.mapavendas.repositorio;

import com.devrafa.mapavendas.modelo.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    @Query("SELECT COALESCE(SUM(v.valor), 0) FROM Venda v WHERE EXTRACT(YEAR FROM v.dataVenda) = :ano AND EXTRACT(MONTH FROM v.dataVenda) = :mes")
    BigDecimal somarValorPorAnoMes(@Param("ano") int ano, @Param("mes") int mes);

}
