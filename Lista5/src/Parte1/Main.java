/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Tecnico t = new Tecnico(null, null);
        
        t.setMatricula(JOptionPane.showInputDialog(null, "Digite sua Matricula"));
        t.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
        
        System.out.println(t.getNome());
    }
    
}
