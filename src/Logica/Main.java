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
public class Main {
    public static void main(String []args){
       Multilista multilis = new Multilista();
        multilis.agregarMateria("Ciencias");
        multilis.agregarMateria("Aritmetica");        
        //multilis.agregarMateria("Sociales");
        //multilis.agregarMateria("Matematicas");
        //multilis.agregarMateria("Español");
        //multilis.agregarMateria("Español");
        multilis.mostrar();
        System.out.println("*************************");
        //multilis.QuitarMateria("Matematicas");
        //multilis.QuitarMateria("Ciencias");
       
        multilis.AgregarEstudiante("Aritmetica", "Juan");
        multilis.AgregarEstudiante("Aritmetica", "Carlos");
        multilis.AgregarEstudiante("Aritmetica", "Rolo");
        multilis.AgregarEstudiante("Aritmetica", "Rolo");
        
        multilis.AgregarEstudiante("Ciencias", "Juan");
        multilis.AgregarEstudiante("Ciencias", "Rolo");
        multilis.AgregarEstudiante("Ciencias", "Carlos");
        multilis.AgregarEstudiante("Ciencias", "Alejandro");
        multilis.AgregarEstudiante("Ciencias", "william");
        multilis.mostrarMultiLista();
        
       
    } 
    
   
}
