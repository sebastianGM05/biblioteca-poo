package com.biblioteca;

public class Novela extends Libro {

    private String tipo;

    public Novela(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, ejemplaresPrestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de novela: " + tipo;
    }
}