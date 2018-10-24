package recursividade;

import javax.swing.JOptionPane;
  
public class Fatorial {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para saber o fatorial:"));
        JOptionPane.showMessageDialog(null,"O fatorial de " + n + " é igual a: " + fatorial(n));
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }

    }
}