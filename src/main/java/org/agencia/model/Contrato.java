package org.agencia.model;

import java.time.LocalDate;

/**
 * Representa un contrato laboral asociado a un Guia.
 * Almacena el tipo de contrato y su fecha de inicio o firma.
 */
public class Contrato {

    private String tipoContrato;
    private LocalDate fechaContrato;

    /**
     * Crea un contrato con tipo y fecha especificados.
     *
     * @param tipoContrato  tipo de contrato (por ejemplo, "Indefinido" o "Plazo Fijo")
     * @param fechaContrato fecha de inicio 
     */
    public Contrato(String tipoContrato, LocalDate fechaContrato) {
        this.tipoContrato = tipoContrato;
        this.fechaContrato = fechaContrato;
    }

    /**
     * @return el tipo de contrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @param tipoContrato tipo de contrato
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @return la fecha del contrato
     */
    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    /**
     * @param fechaContrato fecha del contrato
     */
    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    /**
     * @return representación en texto del contrato
     */
    @Override
    public String toString() {
        return "{" +
                "tipoContrato='" + tipoContrato + '\'' +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}
