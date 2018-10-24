package recursividade;

import javax.swing.JOptionPane;
  
public class Inversao {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));
        JOptionPane.showMessageDialog(null,"O "+n+" invertido é " + inversao(n));
    }

    static int inversao(int num) {
        if (num == 0) 
            return num;
         else 
            JOptionPane.showMessageDialog(null, num % 10);
            num = num / 10;
            return inversao(num);
    }
}