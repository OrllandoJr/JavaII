
import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class main {
    
    public static void main (String []args){
        
        Ligacao lig = new Ligacao(true, true, true, true, true, null, null, null, true, 0);

        lig.setCor("Preto");
        lig.setComFio(true);
        lig.setTamanhoFio(2);
        lig.setPrePago(false);
        lig.setOperadora("Vivo");
        lig.setIdentificador(true);
        lig.setRecado(false);
        lig.setGravar(true);
        lig.setEspera(true);
        
        JOptionPane.showMessageDialog(null,
                        "TELEFONE  "
                        +"\n"
                        +"\nCARACTERISTICAS"
                        +"\n"
                        +"COR: "+ lig.getCor()
                        +"\nPré Pago: "+lig.getPrePago()
                        +"\nOperadora: "+lig.getOperadora()
                        +"\n"        
                        +"\nFUNÇÕES"
                        +"\n"
                        +"Identificador: "+lig.getIdentificador()
                        +"\nRecado: "+lig.getRecado()
                        +"\n"
                        +"\nOPÇÕES DURANTE A CHAMADA"
                        +"\n"
                        +"Gravar Chamada: "+lig.getGravar()
                        +"\nModo Espera: "+lig.getEspera()
        );
    
    }
}
    
