/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo.nombres;

import java.util.ArrayList;

/**
 * Clase abstracta que contiene datos de la paersona 
 *  @author JUAN DAVID REYES 
 *  @author ALEJANDRO TORRES
 */
public abstract class Persona {
   /**
    * declaracion de la lista que solo contendra el nombre
    */
   ArrayList nombre;
    /**
     * constructor de la clase 
     */
    public Persona() {
    }
   /**
    * constructor de la clase con el par
    * @param nombre 
    */
    public Persona(ArrayList nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo get que retorna el nombre
     * @return 
     */
    public ArrayList getNombre() {
        return nombre;
    }
    /**
     * metodo set para obtener el nombre
     * 
     * @param nombre 
     */
    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo abstracto para ingresar los textos
     * @param nombres 
     */
    public abstract void Ingresarnombre(String nombres);
    /**
     * metdod abstracto para mostrar el nombre
     * @param nombres
     * @return 
     */
    public abstract String  Mostrarnombre(String nombres);
}
