package com.mycompany.automovil;

import com.mycompany.automovil.Auto.Auto_MovilA;

public class Automovil {

    public static void main(String[] args) {

        Auto_MovilA Auto = new Auto_MovilA();
            
            Auto.setVelocidamax(160);
            Auto.setVelocidadactual(80);
            Auto.AcelerarAutomovil(20);
            Auto.DesacelerarAutomovil(50);
            double tiempoEstimado = Auto.TiempoDeLlegada(130);
        if (tiempoEstimado == Double.POSITIVE_INFINITY) {
            System.out.println("El automovil esta inmovil no se puede llegar a la conclusion del tiempo estimado");
        } else {
            System.out.println("Tiempo estimado es: " + tiempoEstimado + " horas");
        }
        Auto.frenar();
        
    }
}
