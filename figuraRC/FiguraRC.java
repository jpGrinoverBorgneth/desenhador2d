package figuraRC;
import ponto.Ponto;
import reta.Reta;

/**
 * Classe de construção da FiguraRC
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo de Amorim Mariano Santos 
 * @author João Pedro Grinover Borgneth
 * @version (a version number or a date)
 */
public class FiguraRC
{
    private Ponto p1;
    private Ponto p2;
    private Reta reta;

    /**
     * Constructor for objects of class Figura
     */
    public FiguraRC(int x1, int y1, int x2, int y2)
    {
        setP1(x1,y1);
        setP2(x2,y2);
        setReta(this.p1,this.p2);
    }

    /**
     * Getters dos pontos da Figura RC
     *
     * @return O valor de retorno
     */
    public Ponto getP1(){
        return this.p1;
    }
    
    public Ponto getP2(){
        return this.p2;
    }
    
    public Reta getReta(){
        return this.reta;
    }

    /**
     * Setters dos pontos da FiguraRC
     */
    private void setP1(int x, int y)
    {
        this.p1 = new Ponto(x,y);
    }
    
    private void setP2(int x, int y)
    {
        this.p2 = new Ponto(x,y);
    }
    
    private void setReta(Ponto p1, Ponto p2){
        this.reta = new Reta(p1,p2);
    }
    
}
