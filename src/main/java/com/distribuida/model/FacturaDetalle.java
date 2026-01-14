package com.distribuida.model;

public class FacturaDetalle {

    // ATRIBUTOS
    private int idDetalle;
    private Libro libro;
    private int cantidad;
    private int subtotal;

    // CONSTRUCTORES
    public FacturaDetalle() { }

    public FacturaDetalle(int idDetalle, Libro libro, int cantidad, int subtotal) {
        this.idDetalle = idDetalle;
        this.libro = libro;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    // GETTERS Y SETTERS
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodo de calculo
    public double calcularSubtotal() {
        return libro.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idDetalle=" + idDetalle +
                ", libro=" + libro.getTitulo() +
                ", cantidad=" + cantidad +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}