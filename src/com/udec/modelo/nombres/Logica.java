/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo.nombres;

import java.util.ArrayList;

/**
 * clase que contiene la lagica de la clasepersona
 * @author JUAN DAVID REYES 
 * @author ALEJANDRO TORRES
 */
public class Logica extends Persona {
    /**
     * constructor vacio de la clase
     */
    public Logica() {
    }

    /**
     * constructor con el  parametro nombre
     * @param nombre 
     */
    public Logica(ArrayList nombre) {
        super(nombre);
    }
    /**
     * metodo para añadir datos a la lista
     * @param nombres 
     */
    @Override
    public void Ingresarnombre(String nombres) {
        super.nombre.add(nombres);
    }
    /**
     * metodo string que retorna el nombre ingresado
     * @param nombres
     * @return 
     */
    @Override
    public String Mostrarnombre(String nombres) {
        String mostrarNombre="";
        if(super.nombre.contains(nombres)==true){
            mostrarNombre=super.nombre.get(super.nombre.indexOf(nombres)).toString();
            
        }else{
            mostrarNombre="No existe";
        }
        return mostrarNombre;
    }
    
}
