
import javax.swing.JOptionPane;


/**
 *
 * @author Orllando Jr
 */
public class Main {

    public static void main(String[] args) {

        CartaoWeb[] card = new CartaoWeb[3];
        DiaDosNamorados namorados = new DiaDosNamorados("");
        Natal natal = new Natal("");
        Aniversario niver = new Aniversario("");

        card[0] = namorados;
        card[1] = natal;
        card[2] = niver;

        
        for (int i = 0; i < card.length; i++) {
            String remetente = JOptionPane.showInputDialog("Remetente: ");

            JOptionPane.showMessageDialog(null, card[i].retornarMensagem(remetente));
        }
    }

}
