
package com.eon.Entities;

public class Barco extends Vehiculo{

    public Barco(double precio) {
        super(precio);
    }
    
    @Override
    public String precioVehiculo() {
        if(getPrecio() > 1000){
            return "El barco es muy caro";
        }
        return "";
    }
    
}
