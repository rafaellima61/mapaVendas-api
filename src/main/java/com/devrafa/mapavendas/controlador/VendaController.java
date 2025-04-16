package com.devrafa.mapavendas.controlador;

import com.devrafa.mapavendas.modelo.Venda;
import com.devrafa.mapavendas.repositorio.BigDecimal;
import com.devrafa.mapavendas.repositorio.VendaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    private final VendaRepository vendaRepository;

    public VendaController(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    @GetMapping("/total")
    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public Map<String, BigDecimal> totalPorMesEAno(@RequestParam int ano, @RequestParam int mes) {
        BigDecimal total = vendaRepository.somarValorPorAnoMes(ano, mes);
        return Collections.singletonMap("total", total);
    }
}
