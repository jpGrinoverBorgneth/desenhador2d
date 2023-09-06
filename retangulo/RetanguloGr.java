package retangulo;
import ponto.Ponto;
import reta.RetaGr;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Escreva uma descrição da classe RetanguloGr aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class RetanguloGr extends Retangulo
{
  Color cor = Color.BLACK;   // cor da reta
  String nome = ""; // nome da reta
  int esp = 1;
  
  public RetanguloGr(int x1, int y1, int x2, int y2,Color cor, 
  String nome, int esp){
      super(x1, y1, x2, y2);
      setCor(cor);
      setNome(nome);
      setEsp(esp);
  }
  private void setCor(Color cor)
  {
      this.cor = cor;
  }
  private void setNome(String nome)
  {
      this.nome = nome;
  }
  private void setEsp(int esp)
  {
      this.esp = esp;
  }
  public void desenharRetangulo(Graphics g)
  {
      RetaGr reta;
      
      reta = new RetaGr(
      (int)r1.getP1().getX(), (int)r1.getP1().getY(),
      (int)r1.getP2().getX(), (int)r1.getP2().getY(), cor, esp
      );
      reta.desenharReta(g);
      
      reta = new RetaGr(
      (int)r2.getP1().getX(), (int)r2.getP1().getY(),
      (int)r2.getP2().getX(), (int)r2.getP2().getY(), cor, esp
      );
      reta.desenharReta(g);
      
      reta = new RetaGr(
      (int)r3.getP1().getX(), (int)r3.getP1().getY(),
      (int)r3.getP2().getX(), (int)r3.getP2().getY(), cor, esp
      );
      reta.desenharReta(g);
      
      reta = new RetaGr(
      (int)r4.getP1().getX(), (int)r4.getP1().getY(),
      (int)r4.getP2().getX(), (int)r4.getP2().getY(), cor, esp
      );
      reta.desenharReta(g);
  }
}
