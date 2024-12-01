/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;

import com.mycompany.automovil.Auto.Auto_Movil;
import com.mycompany.automovil.Auto.ColorDeAutos;
import com.mycompany.automovil.Auto.TipoDeAutos;
import com.mycompany.automovil.Auto.TipoDeCombustibles;

/**
 *
 * @author ADMIN
 */
public class Automovil {

    public static void main(String[] args) {
        Auto_Movil miAuto = new Auto_Movil();

        miAuto.setMarca("D-MAX");
        miAuto.setModelo("2023");
        miAuto.setMotor(3);
        miAuto.setTipodecombustibles(TipoDeCombustibles.GASOLINA);
        miAuto.setTipodeautos(TipoDeAutos.CAMIONETA);
        miAuto.setNumPuertas(4);
        miAuto.setCantidadasientos(6);
        miAuto.setVelocidamax(160);
        miAuto.setColor(ColorDeAutos.GRIS);
        miAuto.MostrarCaracteristicas();
        miAuto.setVelocidadactual(100);
    }
}
