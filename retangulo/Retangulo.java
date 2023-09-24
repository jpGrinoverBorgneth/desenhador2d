package retangulo;
import ponto.Ponto;
import reta.Reta;

/**
 * Metodo de construção do retangulo
 * 
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo de Amorim Mariano Santos
 * @author João Pedro Grinover Borgneth
 * @version 20230906
 */
public class Retangulo
{
    public Reta r1, r2, r3, r4;
    
    public Retangulo(int x1, int y1, int x2, int y2){
        setRetas(x1, y1, x2, y2);
    }
    
    private void setRetas(int x1, int y1, int x2, int y2){
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Ponto p3 = new Ponto(x1, y2);
        Ponto p4 = new Ponto(x2, y1);
        
        setR1(p1, p3);
        setR2(p3, p2);
        setR3(p2, p4);
        setR4(p4, p1);
    }
    
    /**
     * Setters dos pontos do retangulo
     */
    private void setR1(Ponto p1, Ponto p2) {
        this.r1 = new Reta(p1, p2);
    }
    
    private void setR2(Ponto p1, Ponto p2) {
        this.r2 = new Reta(p1, p2);
    }
    
    private void setR3(Ponto p1, Ponto p2){
        this.r3 = new Reta(p1, p2);
    }
    
    private void setR4(Ponto p1, Ponto p2){
        this.r4 = new Reta(p1, p2);
    }
}
