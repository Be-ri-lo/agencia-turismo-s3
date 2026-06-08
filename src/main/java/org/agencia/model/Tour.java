package org.agencia.model;

/**
 * Representa un tour organizado por la agencia.
 * Agrupa al Cliente, Guia y Proveedor del servicio.
 */
public class Tour {

    private Cliente cliente;
    private Guia guia;
    private Proveedor proveedor;

    /**
     * Crea un tour con cliente, guía y proveedor asignados.
     *
     * @param cliente   cliente que contrata el tour
     * @param guia      guía asignado al tour
     * @param proveedor proveedor del servicio asociado al tour
     */
    public Tour(Cliente cliente, Guia guia, Proveedor proveedor) {
        this.cliente = cliente;
        this.guia = guia;
        this.proveedor = proveedor;
    }

    /**
     * @return el cliente del tour
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente cliente del tour
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return el guía asignado al tour
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * @param guia guía asignado al tour
     */
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * @return el proveedor del servicio del tour
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor proveedor del servicio del tour
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return ficha completa del tour con cliente, guía y proveedor
     */
    @Override
    public String toString() {
        return "{" +
                "cliente=" + cliente +
                ", guia=" + guia +
                ", proveedor=" + proveedor +
                '}';
    }
}
