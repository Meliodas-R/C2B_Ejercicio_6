package com.eon.PL;

import com.eon.Entities.Barco;
import com.eon.Entities.Coche;
import com.eon.Entities.Motocicleta;

public class Principal {

    public static void main(String[] args) {
        Coche coche = new Coche(10000);
        Motocicleta motocicleta = new Motocicleta(10000);
        Barco barco = new Barco(10000);
        
        System.out.println(coche.precioVehiculo());
        System.out.println(motocicleta.precioVehiculo());
        System.out.println(barco.precioVehiculo());
    }
}
