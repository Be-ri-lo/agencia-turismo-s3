package org.agencia.model;

import org.agencia.util.RutInvalidoException;

public class Proveedor extends Persona{

    private String lugar;
    private String TipoDeServicio;

    public Proveedor(String nombre, String apellido, String rut, String lugar, String TipoDeServicio) {
        super(nombre, apellido, rut);
        this.lugar = lugar;
        this.TipoDeServicio = TipoDeServicio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoDeServicio() {
        return TipoDeServicio;
    }

    public void setTipoDeServicio(String tipoDeServicio) {
        TipoDeServicio = tipoDeServicio;
    }

    @Override
    public String toString() {
        return "{" +
                "datosPersonales=" + super.toString() +
                ", lugar='" + lugar + '\'' +
                ", tipoDeServicio='" + TipoDeServicio + '\'' +
                '}';
    }
}
