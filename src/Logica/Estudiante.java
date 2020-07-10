/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author User
 */
public class Estudiante {
    String Nombre_ES;
    Estudiante abajo;
    
    Estudiante (String nombre){
        this.Nombre_ES=nombre;
        abajo=null;
    }
}
