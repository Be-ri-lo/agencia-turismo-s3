package org.agencia.model;

import org.agencia.util.RutInvalidoException;

import java.time.LocalDate;

public class Guia extends Persona{

    private boolean hablaIngles;
    private Contrato contrato;

    public Guia(String nombre, String apellido, String rut, boolean hablaIngles, String tipoContrato, LocalDate fechaContrato) {
        super(nombre, apellido, rut);
        this.hablaIngles = hablaIngles;
        this.contrato = new Contrato(tipoContrato, fechaContrato);
    }

    public boolean isHablaIngles() {
        return hablaIngles;
    }

    public void setHablaIngles(boolean hablaIngles) {
        this.hablaIngles = hablaIngles;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

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
