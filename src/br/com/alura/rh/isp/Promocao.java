package br.com.alura.rh.isp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste {

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return this.valor;
    }

    @Override
    public LocalDate data() {
        return this.data;
    }
}
