package main;
import javax.swing.JOptionPane;
/**
 *
 * @author Orlando Jr
 */
public class Main {
    

    public static void main(String[] args) {
        
       String nome = JOptionPane.showInputDialog(null,"Qual o seu nome?","CADASTRO USUÁRIO",JOptionPane.PLAIN_MESSAGE);
       String id = JOptionPane.showInputDialog(null,"Qual sua idade?","CADASTRO USUÁRIO",JOptionPane.PLAIN_MESSAGE);
       int idade = Integer.parseInt(id);
       if (idade >= 18) {
           JOptionPane.showMessageDialog(null, nome + " você já pode tirar a CNH!","WARNING",JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, nome + " você ainda não pode tirar a CNH, você tem apenas "+idade+" anos!","WARNING",JOptionPane.WARNING_MESSAGE);
       }
        
    }
    
}
