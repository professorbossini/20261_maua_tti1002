/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.maua.maua_sub2_hello_swing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloSwing {
    
    public static void criarTela(){
        JFrame tela = new JFrame("Hello, Swing!!!");
        JLabel helloSwingLabel = new JLabel("Hello, Swing!!!");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(helloSwingLabel);
        tela.pack();
        tela.setVisible(true);
        
    }

    public static void main(String[] args) {
        criarTela();
    }
}
