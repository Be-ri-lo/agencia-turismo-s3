package org.agencia.model;

public class Tour {

    private Cliente cliente;
    private Guia guia;
    private Proveedor proveedor;

    public Tour(Cliente cliente, Guia guia, Proveedor proveedor) {
        this.cliente = cliente;
        this.guia = guia;
        this.proveedor = proveedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "{" +
                "cliente=" + cliente +
                ", guia=" + guia +
                ", proveedor=" + proveedor +
                '}';
    }
}
