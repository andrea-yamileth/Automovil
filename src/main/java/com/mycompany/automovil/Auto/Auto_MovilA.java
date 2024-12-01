/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.Auto;

/**
 *
 * @author ADMIN
 */
public class Auto_MovilA {
    
    private float velocidamax;
    private float velocidadactual;

    public float getVelocidamax() {
        return velocidamax;
    }

    public void setVelocidamax(float velocidamax) {
        this.velocidamax = velocidamax;
    }

    public float getVelocidadactual() {
        return velocidadactual;
    }

    public void setVelocidadactual(float velocidadactual) {
        this.velocidadactual = velocidadactual;
    }
    
        
    
    public void AcelerarAutomovil(double suma) {

        double acelerar = velocidadactual + suma;
        
        if (acelerar > velocidamax) {
            
            System.out.println("No se puede acelerar por encima de la velocidad maxima.");
      
        } else {
            
            velocidadactual = (float) acelerar;
            System.out.println("en estos momentos la velocidad actual es: " + velocidadactual);
        }
    }

    public void DesacelerarAutomovil(double restar) {
        
        double desacelerar = velocidadactual - restar;
        
        if (desacelerar < 0) {
            
            System.out.println("No se puede bajar la velocidad a una aceleracion negativa.");
       
        } else {
            
            velocidadactual = (float) desacelerar;
            System.out.println("Velocidad actual despues de bajar la velocidad: " + velocidadactual + "kilometros/hora.");
        }
    }

    public double TiempoDeLlegada(double distancia) {
        velocidadactual = velocidadactual;
        if (velocidadactual == 0) {
            System.out.println("El automovil esta detenido por lo tanto su velocidad es de 0 kilometros/hora.");
           
            return Double.POSITIVE_INFINITY;
        }
       
        return distancia / velocidadactual;
    }

    public void frenar() {
        
        velocidadactual = 0; 
        
        System.out.println("El automovil acaba de frenar y esta inmovil y su velocidad es: " + velocidadactual + "kilometros/hora.");
    }
}
