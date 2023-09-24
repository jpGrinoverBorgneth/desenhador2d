import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ponto.FiguraPontos;
import reta.FiguraRetas;
import Triangulo.FiguraTriangulo;
import retangulo.FiguraRetangulo;
import figuraRC.FiguraFiguraRC;

import circulo.FiguraCirculo;
/**
 * Cria desenhos de acordo com o tipo e eventos do mouse
 * 
 * @author Matheus Ferreira dos Santos Silvestre
 * @author João Murilo de Amorim Mariano Santos
 * @author João Pedro Grinover Borgneth
 * @version 20230906
 */
public class PainelDesenho extends JPanel implements MouseListener, 
MouseMotionListener {
    Graphics g;
    JLabel msg;           // Label para mensagens
    TipoPrimitivo tipo; // Tipo do primitivo
    Color corAtual;  
    Color corSecundaria;// Cor atual do primitivo
    
    ArrayList<FiguraDTO> figuras = new ArrayList<FiguraDTO>();
    ArrayList<FiguraDTO> listaFigAux = new ArrayList<FiguraDTO>();
    
    int esp;              // Diametro do ponto
    
    // Para ponto
    int x, y;

    // Para reta, triangulo e retangulo
    int x1, y1, x2, y2, x3, y3, x4, y4;
    
    

    // selecionar primeiro click do mouse
    boolean primeiraVez = true;
    boolean segundaVez = true;
    boolean terceiraVez = true;


    /**
     * Constroi o painel de desenho
     *
     * @param msg mensagem a ser escrita no rodape do painel
     * @param tipo tipo atual do primitivo
     * @param corAtual cor atual do primitivo
     * @param esp espessura atual do primitivo
     */
    public PainelDesenho(JLabel msg, TipoPrimitivo tipo, Color corAtual, 
    int esp){
        setTipo(tipo);
        setMsg(msg);
        setCorAtual(corAtual);
        setEsp(esp);

        // Adiciona "ouvidor" de eventos de mouse
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }
    
    /**
     * Altera o tipo atual do primitivo
     *
     * @param tipo tipo do primitivo
     */
    public void setTipo(TipoPrimitivo tipo){
        this.tipo = tipo;
    }

    /**
     * Retorna o tipo do primitivo
     *
     * @return tipo do primitivo
     */
    public TipoPrimitivo getTipo(){
        return this.tipo;
    }

    /**
     * Altera a espessura do primitivo
     *
     * @param esp espessura do primitivo
     */
    public void setEsp(int esp){
        this.esp = esp;
    }

    /**
     * Retorna a espessura do primitivo
     *
     * @return espessura do primitivo
     */
    public int getEsp(){
        return this.esp;
    }

    /**
     * Altera a cor atual do primitivo
     *
     * @param corAtual cor atual do primitivo
     */
    public void setCorAtual(Color corAtual){
        this.corAtual = corAtual;
    }
    
    public void setCorSecundaria(Color cor)
    {
        this.corSecundaria = cor;
    }

    /**
     * retorna a cor atual do primitivo
     *
     * @return cor atual do primitivo
     */
    public Color getCorAtual(){
        return this.corAtual;
    }
    
    public Color getCorSecundaria()
    {
        return this.corSecundaria;
    }

    /**
     * Altera a msg a ser apresentada no rodape
     *
     * @param msg mensagem a ser apresentada
     */
    public void setMsg(JLabel msg){
        this.msg = msg;
    }

    /**
     * Retorna a mensagem
     *
     * @return mensagem as ser apresentada no rodape
     */
    public JLabel getMsg(){
        return this.msg;
    }

    /**
     * Metodo chamado quando o paint eh acionado
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void paintComponent(Graphics g) {   
        desenharPrimitivos(g);
    }
    
    /**
     * Evento: pressionar do mouse
     *
     * @param e dados do evento
     */
    public void mousePressed(MouseEvent e) { 
        Graphics g = getGraphics();  
        if (tipo == TipoPrimitivo.PONTO){
            x = e.getX();
            y = e.getY();
            paint(g);
        } else if (tipo == TipoPrimitivo.RETA){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        } else if (tipo == TipoPrimitivo.TRIANGULO) {
            if(primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else if(segundaVez == true){
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                segundaVez = false;
            } else{
                x3 = (int)e.getX();
                y3 = (int)e.getY();
                primeiraVez = true;
                segundaVez = true;
                paint(g);
            }
        } else if (tipo == TipoPrimitivo.RETANGULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        } else if (tipo ==TipoPrimitivo.CIRCULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        } else if (tipo==TipoPrimitivo.FIGURARC){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                paint(g);
            }
        }     
    }
    
    public void mouseReleased(MouseEvent e) { 
    }           

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    /**
     * Evento mouseMoved: escreve mensagem no rodape (x, y) do mouse
     *
     * @param e dados do evento do mouse
     */
    public void mouseMoved(MouseEvent e) {
        this.msg.setText("("+e.getX() + ", " + e.getY() + ") - " + getTipo());
    }

    /**
     * Desenha os primitivos
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void desenharPrimitivos(Graphics g){
        FiguraDTO figura;
        if (tipo == TipoPrimitivo.PONTO){
            figura = new FiguraDTO(x, y, "", getEsp(), getCorAtual(), tipo);
            figuras.add(figura);
            FiguraPontos.desenharPonto(g, x, y, "", getEsp(), getCorAtual());
            //FiguraPontos.desenharPontos(g, 50, 20);
        }

        if (tipo == TipoPrimitivo.RETA){
            figura = new FiguraDTO(x1, y1, x2, y2, "", getEsp(), 
            getCorAtual(), tipo);
            figuras.add(figura);
            FiguraRetas.desenharReta(g, x1, y1, x2, y2, "", getEsp(), 
            getCorAtual());
            //FiguraRetas.desenharRetas(g, 10, 3);
        }

        if (tipo==TipoPrimitivo.CIRCULO){
            System.out.println("criando circulo...");
            figura = new FiguraDTO(x1, y1, x2, y2, "", getEsp(), 
            getCorAtual(), tipo);
            figuras.add(figura);
            FiguraCirculo.desenharCirculo(g, x1, y1, x2, y2, "", 
            getEsp(), getCorAtual());
        }
        
        if (tipo == TipoPrimitivo.TRIANGULO){
            figura = new FiguraDTO(x1, y1, x2, y2, x3, y3, "", getEsp(), 
            getCorAtual(), tipo);
            figuras.add(figura);
            FiguraTriangulo.desenharTriangulo(g, x1, y1,x2,y2,x3,y3,"", 
            getEsp(), getCorAtual());
        }
        
        if (tipo == TipoPrimitivo.RETANGULO){
            figura = new FiguraDTO(x1, y1, x2, y2, "", getEsp(), 
            getCorAtual(), tipo);
            figuras.add(figura);
            FiguraRetangulo.desenharRetangulo(g, x1, y1, x2, y2, "", 
            getEsp(), getCorAtual());
        }
        
        if (tipo == TipoPrimitivo.FIGURARC){
            figura = new FiguraDTO(x1, y1, x2, y2, "", getEsp(), 
            getCorAtual(), getCorSecundaria(), tipo);
            figuras.add(figura);
            FiguraFiguraRC.desenharFiguraRC(g, x1, y1, x2, y2, "", 
            getEsp(), getCorAtual(), getCorSecundaria());
        }
        
        if(tipo == TipoPrimitivo.REDESENHAR){
            desenharLista(g);
        }
        
        if(tipo == TipoPrimitivo.LIMPAR || tipo == TipoPrimitivo.RESETAR){
            limpar(g);
            if(tipo == TipoPrimitivo.RESETAR) {
                figuras.clear();
            }
        }
        
        if(tipo == TipoPrimitivo.DESFAZER)
        {
            
        }
    }
    
    public void desenharLista(Graphics g)
    {
        for(int i = 0; i < figuras.size(); i++)
        {
            if(figuras.get(i).getTipo() == TipoPrimitivo.PONTO)
            {
                FiguraPontos.desenharPonto(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(), figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor());
            }
            if (figuras.get(i).getTipo() == TipoPrimitivo.RETA)
            {
                FiguraRetas.desenharReta(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(),figuras.get(i).getX2(), 
                figuras.get(i).getY2(),figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor());
            }
            if (figuras.get(i).getTipo() == TipoPrimitivo.CIRCULO)
            {
                FiguraCirculo.desenharCirculo(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(),figuras.get(i).getX2(), 
                figuras.get(i).getY2(),figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor());
            }
            if (figuras.get(i).getTipo() == TipoPrimitivo.RETANGULO)
            {
                FiguraRetangulo.desenharRetangulo(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(),figuras.get(i).getX2(), 
                figuras.get(i).getY2(),figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor());
            }
            if (figuras.get(i).getTipo() == TipoPrimitivo.FIGURARC)
            {
                FiguraFiguraRC.desenharFiguraRC(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(),figuras.get(i).getX2(), 
                figuras.get(i).getY2(),figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor(), figuras.get(i).getCorS());
            }
            if (figuras.get(i).getTipo() == TipoPrimitivo.TRIANGULO)
            {
                FiguraTriangulo.desenharTriangulo(g, figuras.get(i).getX1(),
                figuras.get(i).getY1(),figuras.get(i).getX2(), 
                figuras.get(i).getY2(), figuras.get(i).getX3(),
                figuras.get(i).getY3(), figuras.get(i).getNome(),
                figuras.get(i).getEsp(), figuras.get(i).getCor());
            }
        }
    }
    
    public void limpar(Graphics g)
    {
        g.setColor(new Color(238,238,238,255));
        g.fillRect(0,0,1000,1000);
    }
}
