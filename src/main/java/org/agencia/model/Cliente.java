package org.agencia.model;

/**
 * Representa a un cliente de la agencia de turismo.
 * Extiende de Persona e incluye la edad del cliente.
 */
public class Cliente extends Persona {

    private int edad;

    /**
     * Crea un cliente con sus datos personales y edad.
     *
     * @param nombre   nombre del cliente
     * @param apellido apellido del cliente
     * @param rut      RUT chileno en formato XXXXXXXX-Y
     * @param edad     edad del cliente en años
     */
    public Cliente(String nombre, String apellido, String rut, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setRut(rut);
        this.edad = edad;
    }

/**
     * @return la edad del cliente
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad edad del cliente en años
     */
    public void setEdad(int edad) {}

    /**
     * @return representación en texto del cliente, incluyendo datos personales y edad
     */
    @Override
    public String toString() {
        return "{" +
                "datosPersonales=" + super.toString() +
                ", edad=" + edad +
                '}';
    }
}
