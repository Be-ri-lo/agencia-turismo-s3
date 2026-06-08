package org.agencia.model;

/**
 * Representa a un proveedor de servicios asociado a la agencia de turismo.
 * Extiende Persona e incluye ubicación y tipo de servicio ofrecido.
 */
public class Proveedor extends Persona {

    private String lugar;
    private String TipoDeServicio;

    /**
     * Crea un proveedor con sus datos personales, ubicación y tipo de servicio.
     *
     * @param nombre          nombre del proveedor
     * @param apellido        apellido del proveedor
     * @param rut             RUT chileno en formato XXXXXXXX-Y
     * @param lugar           comuna o localidad donde opera el proveedor
     * @param TipoDeServicio  rubro o categoría del servicio (por ejemplo, "Restaurante")
     */
    public Proveedor(String nombre, String apellido, String rut, String lugar, String TipoDeServicio) {
        super(nombre, apellido, rut);
        this.lugar = lugar;
        this.TipoDeServicio = TipoDeServicio;
    }

    /**
     * @return localidad donde opera el proveedor
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar localidad donde opera el proveedor
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return el tipo de servicio que ofrece el proveedor
     */
    public String getTipoDeServicio() {
        return TipoDeServicio;
    }

    /**
     * @param tipoDeServicio tipo de servicio que ofrece el proveedor
     */
    public void setTipoDeServicio(String tipoDeServicio) {
        TipoDeServicio = tipoDeServicio;
    }

    /**
     * @return representación en texto del proveedor, incluyendo datos personales y servicio
     */
    @Override
    public String toString() {
        return "{" +
                "datosPersonales=" + super.toString() +
                ", lugar='" + lugar + '\'' +
                ", tipoDeServicio='" + TipoDeServicio + '\'' +
                '}';
    }
}
