/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Canvitas implements Runnable {
    private Pantallita panta;
    private Thread Hilo;
    boolean Estado = true;
    
    
    public Canvitas (Pantallita ven){
        this.panta=ven;
    }
    
    @Override
    public void run() {
        try {
            Animar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Canvitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciar() {
        Hilo = new Thread(this);
        Hilo.start();

    }

    public void Animar() throws InterruptedException {

        while (Estado) {
            dibujar();
            Hilo.sleep(60);
        }

    }

    private void dibujar() {  
        BufferedImage DobleBufer=new BufferedImage(panta.getGraficaListas().getWidth(), panta.getGraficaListas().getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics lapiz = DobleBufer.getGraphics();
        try {
            
            int x = 10;
            int y = 10;

            Materias Mat = panta.getMulti().cab;
            while (Mat != null) {
                Graficos.dibujar(lapiz, x, y, Mat.Nombre);
                if (Mat.sig != null) {
                    Graficos.dibujarlineah(lapiz, x, y);
                }

                Estudiante estu = Mat.abajo;

                if (estu != null)//Lo utilizamos para el caso de que no estudiantes inscritos
                {
                    Graficos.dibujarlineav(lapiz, x, y);
                    while (estu != null) {
                        y += 50;
                        Graficos.dibujar(lapiz, x, y, estu.Nombre_ES);
                        if (estu.abajo != null) {
                            Graficos.dibujarlineav(lapiz, x, y);
                        }
                        estu = estu.abajo;
                    }
                }
                Mat = Mat.sig;

                x += 150;
                y = 10;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        panta.getGraficaListas().getGraphics().drawImage(DobleBufer, 0, 0, panta.getGraficaListas());
        panta.getGraficaListas().getGraphics().dispose();
    }

}
