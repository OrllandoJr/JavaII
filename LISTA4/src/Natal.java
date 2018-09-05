/**
 *
 * @author Orllando Jr
 */
public class Natal extends CartaoWeb{

    public Natal(String destinatario) {
        this.destinatario = destinatario;
    }
   
    @Override
    public String retornarMensagem(String remetente) {
        return destinatario + "\nFeliz Natal!!!\nDeus Abençoe-o.\nAss "+remetente;
    }
    
}
