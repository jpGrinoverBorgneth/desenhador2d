package triangulo;
import reta.RetaGr;
import java.awt.Color;

/**
 * Escreva uma descrição da classe Triangulo aqui.
 *
 * @author (seu nome)
 * @version (um número da versão ou uma data)
 */
public class Triangulo
{
    public RetaGr r1, r2, r3;

    public Triangulo(int x1,int y1,int x2,int y2,int x3,int y3,Color cor, int esp)
    {
        setR1(new RetaGr(x1, y1, x2, y2,cor,esp));
        setR2(new RetaGr(x2, y2, x3, y3,cor,esp));
        setR3(new RetaGr(x3, y3, x1, y1,cor,esp));
    }

    public void setR1(RetaGr reta)
    {
        this.r1 = reta;
    }
    public void setR2(RetaGr reta)
    {
        this.r2 = reta;
    }
    public void setR3(RetaGr reta)
    {
        this.r3 = reta;
    }
}
