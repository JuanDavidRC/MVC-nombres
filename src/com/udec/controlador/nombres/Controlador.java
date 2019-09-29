/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador.nombres;

import com.udec.modelo.nombres.Logica;
import com.udec.modelo.nombres.Persona;
import com.udec.vista.nombres.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * clase controlador que maneja los datos de 
 * la clase logica y los muestra en la clase vista
 ** @author JUAN DAVID REYES 
 *  @author ALEJANDRO TORRES
 */
public class Controlador  implements ActionListener{
    /**
     * declaracion de el arreglo 
     */
    ArrayList nombre= new ArrayList();
    /**
     * llamado de la clase logica con el param,etro de el nombre
     */
     Logica log =new Logica(nombre);
     /**
      * llamado de la clase vista para usar los botenes 
      */
      Vista vista = new Vista();
    /**
     * constructor de la clase vista que llama los botones
     * por medio de el parametro
     * @param v 
     */
    public Controlador(Vista v) {
         this.vista = v;
         this.vista.jTextField1.addActionListener(this);
         this.vista.ingresar.addActionListener(this);       
         this.vista.salir.addActionListener(this);
         
    }
    /**
     * metodo con los eveentos de la clase vista
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.ingresar) {
            log.Ingresarnombre(this.vista.jTextField1.getText());       
            vista.jTextArea1.append("\nNombre: "+log.Mostrarnombre(this.vista.jTextField1.getText()));
        }       
        if (e.getSource() == vista.salir) {
            System.exit(0); 
        }
    }
    
}
