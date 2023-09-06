package Triangulo;
import reta.Reta;
import ponto.Ponto;
import java.awt.Color;

/**
 * Escreva uma descrição da classe Triangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Triangulo
{
    public Reta r1, r2, r3;
    
    public Triangulo(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        setRetas(x1, y1, x2, y2, x3, y3);
    }
    
    public void setRetas(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Ponto p3 = new Ponto(x3, y3);
        
        setR1(p1, p2);
        setR2(p2, p3);
        setR3(p3, p1);        
    }
    public void setR1(Ponto p1, Ponto p2)
    {
        this.r1 = new Reta(p1, p2);
    }
    public void setR2(Ponto p1, Ponto p2)
    {
        this.r2 = new Reta(p1, p2);
    }
    public void setR3(Ponto p1, Ponto p2)
    {
        this.r3 = new Reta(p1, p2);
    }
}
