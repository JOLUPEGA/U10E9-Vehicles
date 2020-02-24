/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author Jose Luis Perez
 */
public class Vehicle {

    private int cantidadRuedas;
    private int millasPorGalon;
    
    public Vehicle(int cantidadRuedas, int millasPorGalon){
        this.cantidadRuedas = cantidadRuedas;
        this.millasPorGalon = millasPorGalon;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cantidad de ruedas: " + this.cantidadRuedas + " Millas por galon: " + this.millasPorGalon;
    }
}