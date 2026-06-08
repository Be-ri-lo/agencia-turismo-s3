package org.agencia.util;

/**
 * Utilidad para validar el formato de un RUT chileno.
 * Verifica que el RUT cumpla con el patrón {@code XXXXXXXX-Y}.
 */
public class RutValidador {

    /**
     * Valida que el RUT tenga un formato válido.
     *
     * @param rut RUT a validar en formato XXXXXXXX-Y
     * @throws RutInvalidoException si el RUT es nulo o no cumple el formato esperado
     */
    public static void validarRut(String rut) throws RutInvalidoException {

        if (rut == null || !rut.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException(
                    "El RUT '" + rut + "' no tiene un formato válido. Debe seguir el patrón XXXXXXXX-Y."
            );
        }
    }
}
