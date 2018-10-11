
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class AllQueens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        System.out.println("Numero de rainhas a colocar? ");
        int nr=stdin.nextInt();
        
        Queens q = new Queens (nr);
        q.colocaRainha();
    }
}
