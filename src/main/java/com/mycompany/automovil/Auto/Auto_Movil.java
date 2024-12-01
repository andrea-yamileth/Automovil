/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.Auto;

/**
 *
 * @author HP
 */
public class Auto_Movil {

    private String marca;
    private String modelo;
    private float motor;
    private int cantidadasientos;
    private float velocidamax;
    private ColorDeAutos color;
    private float velocidadactual;
    private TipoDeAutos tipodeautos;
    private TipoDeCombustibles tipodecombustibles;
    private int numPuertas;

    ;

    public Auto_Movil() {
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

    public double getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public TipoDeAutos getTipodeautos() {
        return tipodeautos;
    }

    public void setTipodeautos(TipoDeAutos tipodeautos) {
        this.tipodeautos = tipodeautos;
    }

    public TipoDeCombustibles getTipodecombustibles() {
        return tipodecombustibles;
    }

    public void setTipodecombustibles(TipoDeCombustibles tipodecombustibles) {
        this.tipodecombustibles = tipodecombustibles;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantidadasientos() {
        return cantidadasientos;
    }

    public void setCantidadasientos(int cantidadasientos) {
        this.cantidadasientos = cantidadasientos;
    }

    public double getVelocidamax() {
        return velocidamax;
    }

    public void setVelocidamax(float velocidamax) {
        this.velocidamax = velocidamax;
    }

    public ColorDeAutos getColor() {
        return color;
    }

    public void setColor(ColorDeAutos color) {
        this.color = color;
    }

    public double getVelocidadactual() {
        return velocidadactual;
    }

    public void setVelocidadactual(float velocidadactual) {
        this.velocidadactual = velocidadactual;
    }

    public void MostrarCaracteristicas() {
        System.out.println("la Marca del auto es: " + marca);
        System.out.println("El Modelo del auto es: " + modelo);
        System.out.println("El motor del autos es: " + motor + " Ltr");
        System.out.println("El Tipo de Combustible es: " + tipodecombustibles);
        System.out.println("El Tipo de Automovil es: " + tipodeautos);
        System.out.println("Numero de Puertas del auto son: " + numPuertas);
        System.out.println("Cantidad de Asientos: " + cantidadasientos);
        System.out.println("velocidad maxima del auto es: " + velocidamax);
        System.out.println("color del auto es: " + color);
        System.out.println("velocidad actual del auto es: " + velocidadactual);
    }

}
