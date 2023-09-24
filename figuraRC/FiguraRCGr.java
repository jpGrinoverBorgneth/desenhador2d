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
import javax.swing.JLabel;

import javax.swing.JColorChooser;
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
    private Color cor1 = Color.BLACK; 
    private Color cor2 = Color.BLACK;// cor da reta
    private String nome = ""; // nome da reta
    private int esp = 1;
    private JLabel msg = new JLabel("Msg: ");

    public FiguraRCGr(int x1, int y1, int x2, int y2, Color cor1, Color cor2, String nome, int esp) {
        super(x1, y1, x2, y2);
        setCor1(cor1);
        setCor2(cor2);
        setNome(nome);
        setEsp(esp);
    }
    
    public void desenharFiguraRC(Graphics g){
        Color c;
        Ponto p1 = getP1();
        Ponto pAux = getP2();
        Ponto p2 = new Ponto(pAux.getX(), p1.getY());
        double deltaX = p2.getX() - p1.getX();
        //double deltaY = p1.getY() - p2.getY();
         
        Ponto p3 = new Ponto(p2.getX() - deltaX/2, p2.getY()+(int)(1.73205*deltaX/2));
        Ponto p4 = new Ponto(p3.getX() - deltaX, p3.getY());
        Ponto p5 = new Ponto(p1.getX() - deltaX, p1.getY());
        Ponto p6 = new Ponto(p4.getX(), p5.getY()-(int)(1.73205*deltaX/2));
        Ponto p7 = new Ponto(p3.getX(), p2.getY()-(int)(1.73205*deltaX/2));
        
        Ponto p8 = new Ponto(p7.getX()+deltaX, p7.getY());
        Ponto p9 = new Ponto(p6.getX()-deltaX, p6.getY());
        Ponto p10 = new Ponto(p1.getX(), p1.getY()-(int)2*(1.73205*deltaX/2));
        
        Ponto p11 = new Ponto(p3.getX()+deltaX, p3.getY());
        Ponto p12 = new Ponto(p4.getX()-deltaX, p4.getY());
        Ponto p13 = new Ponto(p1.getX(), p1.getY()+(int)2*(1.73205*deltaX/2));
        // RetanguloGr retanguloGrandeGr = new RetanguloGr((int)p2.getX(), (int)p2.getY(), (int)p4.getX(), (int)p4.getY(),cor, nome, esp);
        // RetaGr diagonal1Gr = new RetaGr((int)p2.getX(), (int)p2.getY(), (int)p4.getX(), (int)p4.getY(), cor, nome, esp);
        // RetaGr diagonal2Gr = new RetaGr((int)p3.getX(), (int)p3.getY(), (int)p5.getX(), (int)p5.getY(), cor, nome, esp);
        
          
        TrianguloGr t1Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY(), cor1, nome, esp);
        //TrianguloGr t2Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY(), (int)p4.getX(), (int)p4.getY(), cor, nome, esp);
        TrianguloGr t3Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p5.getX(), (int)p5.getY(), (int)p4.getX(), (int)p4.getY(), cor1, nome, esp);
        TrianguloGr t4Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p5.getX(), (int)p5.getY(), (int)p6.getX(), (int)p6.getY(), cor1, nome, esp);
        TrianguloGr t5Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY(), (int)p7.getX(), (int)p7.getY(), cor1, nome, esp);
        TrianguloGr t6Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p3.getX(), (int)p3.getY(), (int)p4.getX(), (int)p4.getY(), cor1, nome, esp);
        TrianguloGr t7Gr = new TrianguloGr((int)p1.getX(), (int)p1.getY(), (int)p6.getX(), (int)p6.getY(), (int)p7.getX(), (int)p7.getY(), cor1, nome, esp);
        TrianguloGr t8Gr = new TrianguloGr((int)p8.getX(), (int)p8.getY(), (int)p9.getX(), (int)p9.getY(), (int)p10.getX(), (int)p10.getY(), cor1, nome, esp);
        TrianguloGr t9Gr = new TrianguloGr((int)p11.getX(), (int)p11.getY(), (int)p12.getX(), (int)p12.getY(), (int)p13.getX(), (int)p13.getY(), cor1, nome, esp);
        TrianguloGr t10Gr = new TrianguloGr((int)p8.getX(), (int)p8.getY(), (int)p11.getX(), (int)p11.getY(), (int)p2.getX(), (int)p2.getY(), cor1, nome, esp);
        TrianguloGr t11Gr = new TrianguloGr((int)p12.getX(), (int)p12.getY(), (int)p5.getX(), (int)p5.getY(), (int)p9.getX(), (int)p9.getY(), cor1, nome, esp);
        
        
        t1Gr.desenharTriangulo(g);
        //t2Gr.desenharTriangulo(g);
        t3Gr.desenharTriangulo(g);
        t4Gr.desenharTriangulo(g);
        t5Gr.desenharTriangulo(g);
        t6Gr.desenharTriangulo(g);
        t7Gr.desenharTriangulo(g);
        t8Gr.desenharTriangulo(g);
        t9Gr.desenharTriangulo(g);
        t10Gr.desenharTriangulo(g);
        t11Gr.desenharTriangulo(g);
            
        CirculoGr c1Gr = new CirculoGr((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY(), cor2, nome, esp);
        CirculoGr c2Gr = new CirculoGr((int)p2.getX(), (int)p2.getY(), (int)p1.getX(), (int)p1.getY(), cor2, nome, esp);
        CirculoGr c3Gr = new CirculoGr((int)p3.getX(), (int)p3.getY(), (int)p2.getX(), (int)p2.getY(), cor2, nome, esp);
        CirculoGr c4Gr = new CirculoGr((int)p4.getX(), (int)p4.getY(), (int)p3.getX(), (int)p3.getY(), cor2, nome, esp);
        CirculoGr c5Gr = new CirculoGr((int)p5.getX(), (int)p5.getY(), (int)p1.getX(), (int)p1.getY(), cor2, nome, esp);
        CirculoGr c6Gr = new CirculoGr((int)p6.getX(), (int)p6.getY(), (int)p5.getX(), (int)p5.getY(), cor2, nome, esp);
        CirculoGr c7Gr = new CirculoGr((int)p7.getX(), (int)p7.getY(), (int)p6.getX(), (int)p6.getY(), cor2, nome, esp);
        
        c1Gr.desenharCirculo(g);
        c2Gr.desenharCirculo(g);
        c3Gr.desenharCirculo(g);
        c4Gr.desenharCirculo(g);
        c5Gr.desenharCirculo(g);
        c6Gr.desenharCirculo(g);
        c7Gr.desenharCirculo(g);
        
        System.out.println("p1: " + p1); 
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);
        System.out.println("p7: " + p7);
    }
    
    public Color getCor1(){
        return this.cor1;
    }
    public Color getCor2(){
        return this.cor2;
    }
    public int getEsp(){
        return this.esp;
    }
    public String getNome(){
        return this.nome;
    }
    private void setCor1(Color cor){
        this.cor1 = cor;
    }
     private void setCor2(Color cor){
        this.cor2 = cor;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setEsp(int esp) {
        this.esp = esp;
    }
}
