package com.nestorproyecto.menuConversor;

public class Moneda {
//  creo las propiedades que tiene una moneda
    public String nombre;
    public int valor;
// creo el constructor
    public Moneda(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "el nombre de la moneda: "+ this.getNombre()+ " el valor es: "+ this.getValor();
    }
}
