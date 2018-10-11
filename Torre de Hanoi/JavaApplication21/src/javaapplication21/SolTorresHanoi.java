/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SolTorresHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Numero de discos na torre de Hanoi? ");
        int n = stdin.nextInt();
        
        TorresHanoi t = new TorresHanoi();
        t.moverDiscos(n, 'A', 'C', 'B');
        t.escreveTotalMovimentos();
        
    }
}
