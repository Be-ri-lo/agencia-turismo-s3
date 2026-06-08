package org.agencia.model;

/**
 * Representa a una persona con datos de identificación básicos.
 * Clase base para Cliente, Guia y Proveedor.
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String rut;

    /**
     * Crea una persona sin datos inicializados.
     * 
     */
    public Persona() {}

    /**
     * Crea una persona con atributos.
     *
     * @param nombre   nombre de la persona
     * @param apellido apellido de la persona
     * @param rut      RUT chileno en formato XXXXXXXX-Y
     */
    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    /**
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return el RUT de la persona
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut RUT chileno en formato XXXXXXXX-Y
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return representación en texto de los datos personales
     */
    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}
