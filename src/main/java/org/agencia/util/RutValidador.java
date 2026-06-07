package org.agencia.util;

public class RutValidador {

    public static void validarRut(String rut) throws RutInvalidoException {

        if (rut == null || !rut.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException(
                    "El RUT '" + rut + "' no tiene un formato válido. Debe seguir el patrón XXXXXXXX-Y."
            );
        }
    }
}
