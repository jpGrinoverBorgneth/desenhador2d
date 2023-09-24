package circulo;
import java.awt.Color;
import java.awt.Graphics;

public class FiguraCirculo{
    public static void desenharCirculo(Graphics g, int x1, int y1, int x2, 
    int y2, String nome, int esp, Color cor){
        CirculoGr circulo = new CirculoGr(x1, y1, x2, y2, cor, nome, esp);
        circulo.desenharCirculo(g);
    }
}