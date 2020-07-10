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
public class Materias {
    String Nombre;
    Materias sig;
    Estudiante abajo;
    
    Materias(String nombre){
        this.Nombre=nombre;
        sig=null;
        abajo=null;
    }
}
