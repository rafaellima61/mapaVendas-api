package com.devrafa.mapavendas.controlador;

import com.devrafa.mapavendas.modelo.Venda;
import com.devrafa.mapavendas.repositorio.VendaRepository;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    @GetMapping("/total")
    public Map<String, BigDecimal> totalPorMesEAno(@RequestParam int ano, @RequestParam int mes) {
        BigDecimal total = vendaRepository.somarValorPorAnoMes(ano, mes);
        return Collections.singletonMap("total", total);
    }
}
