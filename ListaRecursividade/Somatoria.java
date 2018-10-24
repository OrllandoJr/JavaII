package recursividade;

import javax.swing.JOptionPane;
  
public class Somatoria {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero: "));
        JOptionPane.showMessageDialog(null,"A soma de 1 at� "+n+" � igual a " + somatoria(n));
    }

    static int somatoria(int num){
        if(num==1)
            return num;
        else
            return  num + somatoria(num - 1);
    }
}