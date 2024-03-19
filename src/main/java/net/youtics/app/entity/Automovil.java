package net.youtics.app.entity;

public class Automovil {
    protected String modelo;
    public String color;
    private double cilindrada;
    String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Automovil() {
    }

    public Automovil(String modelo) {
        this.modelo = modelo;
    }

    public Automovil(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(String modelo, String color, double cilindrada) {
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    public void acelerar() {}
    public void acelerar(int subir) {}
    public void frenar() {}
}
