/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    private String marca;
    private String modelo;
    private int tamPulgada;

    public Llanta(String marca, String modelo, int tamPulgada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamPulgada = tamPulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamPulgada() {
        return tamPulgada;
    }

    public void setTamPulgada(int tamPulgada) {
        this.tamPulgada = tamPulgada;
    }
    
}
