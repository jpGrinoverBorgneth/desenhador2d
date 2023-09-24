package Triangulo;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Escreva uma descrição da classe FiguraTriangulo aqui.
 * 
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murlo de Amorim Mariano Santos
 * @author João Pedro Grinover Borgneth
 * @version 20230906
 */
public class FiguraTriangulo
{
    public static void desenharTriangulo(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, String nome, int esp, Color cor){
       TrianguloGr t = new TrianguloGr(x1, y1, x2, y2,x3,y3, cor, nome, esp);
       t.desenharTriangulo(g);
    }
}

