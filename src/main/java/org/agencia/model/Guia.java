package org.agencia.model;

import java.time.LocalDate;

/**
 * Representa a un guía turístico contratado por la agencia.
 * Extiende Persona e incluye idioma y datos contractuales.
 */
public class Guia extends Persona {

    private boolean hablaIngles;
    private Contrato contrato;

    /**
     * Crea un guía con sus datos personales, idioma y contrato asociado.
     *
     * @param nombre        nombre del guía
     * @param apellido      apellido del guía
     * @param rut           RUT chileno en formato XXXXXXXX-Y
     * @param hablaIngles   indica si el guía habla inglés
     * @param tipoContrato  tipo de contrato (por ejemplo, "Indefinido" o "Plazo Fijo")
     * @param fechaContrato fecha de inicio o firma del contrato
     */
    public Guia(String nombre, String apellido, String rut, boolean hablaIngles, String tipoContrato, LocalDate fechaContrato) {
        super(nombre, apellido, rut);
        this.hablaIngles = hablaIngles;
        this.contrato = new Contrato(tipoContrato, fechaContrato);
    }

    /**
     * @return {@code true} si el guía habla inglés, {@code false} en caso contrario
     */
    public boolean isHablaIngles() {
        return hablaIngles;
    }

    /**
     * @param hablaIngles indica si el guía habla inglés
     */
    public void setHablaIngles(boolean hablaIngles) {
        this.hablaIngles = hablaIngles;
    }

    /**
     * @return el contrato asociado al guía
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato contrato asociado al guía
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    /**
     * @return representación en texto del guía, incluyendo datos personales, idioma y contrato
     */
    @Override
    public String toString() {
        return "{" +
                "datosPersonales={nombre='"+ getNombre() +
                "', apellido='"+ getApellido() +
                "', rut='"+ getRut() +
                "', hablaIngles=" + hablaIngles +
                ", contrato=" + contrato +
                '}';
    }
}
