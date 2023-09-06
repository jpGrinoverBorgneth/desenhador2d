package figuraRC;

import reta.Reta;
import ponto.Ponto;
import ponto.PontoGr;
import reta.RetaGr;
import retangulo.Retangulo;
import retangulo.RetanguloGr;
import circulo.Circulo;
import circulo.CirculoGr;
import Triangulo.Triangulo;
import Triangulo.TrianguloGr;

import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class FiguraGr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FiguraRCGr extends FiguraRC
{
    private Color cor = Color.BLACK;   // cor da reta
    private String nome = ""; // nome da reta
    private int esp = 1;

    public FiguraRCGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp) {
        super(x1, y1, x2, y2);
        setCor(cor);
        setNome(nome);
        setEsp(esp);
    }
    
    public void desenharFiguraRC(Graphics g){
        Ponto p1 = getP1();
        Ponto p2 = getP2();
        
        double deltaX = p2.getX() - p1.getX();
        //double deltaY = p1.getY() - p2.getY();
         
        Ponto p3 = new Ponto(p2.getX() - deltaX/2, p2.getY()+(int)(1.73205*deltaX/2));
        Ponto p4 = new Ponto(p3.getX() - deltaX, p3.getY());
        Ponto p5 = new Ponto(p1.getX() - deltaX, p1.getY());
        Ponto p6 = new Ponto(p3.getX(), p2.getY()-(int)(1.73205*deltaX/2));
        Ponto p7 = new Ponto(p4.getX(), p5.getY()-(int)(1.73205*deltaX/2));
        
        // RetanguloGr retanguloGrandeGr = new RetanguloGr((int)p2.getX(), (int)p2.getY(), (int)p4.getX(), (int)p4.getY(),cor, nome, esp);
        // RetaGr diagonal1Gr = new RetaGr((int)p2.getX(), (int)p2.getY(), (int)p4.getX(), (int)p4.getY(), cor, nome, esp);
        // RetaGr diagonal2Gr = new RetaGr((int)p3.getX(), (int)p3.getY(), (int)p5.getX(), (int)p5.getY(), cor, nome, esp);
        
        // TrianguloGr t1Gr = new TrianguloGr((int)p2.getX(), (int)p2.getY(), (int)p5.getX(), (int)p5.getY(), (int)p7.getX(), (int)p7.getY(), cor, nome, esp);
        // TrianguloGr t2Gr = new TrianguloGr((int)p3.getX(), (int)p3.getY(), (int)p4.getX(), (int)p4.getY(), (int)p6.getX(), (int)p6.getY(), cor, nome, esp);
        
        CirculoGr c1Gr = new CirculoGr((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY(), cor, nome, esp);
        CirculoGr c2Gr = new CirculoGr((int)p2.getX(), (int)p2.getY(), (int)p1.getX(), (int)p1.getY(), cor, nome, esp);
        CirculoGr c3Gr = new CirculoGr((int)p3.getX(), (int)p3.getY(), (int)p2.getX(), (int)p2.getY(), cor, nome, esp);
        CirculoGr c4Gr = new CirculoGr((int)p4.getX(), (int)p4.getY(), (int)p3.getX(), (int)p3.getY(), cor, nome, esp);
        CirculoGr c5Gr = new CirculoGr((int)p5.getX(), (int)p5.getY(), (int)p1.getX(), (int)p1.getY(), cor, nome, esp);
        CirculoGr c6Gr = new CirculoGr((int)p6.getX(), (int)p6.getY(), (int)p2.getX(), (int)p2.getY(), cor, nome, esp);
        CirculoGr c7Gr = new CirculoGr((int)p7.getX(), (int)p7.getY(), (int)p5.getX(), (int)p5.getY(), cor, nome, esp);
        
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        // System.out.println("p4: " + p4);
        // System.out.println("p5: " + p5);
        // System.out.println("p6: " + p6);
        // System.out.println("p7: " + p7);
        
        // diagonal1Gr.desenharReta(g);
        // diagonal2Gr.desenharReta(g);
        // retanguloGrandeGr.desenharRetangulo(g);
        // t1Gr.desenharTriangulo(g);
        // t2Gr.desenharTriangulo(g);
        c1Gr.desenharCirculo(g);
        c2Gr.desenharCirculo(g);
        c3Gr.desenharCirculo(g);
        c4Gr.desenharCirculo(g);
        c5Gr.desenharCirculo(g);
        c6Gr.desenharCirculo(g);
        c7Gr.desenharCirculo(g);
    }
    
    public Color getCor(){
            return this.cor;
    }
    
    public int getEsp(){
        return this.esp;
    }
    public String getNome(){
        return this.nome;
    }
    private void setCor(Color cor){
        this.cor = cor;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setEsp(int esp) {
        this.esp = esp;
    }
}
