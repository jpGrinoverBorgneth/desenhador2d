package Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import reta.RetaGr;
import ponto.Ponto;

/**
 * Escreva uma descrição da classe TrianguloGr aqui.
 * 
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Pedro Grinover Borgneth
 * @author João Murilo de Amorim Mariano Santos
 * @version 20230906
 */
public class TrianguloGr extends Triangulo
{
  Color corTriangulo = Color.BLACK;   // cor da reta
  String nomeTriangulo = ""; // nome da reta
  int espTriangulo = 1; // espessura da reta
  public TrianguloGr(int x1, int y1, int x2, int y2,int x3, int y3, Color cor, 
  String nome, int esp){
        super (x1, y1, x2, y2, x3, y3);
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
      RetaGr reta;
      
      reta = new RetaGr(
      (int)r1.getP1().getX(), (int)r1.getP1().getY(),
      (int)r1.getP2().getX(), (int)r1.getP2().getY(), corTriangulo, espTriangulo
      );
      reta.desenharReta(g);
      
      reta = new RetaGr(
      (int)r2.getP1().getX(), (int)r2.getP1().getY(),
      (int)r2.getP2().getX(), (int)r2.getP2().getY(),corTriangulo, espTriangulo
      );
      reta.desenharReta(g);
      
      reta = new RetaGr(
      (int)r3.getP1().getX(), (int)r3.getP1().getY(),
      (int)r3.getP2().getX(), (int)r3.getP2().getY(),corTriangulo, espTriangulo
      );
      reta.desenharReta(g);
  }
}
