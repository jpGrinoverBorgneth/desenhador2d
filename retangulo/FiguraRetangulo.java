package retangulo;
import java.awt.Color;
import java.awt.Graphics;


/**
 * Escreva uma descri��o da classe FiguraRetangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class FiguraRetangulo
{
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, 
    int y2, String nome, int esp, Color cor){
       RetanguloGr t = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
       t.desenharRetangulo(g);
    }
}
