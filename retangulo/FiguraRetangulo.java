package retangulo;
import java.awt.Color;
import java.awt.Graphics;


/**
 * Escreva uma descrição da classe FiguraRetangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FiguraRetangulo
{
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, 
    int y2, String nome, int esp, Color cor){
       RetanguloGr t = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
       t.desenharRetangulo(g);
    }
}
