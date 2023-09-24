package circulo;

import ponto.Ponto;
import reta.Reta;

/**
 * Metodo de construção do Circulo
 * 
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo de Amorim Mariano Santos
 * @author João Pedro Grinover Borgneth
 * @version 20230906
 */
public class Circulo {
    private Ponto raioInicio, raioFim;
    private Ponto centro;
    private Reta raio;

    public Circulo(int x1, int y1, int x2, int y2) {
        setCentro(x1,y1);
        setCoordenadasRaio(x1, y1, x2, y2);
        setRaio(x1, y1, x2, y2);
    }

    public Ponto getPontoCentro(){
        return this.centro;
    }

    public Ponto getPontoRaioFim(){
        return this.raioFim;
    }

    public Ponto getPontoRaioInicio(){
        return this.raioInicio;
    }

    public Reta getRaio(){
        return this.raio;
    }
    
    private void setCentro(int x, int y){
        this.centro = new Ponto(x,y);
    }
    
    private void setCoordenadasRaio(int x1, int y1, int x2, int y2){
        this.raioInicio = new Ponto(x1, y1);
        this.raioFim = new Ponto(x2, y2);
    }

    private void setRaio(int x1, int y1, int x2, int y2){
        this.raio = new Reta (x1, y1, x2, y2);
    }
}
