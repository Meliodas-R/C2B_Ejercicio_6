package com.eon.Entities;

public class Coche extends Vehiculo {

    public Coche(double precio) {
        super(precio);
    }
    
    @Override
    public String precioVehiculo() {
        if(getPrecio() > 1000){
            return "El coche es muy caro";
        }
        return "";
    }
}
