package org.agencia.util;

/**
 * Excepción lanzada cuando un RUT no cumple con el formato válido.
 *
 * @see RutValidador#validarRut(String)
 */
public class RutInvalidoException extends Exception {

    /**
     * Crea una excepción con un mensaje descriptivo del error de validación.
     *
     * @param mensaje descripción del problema detectado en el RUT
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
