package com.distribuida.model;

public class Categoria {

    // ATRIBUTOS
    private int idCategoria;
    private String nombre;

    // CONSTRUCTORES
    public Categoria(int i) { }

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getCategoria() {
        return "";
    }
}