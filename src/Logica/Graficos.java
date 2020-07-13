package Logica;

import java.awt.Color;
import java.awt.Graphics;

public class Graficos{
    
    public static void dibujar(Graphics g, int x, int y, String palabra){
        g.setColor(Color.red);
        g.drawRect(x, y, 100, 20);
        g.drawString(palabra, x+5, y+15); 
    }
    
    public static void dibujarlineav(Graphics g, int x, int y){
        g.setColor(Color.red);
        g.drawLine(x+50, y+25, x+50, y+45);
        g.drawString("v", x+48, y+44);
    }
    
    public static void dibujarlineah(Graphics g, int x, int y){
        g.setColor(Color.red);
        g.drawLine(x+115, 20, x+135, 20);
        g.drawString(">", x+133, 25);
    }

}
