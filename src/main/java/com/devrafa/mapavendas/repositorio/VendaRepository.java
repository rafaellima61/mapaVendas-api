package com.devrafa.mapavendas.repositorio;

import com.devrafa.mapavendas.modelo.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    BigDecimal somarValorPorAnoMes(@Param("ano") int ano, @Param("mes") int mes);

}
