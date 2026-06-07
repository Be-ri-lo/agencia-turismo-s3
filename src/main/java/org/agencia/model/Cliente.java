package org.agencia.model;

public class Cliente extends Persona{

    private int edad;

    public Cliente(String nombre, String apellido, String rut, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setRut(rut);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" +
                "datosPersonales=" + super.toString() +
                ", edad=" + edad +
                '}';
    }
}
