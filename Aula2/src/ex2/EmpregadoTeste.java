package ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class EmpregadoTeste {
    
    public static void main(String args[]){
        
    Empregado p = new Empregado(null, null, 0, 0, 0);
    
    p.setNome(JOptionPane.showInputDialog(null, "Digite o nome: ","FUNCIONÁRIO",JOptionPane.PLAIN_MESSAGE));
    p.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ","FUNCIONÁRIO",JOptionPane.PLAIN_MESSAGE)));
    p.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ","FUNCIONÁRIO",JOptionPane.PLAIN_MESSAGE)));
    p.setSexo(JOptionPane.showInputDialog(null, "Digite o sexo: ","FUNCIONÁRIO",JOptionPane.PLAIN_MESSAGE));
    p.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario: ","FUNCIONÁRIO",JOptionPane.PLAIN_MESSAGE)));
    
    JOptionPane.showMessageDialog(null, "FUNCIONÁRIO\n"+
            "Nome :"+p.getNome()+
            "\nIdade :"+p.getIdade()+
            "\nAltura :"+p.getAltura()+
            "\nSexo :"+p.getSexo()+
            "\nSalario :"+p.getSalario()+
            "\n"+
            "\nLucro :"+p.obterLucros());
    
    }
}
