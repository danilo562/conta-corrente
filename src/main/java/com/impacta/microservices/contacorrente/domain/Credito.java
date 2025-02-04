package com.impacta.microservices.contacorrente.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Credito implements Serializable {

    private Integer contaId;
    private BigDecimal credito;

    public Credito() {}

    public Credito(BigDecimal credito) {
        this.credito = credito;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public Integer getContaId() {return contaId;}

    public void setContaId(Integer contaId) {this.contaId = contaId;}

}
