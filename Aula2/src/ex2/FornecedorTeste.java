package ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class FornecedorTeste {
    
    public static void main (String[] args){
        
    Fornecedor f = new Fornecedor(0, 0, null, null, 0, 0);
    
    f.setNome(JOptionPane.showInputDialog(null, "Digite o nome: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE));
    f.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE)));
    f.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE)));
    f.setSexo(JOptionPane.showInputDialog(null, "Digite o sexo: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE));
    f.setCreditoMaximo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o crédito máximo: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE)));
    f.setValorEmDivida(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em divida: ","FORNECEDOR",JOptionPane.PLAIN_MESSAGE)));
    
    JOptionPane.showMessageDialog(null, "FORNECEDOR\n"+
            "Nome: "+f.getNome()+
            "\nIdade: "+f.getIdade()+
            "\nAltura: "+f.getAltura()+
            "\nSexo: "+f.getSexo()+
            "\n"+
            "\nSaldo: "+f.obterSaldo());
    
        
    }
    
}
