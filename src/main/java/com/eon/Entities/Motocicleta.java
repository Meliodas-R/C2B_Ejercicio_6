package com.eon.Entities;

public class Motocicleta extends Vehiculo {

    public Motocicleta(double precio) {
        super(precio);
    }

    @Override
    public String precioVehiculo() {
        if(getPrecio() > 1000){
            return "La motocicleta es muy cara";
        }
        return "";
    }
    
}
