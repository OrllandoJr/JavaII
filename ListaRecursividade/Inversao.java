package recursividade;

import javax.swing.JOptionPane;
  
public class Inversao {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero: "));
        JOptionPane.showMessageDialog(null,"O "+n+" invertido � " + inversao(n));
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