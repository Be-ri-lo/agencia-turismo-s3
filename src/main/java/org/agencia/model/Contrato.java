package org.agencia.model;

import java.time.LocalDate;

public class Contrato {

    private String tipoContrato;
    private LocalDate fechaContrato;

    public Contrato(String tipoContrato, LocalDate fechaContrato) {
        this.tipoContrato = tipoContrato;
        this.fechaContrato = fechaContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "{" +
                "tipoContrato='" + tipoContrato + '\'' +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}

