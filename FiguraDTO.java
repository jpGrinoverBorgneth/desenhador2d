import java.awt.Color;

/**
 * Array de armazenamento dos objetos a ser desenhados
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo Mariano dos Santos
 * @author João Pedro Grinover Borgneth
 * @version 20230906
 */
public class FiguraDTO
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;
    
    private int esp;
    
    private String nome;
    
    private Color cor;
    
    private Color corS;
    
    private TipoPrimitivo tipo;
    
    FiguraDTO(int x1,int y1,String nome,int esp, Color cor, 
    TipoPrimitivo tipo)
    {
        setX1(x1); setY1(y1);
        setNome(nome);
        setEsp(esp);
        setCor(cor);
        setTipo(tipo);        
    }
    
    FiguraDTO(int x1,int y1, int x2, int y2,String nome,int esp, Color cor,
    TipoPrimitivo tipo)
    {
        setX1(x1); setY1(y1); setX2(x2); setY2(y2);
        setNome(nome);
        setEsp(esp);
        setCor(cor);
        setTipo(tipo);        
    }
    
    FiguraDTO(int x1,int y1, int x2, int y2,String nome,int esp, Color cor,Color corS, TipoPrimitivo tipo)
    {
        setX1(x1); setY1(y1); setX2(x2); setY2(y2);
        setNome(nome);
        setEsp(esp);
        setCor(cor);
        setCorS(corS);
        setTipo(tipo);        
    }
    
    FiguraDTO(int x1,int y1, int x2, int y2, int x3, int y3,String nome,
    int esp, Color cor, TipoPrimitivo tipo)
    {
        setX1(x1); setY1(y1); setX2(x2); setY2(y2);setX3(x3); setY3(y3);
        setNome(nome);
        setEsp(esp);
        setCor(cor);
        setTipo(tipo);      
    }
    
    public int getX1()
    {
        return x1;
    }
    public int getX2()
    {
        return x2;
    }
    public int getX3()
    {
        return x3;
    }
    public int getX4()
    {
        return x4;
    }
    
    private void setX1(int x)
    {
        this.x1 = x;
    }
    private void setX2(int x)
    {
        this.x2 = x;
    }
    private void setX3(int x)
    {
        this.x3 = x;
    }
    private void setX4(int x)
    {
        this.x4 = x;
    }
    
    public int getY1()
    {
        return y1;
    }
    public int getY2()
    {
        return y2;
    }
    public int getY3()
    {
        return y3;
    }
    public int getY4()
    {
        return y4;
    }
    
    private void setY1(int y)
    {
        this.y1 = y;
    }
    private void setY2(int y)
    {
        this.y2 = y;
    }
    private void setY3(int y)
    {
        this.y3 = y;
    }
    private void setY4(int y)
    {
        this.y4 = y;
    }
    
    public int getEsp()
    {
        return esp;
    }
    
    private void setEsp(int esp)
    {
        this.esp = esp;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    private void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public Color getCor()
    {
        return cor;
    }
    
    private void setCor(Color cor)
    {
        this.cor = cor;
    }
    
    public Color getCorS()
    {
        return corS;
    }
    
    private void setCorS(Color cor)
    {
        this.corS = cor;
    }
    
    public TipoPrimitivo getTipo()
    {
        return tipo; 
    }
    
    private void setTipo(TipoPrimitivo tipo)
    {
        this.tipo = tipo;
    }
}
