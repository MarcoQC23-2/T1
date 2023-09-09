/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

/**
 *
 * @author mco_a
 */
public class Persona {
    
    private String nombre_apellido;

    public Persona(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }
    
    public String consola(){
        return this.nombre_apellido;  
    }
}
