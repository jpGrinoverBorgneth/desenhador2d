package figuraRC;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class FiguraRC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FiguraFiguraRC 
{    
    public static void desenharFiguraRC(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor1, Color cor2){
       FiguraRCGr f = new FiguraRCGr(x1, y1, x2, y2, cor1, cor2, nome, esp);
       f.desenharFiguraRC(g);
    }
}
