package triangulo;
import java.awt.Color;
import java.awt.Graphics;

//import reta.RetaGr;

/**
 * Escreva uma descrição da classe TrianguloGr aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TrianguloGr extends Triangulo
{
    Color corTriangulo = Color.BLACK;   // cor da reta
    String nomeTriangulo = ""; // nome da reta
    Color corNomeTriangulo  = Color.BLACK;
    int espTriangulo = 1; // espessura da reta
    public TrianguloGr(int x1, int y1, int x2, int y2,int x3, int y3, Color cor, String nome, int esp){
        super (x1, y1, x2, y2, x3, y3,cor,esp);
        setCorTriangulo(cor);
        setNomeTriangulo(nome);
        setEspTriangulo(esp);
    }

    public void setCorTriangulo(Color cor)
    {
        this.corTriangulo = cor;
    }
    public void setNomeTriangulo(String nome)
    {
        this.nomeTriangulo = nome;
    }
    public void setEspTriangulo(int esp)
    {
        this.espTriangulo = esp;
    }
    public void desenharTriangulo(Graphics g)
    {
        r1.desenharReta(g);
        r2.desenharReta(g);
        r3.desenharReta(g);
    }
}
