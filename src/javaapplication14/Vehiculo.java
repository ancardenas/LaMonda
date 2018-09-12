
package javaapplication14;


public class Vehiculo {
private String marca;
private int anio;
private String modelo;
private Llanta[] llanta;
private Motor motor;
private Puerta[] puertas;

    public Vehiculo(String marca, int anio, String modelo, Motor motor, Puerta[] puertas) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.llanta = new Llanta[4];
        this.motor = motor;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }


    
}
