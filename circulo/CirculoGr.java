package circulo;


import reta.Reta;
import ponto.Ponto;
import ponto.PontoGr;
import reta.RetaGr;
import java.awt.Color;
import java.awt.Graphics;

public class CirculoGr extends Circulo {
    private Color cor = Color.BLACK;   // cor da reta
    private String nome = ""; // nome da reta
    private int esp = 1;

    public CirculoGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp) {
        super(x1, y1, x2, y2);
        setCor(cor);
        setNome(nome);
        setEsp(esp);
    }

    public void desenharCirculo(Graphics g){
        double x,y;
        Ponto centro = this.getPontoCentro();
        Reta raio = this.getRaio();

        //calculo do modulo do raio
        double deltaX = this.getPontoRaioInicio().getX() - this.getPontoRaioFim().getX();
        double deltaY = this.getPontoRaioInicio().getY() - this.getPontoRaioFim().getY();
        
        double distRaio = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
        
        //algoritmo para determinar pontos do circulo
        for(double angulo=0; angulo<=360; angulo++){
            x = centro.getX() + distRaio * Math.cos(angulo); 
            y = centro.getY() + distRaio * Math.sin(angulo);
            
            PontoGr ponto = new PontoGr((int)x,(int)y, this.getCor(), this.getEsp());
            ponto.desenharPonto(g);
        }
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
