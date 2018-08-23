package ex1;
import javax.swing.JOptionPane;
/**
 *
 * @author Orlando
 */
public class CockerTeste {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cocker c1 = new Cocker(true, null, null, null, null);
        

        c1.setTipo("CACHORRO");
        JOptionPane.showMessageDialog(null,"CACHORRO");
        c1.setCor(JOptionPane.showInputDialog("Digite a cor do cachorro:"));
        c1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do cachorro:"));
        c1.setRaça(JOptionPane.showInputDialog("Digite a raça do cachorro:"));
        
        String tos = JOptionPane.showInputDialog(null, "Deseja fazer tosa?","S/N");
        
                   
        if (tos == "S"){
           c1.setTosa(true); 
        }else
            if (tos == "N"){
                c1.setTosa(false);
            }
             
        boolean t;
        String ts = null;
        t = c1.precisaTosa();
        if (t == false){
            ts = "Não, obrigado!";
        }else
            if (t == true){
                ts = "Sim, por favor!";
            }
        
        JOptionPane.showMessageDialog(null,
                "Tipo:  "+
                c1.getTipo()+"\nNome:  "
                        +c1.getNome()+"\nCor:  "
                        +c1.getCor()+"\nRaça:  "
                        +c1.getRaça()+"\nTosar:  "
                        +ts);
  
    }
    
}