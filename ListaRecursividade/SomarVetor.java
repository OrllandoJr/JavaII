package recursividade;

import javax.swing.JOptionPane;
  
public class Soma {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho do vetor"));
        int v[] = new int[n];
        int i;
 
        for (i=0; i<n; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de: " + (i+1) + n));
        }
        
        JOptionPane.showMessageDialog(null,"A soma dos vetores é: "+ somarVetor(v, v.length));
    }
    
    static int somarVetor(int vetor[], int n) {
	    if (n==1)
		    return vetor[0];
	    else
		    return somarVetor(vetor, n-1) + vetor[n-1];
    }
}