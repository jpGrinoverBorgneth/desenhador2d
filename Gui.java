import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.input.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
/**
 * Cria a interface com o usuario (GUI)
 * 
 * @author Julio Arakaki 
 * @version 20220815
 */
public class Gui extends JFrame{
    // Tipo Atual de primitivo
    private TipoPrimitivo tipoAtual = TipoPrimitivo.NENHUM;

    // Cor atual
    private Color corAtual = Color.BLACK;

    // Espessura atual do primitivo
    private int espAtual = 2;
    

    // Componentes de GUI
    // barra de menu (inserir componente)
    private JToolBar barraComandos = new JToolBar();

    // mensagens
    private JLabel msg = new JLabel("Msg: ");

    // Painel de desenho
    private PainelDesenho areaDesenho = new PainelDesenho(msg, tipoAtual, corAtual, 10);

    // Botoes
    private JButton jbPonto = new JButton("Ponto");
    private JButton jbReta = new JButton("Reta");
    private JButton jbCirculo = new JButton("Circulo");
    private JButton jbTriangulo = new JButton("Triangulo");
    private JButton jbRetangulo = new JButton("Retangulo");
    private JButton jbFiguraRc = new JButton("FiguraRC");
    private JButton jbRedesenhar = new JButton("Redesenhar");
    private JButton jbLimpar = new JButton("Limpar");
    private JButton jbResetar = new JButton("Resetar");
    private JButton jbDesfazer = new JButton("Desfazer");
    private JButton jbCor = new JButton("Cor");
    private JButton jbSair = new JButton("Sair");

    // Entrada (slider) para definir espessura dos primitivos
    private JLabel jlEsp = new JLabel("   Espessura: " + String.format("%-5s", 1));
    private JSlider jsEsp = new JSlider(1, 50, 1);

    /**
     * Constroi a GUI
     *
     * @param larg largura da janela
     * @param alt altura da janela
     */
    public Gui(int larg, int alt) {
        /**
         * Definicoes de janela
         */
        super("Testa Primitivos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(larg, alt);
        setVisible(true);
        setResizable(false);

        // Adicionando os componentes
        barraComandos.add(jbPonto);
        barraComandos.add(jbReta);
        barraComandos.add(jbCirculo);
        barraComandos.add(jbTriangulo);
        barraComandos.add(jbRetangulo);
        barraComandos.add(jbFiguraRc);
        barraComandos.add(jbRedesenhar);
        barraComandos.add(jbLimpar); // Botao de Limpar
        barraComandos.add(jbResetar);
        barraComandos.add(jbDesfazer);
        barraComandos.add(jbCor); // Botao de Cores

        barraComandos.add(jlEsp); // Label para espessura
        barraComandos.add(jsEsp);    // Slider para espacamento
        areaDesenho.setEsp(espAtual); // define a espessura inicial
        barraComandos.add(jbSair); // Botao de Cores

        // adiciona os componentes com os respectivos layouts
        add(barraComandos, BorderLayout.NORTH);                
        add(areaDesenho, BorderLayout.CENTER);                
        add(msg, BorderLayout.SOUTH);

        // Adiciona "tratador" ("ouvidor") de eventos para 
        // cada componente
        jbPonto.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.PONTO;
            areaDesenho.setTipo(tipoAtual);
        });        
        jbReta.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETA;
            areaDesenho.setTipo(tipoAtual);
        });        
        jbCirculo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.CIRCULO;
            areaDesenho.setTipo(tipoAtual);
        });  
        jbTriangulo.addActionListener( e -> {
            tipoAtual = TipoPrimitivo.TRIANGULO;
            areaDesenho.setTipo(tipoAtual);
        });
        jbRetangulo.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RETANGULO;
            areaDesenho.setTipo(tipoAtual);
        });
        jbFiguraRc.addActionListener (e->{
            Color corT = null, corC = null;
            Color c = JColorChooser.showDialog(null, "Escolha uma cor para os Triangulos", msg.getForeground()); 
            if (c != null){ 
                corT = c; // pega do chooserColor 
            }
             c = JColorChooser.showDialog(null, "Escolha uma cor para os Circulos", msg.getForeground()); 
            if (c != null){ 
                corC = c; // pega do chooserColor 
            }
            tipoAtual = TipoPrimitivo.FIGURARC;
            areaDesenho.setCorAtual(corT);
            areaDesenho.setCorSecundaria(corC);
            areaDesenho.setTipo(tipoAtual);
        });
        jbRedesenhar.addActionListener(e->{
            tipoAtual = TipoPrimitivo.REDESENHAR;
            areaDesenho.setTipo(tipoAtual);
            repaint();
        });
        jbLimpar.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.LIMPAR;
            areaDesenho.setTipo(tipoAtual);   
            repaint();
        }); 
        jbResetar.addActionListener(e -> {
            tipoAtual = TipoPrimitivo.RESETAR;
            areaDesenho.setTipo(tipoAtual);
            repaint();
        });
        jbCor.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Escolha uma cor", msg.getForeground()); 
            if (c != null){ 
                corAtual = c; // pega do chooserColor 
            }
            areaDesenho.setCorAtual(corAtual); // cor atual
        });  
        jsEsp.addChangeListener(e -> {
            espAtual = jsEsp.getValue();
            jlEsp.setText("   Espessura: " + String.format("%-5s", espAtual));
            areaDesenho.setEsp(espAtual);        
        });        
        jbSair.addActionListener(e -> {
            System.exit(0);
        }); 
        jbDesfazer.addActionListener(e -> {
           tipoAtual = TipoPrimitivo.DESFAZER;
           areaDesenho.setTipo(tipoAtual);
           repaint();
        }); 
    }
    
}
