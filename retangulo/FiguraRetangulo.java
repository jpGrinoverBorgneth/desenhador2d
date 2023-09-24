package retangulo;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Classe de desenho do Retangulo
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo de Amorim Mariano Santos
 * @author João Pedro Grinover Borgneth
 * 
 * @version 20230906
 */
public class FiguraRetangulo
{
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, 
    int y2, String nome, int esp, Color cor){
       RetanguloGr t = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
       t.desenharRetangulo(g);
    }
}
