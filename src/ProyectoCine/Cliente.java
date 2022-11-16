/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCine;

/**
 *
 * @author jean
 */
public class Cliente {
    String nombre;
    int edad;
    double dinero;

    public Cliente(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    public void datosCli(double precio){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Cambio: "+(this.dinero-precio));
    }  
}
