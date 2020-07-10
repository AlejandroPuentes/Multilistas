/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Multilista {
    Materias cab;
    
    
    Multilista(){
        cab=null;
       
    }
    
    public boolean agregarMateria(String nombreMa){
        if (revisar(nombreMa)==true){// revisa si no existe la materia a agregar 
            Materias asigna = new Materias(nombreMa);
            if(cab==null){// en caso de que no haya materias inscritas
                cab=asigna;
                return true;
            }else{
                Materias aux= cab; 
                if (nombreMa.compareTo(aux.Nombre)<0){ //si la materia a insertar va antes de la cabeza 
                    asigna.sig = aux;
                    cab=asigna;
                    return true;
                }
                while(aux.sig!=null){//recorre la lista para agregar las materias 
                    if(aux.sig.Nombre.compareTo(nombreMa)>0){ // analiza si el siguiente va despues que la materia a ingresar
                        asigna.sig=aux.sig;
                        aux.sig=asigna;
                        return true;
                    }
                    aux = aux.sig;
                }
                aux.sig=asigna;// el ultimo caso cuando la materia se agrega al final
                return true;
            }
        }else{
            System.out.println("La materia ya existe");
            return false;
        }
    }
    
    
    //busca en las listas si la parametro (materia o estudiante) que se le paso ya estan en la listas
    boolean revisar(String mat){
        Materias q = cab;
        boolean estado=true;
        while (q!=null){
            if (mat.equals(q.Nombre)){
                estado= false;
                return estado;
            }
            q=q.sig;
        }
        return estado;
    }
    // quita la materia que se le pase por paremetro de la lista
    public void QuitarMateria(String nombreMa){
        Materias q = cab;
        Materias estado = null;
        int conta=0;
        while (q!=null){
            if (cab.Nombre.equals(nombreMa)){
                cab=cab.sig;
                
            }else{              
                if(q.Nombre.equals(nombreMa)){
                    estado.sig=q.sig;                  

                }else{
                    estado=q;
                }
            }
           
            q=q.sig;
        }
    }
    //busca la materia dentor de la lista de materias para agreagra un estudiante
    public Materias buscarMateria(String info) {
        Materias materia = cab;
        try {
            while (materia != null) {
                if (materia.Nombre.equalsIgnoreCase(info)) {
                    return materia;
                }
                materia = materia.sig;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    
    //agrega los estudiantes a la materia selecionada de la lista 
    
    // william 
    public boolean AgregarEstudiante(String Materia, String NombreEstudiante) {

        try {
            Materias Mate = buscarMateria(Materia);
            
            if (Mate != null) {
                
                if (revisarEstudiante(Mate,NombreEstudiante)==true){
                   Estudiante estudianteNuevo = new Estudiante(NombreEstudiante);

                if (Mate.abajo == null)//Lo utilizamos para el caso de que no tenga Estudiantes Resgistrados
                {
                    Mate.abajo=estudianteNuevo;
                    return true;
                } else //como hay estudiantes,lo debemos agregar al final
                {
                    Estudiante estudiante = Mate.abajo;
                    if (NombreEstudiante.compareTo(Mate.abajo.Nombre_ES)<0){ //si la materia a insertar va antes de la cabeza 
                        estudianteNuevo.abajo = estudiante;
                        Mate.abajo=estudianteNuevo;
                        return true;
                    }
                    while(estudiante.abajo!=null){//recorre la lista para agregar las materias 
                        if(estudiante.abajo.Nombre_ES.compareTo(NombreEstudiante)>0){ // analiza si el siguiente va despues que la materia a ingresar
                            estudianteNuevo.abajo=estudiante.abajo;
                            estudiante.abajo=estudianteNuevo;
                            return true;
                        }
                        estudiante = estudiante.abajo;
                    }
                    estudiante.abajo=estudianteNuevo;// el ultimo caso cuando la materia se agrega al final
                    return true;
                } 
                }else{
                    JOptionPane.showMessageDialog(null, "El estudiante ya existe.");
                    return false;
                }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia a ingresar el estudiante.");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    boolean revisarEstudiante(Materias mat, String estudiante){
        Estudiante q = mat.abajo;
        boolean estado=true;
        while (q!=null){
            if (estudiante.equals(q.Nombre_ES)){
                estado= false;
                return estado;
            }
            q=q.abajo;
        }
        return estado;
    }
    //quita el estudiante pasado por parametro de la materia seleccionada
    // william
    void QuitarEstudiante(String materia,String estudiante){
        Estudiante estado = null;
    try {

            Materias Mate = buscarMateria(materia);
            Estudiante q = Mate.abajo;
            if (q != null) {
                    while (q != null) {           
                            if(q.Nombre_ES.equals(estudiante)){
                                estado.abajo=q.abajo;                  
                            }else{
                                estado=q;
                             }
                            q=q.abajo;
                    }       
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia a ingresar el estudiante.");
            }
        }catch (Exception e) {
        }
    }
    
    //muestra el contenido las materias con sus repectivos alumnos
    public void mostrarMultiLista() {

        try {
            Materias Mat = cab;
            while (Mat != null) {
                System.out.println(Mat.Nombre);

                Estudiante estu = Mat.abajo;

                if (estu != null)//Lo utilizamos para el caso de que no estudiantes inscritos
                {
                    while (estu != null) {
                        System.out.println(" - " + estu.Nombre_ES);
                        estu = estu.abajo;
                    }
                }
                Mat = Mat.sig;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void mostrar (){
        Materias q =cab;
        while(q!=null){
            System.out.println(q.Nombre);
            q=q.sig;
        }
    }
    
}
